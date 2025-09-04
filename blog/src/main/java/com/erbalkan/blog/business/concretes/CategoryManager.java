package com.erbalkan.blog.business.concretes;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.erbalkan.blog.business.abstracts.CategoryService;
import com.erbalkan.blog.business.mapping.CategoryMapper;
import com.erbalkan.blog.core.entities.BaseDto;
import com.erbalkan.blog.core.utilities.resultPattern.Result;
import com.erbalkan.blog.dataAccess.CategoryRepository;
import com.erbalkan.blog.entities.concretes.Category;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryManager implements  CategoryService{
    
    private final CategoryRepository _categoryRepository;
    private final CategoryMapper _mapper;


    @Override
    public Result<BaseDto> add(BaseDto data) {
        Category category = _mapper.toEntity(data);
        _categoryRepository.save(category);
        return Result.success("Başarıyla eklendi.");
    }

    @Override
    public Result<BaseDto> update(BaseDto data) {
        Category category = _mapper.toEntity(data);
        _categoryRepository.save(category);
        return Result.success("Başarıyla güncelle.");
    }

    @Override
    public Result<BaseDto> delete(UUID id) {
        _categoryRepository.deleteById(id);
        return Result.success("Başarıyla silindi.");
    }

    @Override
    public Result<List<BaseDto>> getAll() {
        List<Category> categories = _categoryRepository.findAll();
        List<BaseDto> result = _mapper.toDtoList(categories);
        return Result.success(result, "Başarıyla listelendi.");
    }

    @Override
    public Result<BaseDto> getById(UUID id) {
        Optional<Category> category = _categoryRepository.findById(id);
        return Result.success(_mapper.toDto(category.get()), "Başarıyla getirildi.");
    }

}
