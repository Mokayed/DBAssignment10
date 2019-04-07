package models;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MoK
 */
public class OneListGeometry {
      private String type;
    ArrayList<Double> coordinates;

    public OneListGeometry(String type, ArrayList<Double> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Double> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<Double> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "TreeGeometry{" + "type=" + type + ", coordinates=" + coordinates + '}';
    }

}
