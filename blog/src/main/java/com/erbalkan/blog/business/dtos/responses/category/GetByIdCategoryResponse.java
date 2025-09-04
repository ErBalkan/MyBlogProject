package com.erbalkan.blog.business.dtos.responses.category;

import java.util.List;

import com.erbalkan.blog.core.entities.BaseDto;
import com.erbalkan.blog.entities.concretes.Post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GetByIdCategoryResponse implements BaseDto{
    private String name;
    private List<Post> posts;
}
