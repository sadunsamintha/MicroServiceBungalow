package com.web.client;



import java.util.List;

public interface BungalowRepository {

    List<Bungalow> getAllBungalows() throws Exception ;
    Bungalow getBungalow(String name);
    
   
}
