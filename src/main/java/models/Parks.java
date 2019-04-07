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
public class Parks {

    private String type;
    private int totalFeatures;
    private ParkFeature[] features;
    private Crs crs;

    public Parks(String type, int totalFeatures, ParkFeature[] features, Crs crs) {
        this.type = type;
        this.totalFeatures = totalFeatures;
        this.features = features;
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

    public ParkFeature[] getFeatures() {
        return features;
    }

    public void setFeatures(ParkFeature[] features) {
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
        return "Parks{" + "type=" + type + ", totalFeatures=" + totalFeatures + ", features=" + features + ", crs=" + crs + '}';
    }

}
