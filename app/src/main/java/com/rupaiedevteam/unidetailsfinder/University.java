package com.rupaiedevteam.unidetailsfinder;

/**
 * Created by Sarker Rabi on 18-01-18.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {

    private List<University_> university = null;
    private Integer success;
    private String message;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public University() {
    }

    /**
     *
     * @param message
     * @param university
     * @param success
     */
    public University(List<University_> university, Integer success, String message) {
        super();
        this.university = university;
        this.success = success;
        this.message = message;
    }

    public List<University_> getUniversity() {
        return university;
    }

    public void setUniversity(List<University_> university) {
        this.university = university;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}