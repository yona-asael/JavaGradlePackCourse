package com.quintech.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import javax.management.modelmbean.ModelMBean;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
 import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.quintech.app.Mappers.Mapper;
import com.quintech.app.Mappers.PostDTO;
import com.quintech.app.Mappers.Posts;

import org.modelmapper.ModelMapper;


public class App {
    public static ObjectMapper objectMapper = new ObjectMapper();
    public static Gson gson = new Gson();
    public static ModelMapper mapper = new ModelMapper();
    public static XmlMapper xmlMapper = new XmlMapper();
    public static void main(String[] args) throws JsonIOException, JsonSyntaxException, JsonParseException, JsonMappingException, IOException  {
        // File file = new File("app/src/main/resources/posts.json");
        // List<Posts> posts = objectMapper.readValue(file, new TypeReference<List<Posts>>(){});
        // List<Posts> posts2 = gson.fromJson(new JsonReader(new FileReader(file)), new TypeToken<List<Posts>>(){}.getType());    
        // Type list = new TypeToken<List<PostDTO>>(){}.getType();
        // List<PostDTO> postDTOJ = mapper.map(posts, list);
        // List<PostDTO> postDTOG = mapper.map(posts2, list);
        // String xml = xmlMapper.writeValueAsString(postDTOJ);
        // String dtoJackson = objectMapper.writeValueAsString(postDTOJ);
        // String dtoGson = gson.toJson(postDTOG);
        // System.out.println();
        Mapper mapper = new Mapper();
        // mapper.addMappings();
        // mapper.emptyMappings();
        // mapper.mapTo(data, type);
        // mapper.convertToJsonJackson(data);
        // mapper.convertJsonJToObject(json, type);
        // mapper.convertToJsonGson(data);
        // mapper.convertJsonGToObject(json, type);
        // mapper.parsear(data);
    }
}


// File file = new File("app/src/app/resources/posts.json");
// try{
//     ObjectMapper objectMapper = new ObjectMapper(); 
//     List<Posts> posts = objectMapper.readValue(file, new TypeReference<List<Posts>>(){});
//     Posts post = objectMapper.readValue(posts, Posts.class);
//     System.out.println(post.toString());
// }catch (IOException e){
//     e.printStackTrace();
// }

//     File fileg = new File("app/src/app/resources/postOne.json");
//     Gson gson = new Gson();
//     System.out.println(gson.toJson(fileg));
//     File fileg2 = gson.fromJson(fileg, Posts.class);
//     System.out.println(fileg2.toString());


//     // Posts posts = new Posts();
//     ModelMapper mapper = new ModelMapper();
//     PostDTO postDTO = mapper.map(posts, PostDTO.class);
//     System.out.println(postDTO.toString());
    
    
//     XmlMapper xmlMapper = new XmlMapper();
//     String xml = xmlMapper.writeValueAsString(postDTO);