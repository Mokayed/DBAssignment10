package models;


import models.OneListGeometry;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MoK
 */
public class TreeFeature {

    private String type;
    private String id;
    private OneListGeometry geometry;
    private String geometry_name;
    private TreeFeatureProperties properties;

    public TreeFeature(String type, String id, OneListGeometry geometry, String geometry_name, TreeFeatureProperties properties) {
        this.type = type;
        this.id = id;
        this.geometry = geometry;
        this.geometry_name = geometry_name;
        this.properties = properties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OneListGeometry getGeometry() {
        return geometry;
    }

    public void setGeometry(OneListGeometry geometry) {
        this.geometry = geometry;
    }

    public String getGeometry_name() {
        return geometry_name;
    }

    public void setGeometry_name(String geometry_name) {
        this.geometry_name = geometry_name;
    }

    public TreeFeatureProperties getProperties() {
        return properties;
    }

    public void setProperties(TreeFeatureProperties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "TreeFeature{" + "type=" + type + ", id=" + id + ", geometry=" + geometry + ", geometry_name=" + geometry_name + ", properties=" + properties + '}';
    }

      
}
