/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallur
 */
public class Coordinates {
    private int latitude;
    private int longitude;

    public Coordinates(int latitude, int longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    
    
    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    
    
}
