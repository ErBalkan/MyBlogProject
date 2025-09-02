package com.erbalkan.blog.business.dtos.responses.category;

import java.util.List;

import com.erbalkan.blog.entities.concretes.Post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class GetAllCategoryResponse {
    private String name;
    private List<Post> posts;
}
