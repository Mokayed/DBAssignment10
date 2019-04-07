/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author MoK
 */
class ParkFeature {

    private String type;
    private String id;
    private Geometry geometry;
    private String geometry_name;
    private ParkProperties properties;

    public ParkFeature(String type, String id, Geometry geometry, String geometry_name, ParkProperties properties) {
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

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public String getGeometry_name() {
        return geometry_name;
    }

    public void setGeometry_name(String geometry_name) {
        this.geometry_name = geometry_name;
    }

    public ParkProperties getProperties() {
        return properties;
    }

    public void setProperties(ParkProperties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "ParkFeature{" + "type=" + type + ", id=" + id + ", geometry=" + geometry + ", geometry_name=" + geometry_name + ", properties=" + properties + '}';
    }

}
