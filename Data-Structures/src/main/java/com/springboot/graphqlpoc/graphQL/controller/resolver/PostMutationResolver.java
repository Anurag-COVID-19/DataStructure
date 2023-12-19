package com.springboot.graphqlpoc.graphQL.controller.resolver;

import com.springboot.graphqlpoc.graphQL.model.Post;
import com.springboot.graphqlpoc.graphQL.model.dto.CreatePostDTO;
import com.springboot.graphqlpoc.graphQL.service.PostService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostMutationResolver implements GraphQLMutationResolver {
    @Autowired
    private PostService service;

    @Autowired
    private ModelMapper mapper;


    public Post createPost(CreatePostDTO createPostDTO) {
        return service.createPost(createPostDTO);
    }

    public String deletePost(Long postId) {
        service.deletePost(postId);
        return "Delete post by Id : "+ postId;
    }
}
