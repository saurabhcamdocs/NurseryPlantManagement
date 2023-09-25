package com.amdocs.plantmanagement.dao;
import com.amdocs.plantmanagement.exception.PlantNotFoundException;
import java.util.*;

import com.amdocs.plantmanagement.pojos.Plant;


public interface PlantDAO {
	int addPlant(Plant plant);
	int deletePlant(int plantId) throws PlantNotFoundException;
	boolean updatePlantCost(int plantId, double cost) throws PlantNotFoundException;
	List<Plant> showAllPlants();
	List<Plant> searchByOriginCountryName(String originCountryName) throws PlantNotFoundException;
	List<Plant> searchOutdoorPlantsWithSunlight() throws PlantNotFoundException;
	int countPlantsByWaterSupplyFrequency(String waterSupplyFrequency) throws PlantNotFoundException;
}
