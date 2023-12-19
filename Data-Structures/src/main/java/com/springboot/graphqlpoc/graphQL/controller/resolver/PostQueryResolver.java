package com.springboot.graphqlpoc.graphQL.controller.resolver;

import com.springboot.graphqlpoc.graphQL.model.dto.PostContentDTO;
import com.springboot.graphqlpoc.graphQL.service.PostService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostQueryResolver implements GraphQLQueryResolver {
    private final PostService service;

    @Autowired
    public PostQueryResolver(PostService service) {
        super();
        this.service = service;
    }

    public PostContentDTO getPosts(Long postId) {
        return service.getPosts(postId);
    }

    public PostContentDTO allPosts(){
        return service.allPosts();
    }
}
