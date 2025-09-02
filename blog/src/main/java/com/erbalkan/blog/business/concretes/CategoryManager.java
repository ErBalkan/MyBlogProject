package com.erbalkan.blog.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erbalkan.blog.business.abstracts.CategoryService;
import com.erbalkan.blog.core.utilities.resultPattern.Result;
import com.erbalkan.blog.dataAccess.CategoryRepository;
import com.erbalkan.blog.entities.concretes.Category;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryManager implements  CategoryService{

    private final CategoryRepository _categoryRepository;

    @Override
    public Result<Category> add(Category data) {
        _categoryRepository.save(data);
        return Result.success("Kategori başarıyla eklendi.");
    }

    @Override
    public Result<Category> update(Category data) {
        _categoryRepository.save(data);
        return Result.success("Kategori başarıyla güncellendi.");
    }

    @Override
    public Result<Category> delete(int id) {
        _categoryRepository.deleteById(id);
        return Result.success("Kategori başarıyla silindi.");
    }

    @Override
    public Result<List<Category>> getAll() {
        List<Category> data = _categoryRepository.findAll();
        return Result.success(data, "Kategoriler listelendi.");
    }

    @Override
    public Result<Category> getById(int id) {
        Optional<Category> data = _categoryRepository.findById(id);
        return Result.success(data.get(), "Kategori getirildi.");
    }

}
