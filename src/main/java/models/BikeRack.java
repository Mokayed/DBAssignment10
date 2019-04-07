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
public class BikeRack {
    private String type;
    private int totalFeature;
    private BikeFeature[] features;
    private Crs crs;

    public BikeRack(String type, int totalFeature, BikeFeature[] features, Crs crs) {
        this.type = type;
        this.totalFeature = totalFeature;
        this.features = features;
        this.crs = crs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalFeature() {
        return totalFeature;
    }

    public void setTotalFeature(int totalFeature) {
        this.totalFeature = totalFeature;
    }

    public BikeFeature[] getFeatures() {
        return features;
    }

    public void setFeatures(BikeFeature[] features) {
        this.features = features;
    }

    public Crs getCrs() {
        return crs;
    }

    public void setCrs(Crs crs) {
        this.crs = crs;
    }

    @Override
    public String toString() {
        return "BikeRack{" + "type=" + type + ", totalFeature=" + totalFeature + ", features=" + features + ", crs=" + crs + '}';
    }
    
}
