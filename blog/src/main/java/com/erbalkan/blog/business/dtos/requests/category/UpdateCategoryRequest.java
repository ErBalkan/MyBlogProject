package com.erbalkan.blog.business.dtos.requests.category;

import com.erbalkan.blog.core.entities.BaseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UpdateCategoryRequest implements BaseDto {
    private String name;
}
