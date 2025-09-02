package com.erbalkan.blog.webApi.controllers;


import com.erbalkan.blog.business.abstracts.PostService;
import com.erbalkan.blog.core.webApi.controller.BaseController;
import com.erbalkan.blog.entities.concretes.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostsController extends BaseController<Post> {

    public PostsController(PostService postService){
        super(postService);
    }


}
