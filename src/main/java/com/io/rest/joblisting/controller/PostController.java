package com.io.rest.joblisting.controller;

import com.io.rest.joblisting.model.Post;
import com.io.rest.joblisting.service.PostServiceImpl;
import com.io.rest.joblisting.validation.PostValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PostController {
    private final PostServiceImpl postService;

    @Autowired
    public PostController(PostServiceImpl postService) {
        this.postService = postService;
    }

    @ApiIgnore
    @GetMapping("/")
    public void redirectToSwagger(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAll() {
        return postService.getAll();
    }

    @GetMapping("/post/{id}")
    public Optional<Post> getById(@PathVariable String id) {
        return postService.getById(id);
    }

    @PostMapping("post")
    public ResponseEntity<?> addPost(@RequestBody Post post) {
        if (!PostValidator.isValidPost(post)) {
            // Return a custom error response with appropriate message and status code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid post data");
        }

        Post savedPost = postService.newPost(post);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedPost);
    }

    @PatchMapping("post/{id}")
    public ResponseEntity<?> updatePost(@RequestBody Post post, @PathVariable String id) {
        if (!PostValidator.isValidPost(post)) {
            // Return a custom error response with appropriate message and status code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid post data");
        }

        Post updatedPost = postService.updatePostById(post, id);
        return ResponseEntity.ok(updatedPost);
    }

    @DeleteMapping("/post/{id}")
    public ResponseEntity<String> deletePost(@PathVariable String id) {
        String result = postService.deletePostById(id);
        return ResponseEntity.ok(result);
    }
}
