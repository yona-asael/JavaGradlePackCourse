package com.quintech.app.patrons;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitSingle {
    
    private static Retrofit instance;

    public RetrofitSingle() {}

    public static Retrofit getInstance() {
        if((RetrofitSingle.instance == null)) {
            RetrofitSingle.instance = RetrofitSingle.createInstance();
        }
        return RetrofitSingle.instance;
    }


    private static Retrofit createInstance() {
        return new Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(JacksonConverterFactory.create())
        .build();
    }
}
