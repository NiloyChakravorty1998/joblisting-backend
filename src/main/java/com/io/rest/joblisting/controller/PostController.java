package com.io.rest.joblisting.controller;

import com.io.rest.joblisting.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

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

}
