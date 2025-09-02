package com.erbalkan.blog.webApi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erbalkan.blog.business.abstracts.CategoryService;
import com.erbalkan.blog.core.webApi.controller.BaseController;
import com.erbalkan.blog.entities.concretes.Category;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController extends BaseController<Category>{

    public CategoriesController(CategoryService categoryService) {
        super(categoryService);
    }

}
