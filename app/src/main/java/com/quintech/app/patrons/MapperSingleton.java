package com.quintech.app.patrons;

import com.quintech.app.Mappers.Mapper;

public class MapperSingleton {
    
    private static Mapper instance;

    public MapperSingleton(){}

    public static Mapper getInstance() {
        if((MapperSingleton.instance == null )){
            MapperSingleton.instance = new Mapper();
        }
        return MapperSingleton.instance;
    }
}
