package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 *
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *  This is a candidate city to add
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }

        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     *  Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This method checks if a city is present in the list
     * @param city
     *  This is the city to check if it exists
     * @return
     *  Boolean True or false. true if the city exists, false if it doesn't
     */
    public boolean hasCity(City city){
        for (int i = 0; i < cities.size(); i++){
            if (cities.get(i).equals(city)){
                return true;
            }
        }
        return false;
    }

    /**
     * This method checks if a city is present in the list and if it does, delete it
     * @param city
     *  This is the city to delete
     */
    public void delete(City city){
        boolean doesExist = hasCity(city);

        if (!doesExist){
            throw new IllegalArgumentException();
        } else {
            cities.remove(city);
        }

    }

    /**
     * This method determines how many cities are in the list
     * @return
     *  Integer of how many cities are in the list
     */
    public int countCities(){
        return cities.size();
    }
}
