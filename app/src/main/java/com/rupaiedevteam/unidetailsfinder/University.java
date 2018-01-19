package com.rupaiedevteam.unidetailsfinder;

/**
 * Created by Sarker Rabi on 18-01-18.
 */

import java.util.HashMap;
import java.util.Map;

public class University {

    private String name;
    private String hobby;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public University() {
    }

    /**
     *
     * @param name
     * @param hobby
     */
    public University(String name, String hobby) {
        super();
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}