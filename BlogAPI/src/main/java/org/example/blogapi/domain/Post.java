package org.example.blogapi.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Post {

    @NotBlank
    private String title;
    @NotBlank
    private String content;
    @NotBlank
    private String category;
    @NotEmpty
    private List<String> tags;

}
