package com.io.rest.joblisting.controller;

import com.io.rest.joblisting.model.Post;
import com.io.rest.joblisting.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void redirectToSwagger(HttpServletResponse response) throws IOException
    {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAll()
    {
        return postService.getAll();
    }

    @GetMapping("/post/{id}")
    public Optional<Post> getAll(@PathVariable String id)
    {
        return postService.getById(id);
    }

    @PostMapping("post")
    public Post addPost(@RequestBody Post post)
    {
        return postService.newPost(post);
    }

    @PatchMapping("post/{id}")
    public Post updatePost(@RequestBody Post post, @PathVariable String id)
    {
        return postService.updatePostById(post, id);
    }

    @DeleteMapping("/post/{id}")
    public String deletePost(@PathVariable String id)
    {
       return  postService.deletePostById(id);
    }
}
