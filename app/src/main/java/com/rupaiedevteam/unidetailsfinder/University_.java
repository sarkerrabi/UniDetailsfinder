package com.rupaiedevteam.unidetailsfinder;

/**
 * Created by Sarker Rabi on 19-01-18.
 */

import java.util.HashMap;
import java.util.Map;

public class University_ {

    private String unicode;
    private String name;
    private String address;
    private String logoPath;
    private String unilink;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public University_() {
    }

    /**
     *
     * @param unilink
     * @param address
     * @param name
     * @param unicode
     * @param logoPath
     */
    public University_(String unicode, String name, String address, String logoPath, String unilink) {
        super();
        this.unicode = unicode;
        this.name = name;
        this.address = address;
        this.logoPath = logoPath;
        this.unilink = unilink;
    }

    public String getUnicode() {
        return unicode;
    }

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getUnilink() {
        return unilink;
    }

    public void setUnilink(String unilink) {
        this.unilink = unilink;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}