package com.quintech.app.jsons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    private Long userId;
    private Long id;
    private String title;
    private String body;

    public Post(Long id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
}
