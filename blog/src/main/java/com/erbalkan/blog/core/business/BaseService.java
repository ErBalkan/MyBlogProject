package com.erbalkan.blog.core.business;

import java.util.List;
import java.util.UUID;

import com.erbalkan.blog.core.entities.BaseDto;
import com.erbalkan.blog.core.utilities.resultPattern.Result;

public interface BaseService<T extends BaseDto> {

    Result<T> add(T data);
    Result<T> update(T data);
    Result<T> delete(UUID id);
    Result<List<T>> getAll();
    Result<T> getById(UUID id);
}
