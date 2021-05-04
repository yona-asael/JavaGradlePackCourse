package com.quintech.app.Mappers;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeToken;

public class Mapper {
    public static ObjectMapper objectMapper = new ObjectMapper();
    public static Gson gson = new Gson();
    public static ModelMapper mapper = new ModelMapper();
    public static XmlMapper xmlMapper = new XmlMapper();



    public  <S , D> void addMappings(PropertyMap<S, D> propertyMap){
        mapper.addMappings(propertyMap);
    }

    public void emptyMappings(){
        mapper = new ModelMapper(); 
    }

    public  <T, R>  R mapTo(T data, TypeToken<R> type){
        return mapper.map(data, type.getType());
    }

    public <T> String convertToJsonJackson(T data) throws JsonProcessingException{
        return objectMapper.writeValueAsString(data);
    }

    public <R> R convertJsonJToObject(String json, TypeReference<R> type) throws JsonMappingException, JsonProcessingException{
        return objectMapper.readValue(json, type);	
    }

    public <T> String convertToJsonGson(T data){
        return gson.toJson(data);
    }

    public <R> R convertJsonGToObject(String json, TypeToken<R> type){
        return gson.fromJson(json, type.getType());
    }

    public <T> String parsear(T data) throws JsonProcessingException{
        return xmlMapper.writeValueAsString(data);
    }
}
