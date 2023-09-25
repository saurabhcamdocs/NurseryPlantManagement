package com.amdocs.plantmanagement.dao;
import com.amdocs.plantmanagement.exception.PlantNotFoundException;
import java.util.*;

import com.amdocs.plantmanagement.pojos.Plant;


public class PlantDAOImpl implements PlantDAO {
	List<Plant> Plants= new ArrayList<>();

	@Override
	public int addPlant(Plant plant) {
		Plants.add(plant);
		return plant.getPlantId();
	}

	@Override
	public int deletePlant(int plantId) throws PlantNotFoundException {
		for(Plant plant:Plants)
		{
			if(plant.getPlantId()==plantId)
			{
				Plants.remove(plant);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public boolean updatePlantCost(int plantId, double cost) throws PlantNotFoundException {
		for(Plant plant:Plants)
		{
			if(plant.getPlantId()==plantId)
			{
				plant.setCost(cost);
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Plant> showAllPlants() {
		return Plants;
	}

	@Override
	public List<Plant> searchByOriginCountryName(String originCountryName) throws PlantNotFoundException {
		List<Plant> tempList = new ArrayList<>();
		for(Plant plant:Plants)
		{
			if(plant.getOriginCountryName().equals(originCountryName))
			{
				System.out.println(plant);
				tempList.add(plant);
			}
		}
		return tempList;
	}

	@Override
	public List<Plant> searchOutdoorPlantsWithSunlight() {
		List<Plant> tempList = new ArrayList<>();
		for(Plant plant:Plants)
		{
			if(plant.isSunlightRequired() && plant.getPlantType().equals("outdoor")) //is true if sunlight is required and type is "outdoor"
			{
				tempList.add(plant);
			}
		}
		return tempList;
	}

	@Override
	public int countPlantsByWaterSupplyFrequency(String waterSupplyFrequency) {
		int count = 0;
		for(Plant plant:Plants)
		{
			if(plant.getWaterSupplyFrequency().equals(waterSupplyFrequency))
				count++;
		}
		return count;
	}
}
