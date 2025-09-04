package com.erbalkan.blog.core.webApi.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.erbalkan.blog.core.business.BaseService;
import com.erbalkan.blog.core.utilities.resultPattern.Result;

public class BaseController<T> {

    private final BaseService<T> _baseService;

    public BaseController(BaseService<T> baseService) {
        _baseService = baseService;
    }

        @GetMapping("/getall")
    public Result<List<T>> getAll(){
        return _baseService.getAll();
    }

    @GetMapping("/{id}")
    public Result<T> getById(@PathVariable UUID id){
        return _baseService.getById(id);
    }

    @PostMapping("/add")
    public Result<T> add(@RequestBody T entity){
        return _baseService.add(entity);
    }

    @PutMapping("/update")
    public Result<T> update(@RequestBody T entity){
        return _baseService.update(entity);
    }

    @DeleteMapping("/{id}")
    public Result<T> delete(@PathVariable UUID id){
        return _baseService.delete(id);
    }
}
