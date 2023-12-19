package com.springboot.graphqlpoc.graphQL.service;

import com.springboot.graphqlpoc.graphQL.model.Post;
import com.springboot.graphqlpoc.graphQL.model.dto.CreatePostDTO;
import com.springboot.graphqlpoc.graphQL.model.dto.PostContentDTO;

public interface PostService {
    PostContentDTO getPosts(Long postId);
    PostContentDTO allPosts();
    Post createPost(CreatePostDTO post);
    void deletePost(Long postId);
}
