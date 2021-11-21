package com.example.postgretest.service;

import com.example.postgretest.entity.PostEntity;
import com.example.postgretest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostRepository postRepository;

    //List Post
    @Override
    public List<PostEntity> getPosts() {
        return (List<PostEntity>) postRepository.findAll();
    }

    @Override
    public void savePost(PostEntity postEntity) {

        PostEntity post = postRepository.save(postEntity);
    }


}
