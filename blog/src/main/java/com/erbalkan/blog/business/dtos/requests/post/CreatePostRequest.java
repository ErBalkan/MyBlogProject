package com.erbalkan.blog.business.dtos.requests.post;

import java.time.LocalDateTime;

import com.erbalkan.blog.core.entities.BaseDto;
import com.erbalkan.blog.entities.concretes.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostRequest implements BaseDto{
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private Category category;
}
