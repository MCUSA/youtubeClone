package com.programming.techie.youtubeclone.model;

import org.springframework.data.annotation.Id;

public class Comment {
    @Id
    private String id;
    private String text;
    private String authorId;
    private Integer likeCount;
    private Integer dislikeCount;
}
