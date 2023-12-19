package com.springboot.graphqlpoc.graphQL.service.impl;

import com.springboot.graphqlpoc.graphQL.model.Post;
import com.springboot.graphqlpoc.graphQL.model.dto.CreatePostDTO;
import com.springboot.graphqlpoc.graphQL.model.dto.PostContentDTO;
import com.springboot.graphqlpoc.graphQL.model.dto.PostDTO;
import com.springboot.graphqlpoc.graphQL.repository.PostRepository;
import com.springboot.graphqlpoc.graphQL.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository repository;
    private final ModelMapper mapper;

    public PostServiceImpl(PostRepository repository, ModelMapper mapper) {
        this.repository=repository;
        this.mapper=mapper;
    }

    @Override
    public PostContentDTO getPosts(Long postId) {
        PostContentDTO dto = new PostContentDTO();
        Optional<Post> post = repository.findById(postId);
        if (post.isEmpty()) {
            throw new RuntimeException("Unable to find the given post id {} :"+postId);
        }
        PostDTO postDTO = this.mapper.map(post.get(), PostDTO.class);
        List<PostDTO> postDTOs = Collections.singletonList(postDTO);
        dto.setPosts(postDTOs);
        dto.setTotalRecord(1);
        dto.setStatusCode(HttpStatus.FOUND.value());
        return dto;
    }

    @Override
    public PostContentDTO allPosts() {
        PostContentDTO dto = new PostContentDTO();
        List<Post> posts = repository.findAll();
        List<PostDTO> postDTOs = new ArrayList<>();
        posts.forEach(post -> postDTOs.add(this.mapper.map(post, PostDTO.class)));
        dto.setPosts(postDTOs);
        dto.setTotalRecord(posts.size());
        dto.setStatusCode(HttpStatus.FOUND.value());
        return dto;
    }

    @Override
    public Post createPost(CreatePostDTO dto) {
        Post post = this.mapper.map(dto, Post.class);
        repository.save(post);
        return post;
    }

    @Override
    public void deletePost(Long postId) {
        Optional<Post> post = repository.findById(postId);
        if (post.isPresent()){
            repository.deleteById(postId);
        } else {
            throw new RuntimeException("Unable to find the given ID: {} "+ postId);
        }
    }
}
