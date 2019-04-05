
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallur
 */
class Geometry {
    private String type;
    ArrayList<List<List<List<Double>>>> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<List<List<List<Double>>>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(ArrayList<List<List<List<Double>>>> coordinates) {
        this.coordinates = coordinates;
    }

    public Geometry(String type, ArrayList<List<List<List<Double>>>> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Geometry{" + "type=" + type + ", coordinates=" + coordinates + '}';
    }
    
    
    
}
