package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City
 *
 */
public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * This initializes obtains the city and province name and city
     * @param city
     *  This is the city name that the user provides
     * @param province
     *  This is the province name for that city that the user provides
     *
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Gets the name of the city
     * @return
     *  Returns the name of the city in this city object
     * */
    String getCityName(){
        return this.city;
    }

    /**
     * Gets the name of the province
     * @return
     *  Returns the name of the province in this city object
     * */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Makes the comparison so that it compares the city name, not the entire object
     * @param o
     *  This is the city object to compare
     * @return
     *  Returns the thing to compare as being the city name of the city object
     * */
    @Override
    public int compareTo(City o) {
        City city = (City) o;

        return this.city.compareTo(city.getCityName());
    }

    /**
     * See if the city object given is the same as this city object.
     * The two objects are considered equal if they have the same province name and city name
     * @param o
     *  This is the city object to test if it equals
     * @return
     *  Returns the if the province and city name of the city given is the same as this object province and city name
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        return this.city.equals(city.city) &&
                this.province.equals(city.province);
    }

    /**
     * This Makes the hash of the object be a constant as javas equals requires the hash to be the same
     * @return
     *  returns the new hash
     * */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

}
