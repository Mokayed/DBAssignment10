package models;


import models.CrsProperty;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallur
 */
public class Crs {
    private String type;
    private CrsProperty properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CrsProperty getProperties() {
        return properties;
    }

    public void setProperties(CrsProperty properties) {
        this.properties = properties;
    }

    public Crs(String type, CrsProperty properties) {
        this.type = type;
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Crs{" + "type=" + type + ", properties=" + properties + '}';
    }
    
    
}
