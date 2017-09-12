package com.bungalow.services;


import com.bungalow.model.Bungalow;

import java.util.List;

public interface BungalowService {

    void addBungalow(Bungalow bungalow);
	List<Bungalow> getAllBungalows();
	Bungalow updateBungalow(Bungalow bungalow);
	List<Bungalow> findBungalow(String name);
	String deleteBungalow(Bungalow bungalow);
	List<Bungalow> removeByName(String name);
}