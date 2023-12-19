package com.springboot.graphqlpoc.graphQL.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO implements Serializable {
    private Long id;
    private String name;
    private String content;
    private String noOfLikes;
    private boolean isDisplay;
    private List<PostCommentDTO> comment;
}
