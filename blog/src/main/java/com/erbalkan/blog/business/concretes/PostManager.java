package com.erbalkan.blog.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.erbalkan.blog.business.abstracts.PostService;
import com.erbalkan.blog.core.utilities.resultPattern.Result;
import com.erbalkan.blog.dataAccess.PostRepository;
import com.erbalkan.blog.entities.concretes.Post;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostManager implements PostService{

    private final PostRepository _postRepository;

    @Override
    public Result add(Post data) {
        _postRepository.save(data);
        return Result.success("Post başarıyla eklendi.");
    }

    @Override
    public Result update(Post data) {
        _postRepository.save(data);
        return Result.success("Post başarıyla güncellendi.");
    }

    @Override
    public Result delete(int id) {
        _postRepository.deleteById(id);
        return Result.success("Post başarıyla silindi.");
    }

    @Override
    public Result<List<Post>> getAll() {
        List<Post> data = _postRepository.findAll();
        return Result.success(data, "Postlar listelendi.");
    }

    @Override
    public Result<Post> getById(int id) {
        Optional<Post> data = _postRepository.findById(id);
        return Result.success(data.get(), "Post getirildi.");
    }

}
