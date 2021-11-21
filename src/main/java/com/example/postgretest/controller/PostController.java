package com.example.postgretest.controller;

import com.example.postgretest.entity.PostEntity;
import com.example.postgretest.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "/posts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getPosts(){

        return ResponseEntity.ok(postService.getPosts());
    }
    @PostMapping(value = "/postsave", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> savePost(@RequestBody PostEntity postEntity){
        this.postService.savePost(postEntity);
        return ResponseEntity.ok(Boolean.TRUE);
    }
}
