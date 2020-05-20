package com.baeldung.cloud.openfeign.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Post {

    private String userId;
    private Long id;
    private String title;
    private String body;

}
