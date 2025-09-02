package com.erbalkan.blog.core.business;

import java.util.List;

import com.erbalkan.blog.core.utilities.resultPattern.Result;

public interface BaseService<T> {

    Result add(T data);
    Result update(T data);
    Result delete(int id);
    Result<List<T>> getAll();
    Result<T> getById(int id);
}
