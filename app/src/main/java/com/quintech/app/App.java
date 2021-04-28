package com.quintech.app;

import com.google.gson.Gson;
import com.quintech.app.Mappers.Car;

public class App {
    public static void main(String[] args)  {
        String json = "{ \"color\" : \"Black\", \"type\" : \"BMW\" }";
        Car car = new Car("BMW", "BLACK");
        Gson gson = new Gson();

        System.out.println(gson.toJson(car));

        Car car2 = gson.fromJson(json, Car.class);
        System.out.println(car2.toString());
    }
}
