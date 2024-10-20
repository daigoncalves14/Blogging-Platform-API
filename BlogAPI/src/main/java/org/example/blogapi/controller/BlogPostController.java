package org.example.blogapi.controller;

import org.example.blogapi.domain.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class BlogPostController {

    @GetMapping
    public List<Post> findAll() {

        Post post = new Post( "title", "content", "category", List.of("tag1", "tag2"));
        Post post2 = new Post( "title2", "content2", "category2", List.of("tag12", "tag22"));
        List<Post> list = new ArrayList<>();
        list.addAll(Arrays.asList(post,post2));
        System.out.println(list);
        return list;
    };
}
