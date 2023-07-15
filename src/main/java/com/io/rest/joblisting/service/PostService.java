package com.io.rest.joblisting.service;

import com.io.rest.joblisting.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {
    List<Post> getAll();
    Optional<Post> getById(String id);
    Post newPost(Post post);
    Post updatePostById(Post post, String id);
    String deletePostById(String id);
}
