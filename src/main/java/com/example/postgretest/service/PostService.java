package com.example.postgretest.service;

import com.example.postgretest.entity.PostEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

    public List<PostEntity> getPosts();

    void savePost(PostEntity postEntity);
}
