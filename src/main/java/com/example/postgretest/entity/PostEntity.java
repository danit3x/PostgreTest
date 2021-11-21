package com.example.postgretest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "posts")
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", unique = true, nullable = false)
    private String Title;

    @Column(name = "content", nullable = false)
    private String Content;

    @Column(name = "image")
    private String Img;

    private String Category;

    private String CreationDate;

    private String UserId;
}
