package com.springboot.graphqlpoc.graphQL.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostContentDTO
{
    private int statusCode;
    private int totalRecord;
    private List<PostDTO> posts;

    @Override
    public String toString() {
        return "PostContentDTO{" +
                "posts=" + posts +
                '}';
    }
}
