package com.quintech.app.HTTP;

import java.util.List;

import com.quintech.app.jsons.Post;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface JSONPlaceHolder {
    
    @GET("/posts")
    Call<List<Post>> getAll();

    @GET("/posts/{id}")
    Call<Post> getById(@Path("id") Long id);

    @Headers({
        "Content-type: application/json; charset=UTF-8"
    })
    @POST("/posts")
    Call<Post> create(@Body Post post);
}
