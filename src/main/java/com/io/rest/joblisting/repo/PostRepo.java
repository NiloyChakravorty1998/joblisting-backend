package com.io.rest.joblisting.repo;

import com.io.rest.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post, String> {
}
