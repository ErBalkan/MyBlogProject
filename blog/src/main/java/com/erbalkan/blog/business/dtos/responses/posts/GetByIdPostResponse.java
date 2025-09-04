package com.erbalkan.blog.business.dtos.responses.posts;

import java.time.LocalDateTime;

import com.erbalkan.blog.core.entities.BaseDto;
import com.erbalkan.blog.entities.concretes.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetByIdPostResponse implements BaseDto {
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Category category;
}
