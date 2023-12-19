package com.springboot.graphQL.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public class Author {

    String id;
    String firstName;
    String lastName;

    public static List<Author> authors = Arrays.asList(
            new Author("author-1", "Joanne", "Rowling"),
            new Author("author-2", "Herman", "Melville"),
            new Author("author-3", "Anne", "Rice")
    );

    public static Author getById(String authorId) {
        return authors.stream().filter(author -> author.getId().equals(authorId)
                ).findFirst().orElseThrow(() -> new RuntimeException("Invalid author id"));
    }
}
