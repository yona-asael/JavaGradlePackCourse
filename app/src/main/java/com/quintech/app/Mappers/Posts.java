package com.quintech.app.Mappers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Posts {
    public Posts() {
	}
	private int userId;
    private int id;
    private String title;
    private String body;
}
