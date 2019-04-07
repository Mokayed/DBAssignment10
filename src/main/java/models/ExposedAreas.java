package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallur
 */
public class ExposedAreas {
    private String type;
    private int totalFeatures;
    private Feature[] features;
    private Crs crs;

    public ExposedAreas(String type, int totalFeatures, Feature[] Features, Crs crs) {
        this.type = type;
        this.totalFeatures = totalFeatures;
        this.features = Features;
        this.crs = crs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTotalFeatures() {
        return totalFeatures;
    }

    public void setTotalFeatures(int totalFeatures) {
        this.totalFeatures = totalFeatures;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public void setFeatures(Feature[] Features) {
        this.features = Features;
    }

    public Crs getCrs() {
        return crs;
    }

    public void setCrs(Crs crs) {
        this.crs = crs;
    }

    @Override
    public String toString() {
        return "ExposedAreas{" + "type=" + type + ", totalFeatures=" + totalFeatures + ", Features=" + features + ", crs=" + crs + '}';
    }
    
    
}
