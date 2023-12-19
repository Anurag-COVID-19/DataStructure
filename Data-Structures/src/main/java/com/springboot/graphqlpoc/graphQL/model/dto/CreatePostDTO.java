package com.springboot.graphqlpoc.graphQL.model.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

//@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreatePostDTO implements Serializable {

    private String postName;
    private String postContent;
    private int noOfLikes;
    private boolean postIdDisplayed;
}
