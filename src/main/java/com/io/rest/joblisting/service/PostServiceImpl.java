package com.io.rest.joblisting.service;

import com.io.rest.joblisting.model.Post;
import com.io.rest.joblisting.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService{
    private final PostRepo postRepo;

    @Autowired
    public PostServiceImpl(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public List<Post> getAll() {
        return postRepo.findAll();
    }

    @Override
    public Optional<Post> getById(String id) {
        return postRepo.findById(id);
    }

    @Override
    public Post newPost(Post post) {
        return postRepo.save(post);
    }

    public Post updatePostById(Post post, String id) {
        Optional<Post> existingPostOptional = postRepo.findById(id);
        if (existingPostOptional.isPresent()) {
            Post existingPost = existingPostOptional.get();
            existingPost.setDesc(post.getDesc());
            existingPost.setExperience(post.getExperience());
            existingPost.setTechStack(post.getTechStack());
            existingPost.setProfile(post.getProfile());
            return postRepo.save(existingPost);
        }
        return null;
    }

    @Override
    public String deletePostById(String id) {
        postRepo.deleteById(id);
        return "deleted post with id" +id;
    }
}