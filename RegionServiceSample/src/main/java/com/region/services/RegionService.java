package com.region.services;

import com.region.model.Region;
import java.util.List;


public interface RegionService {

    void addRegion(Region region);
	List<Region> getAllRegions();
	Region updateRegion(Region region);
	Region findRegion(String regionID);

	void deleteRegion(Region region);

	List<Region> findRegionByName(String name);
}