
import connections.GeoJsonData;
import java.io.IOException;
import java.net.MalformedURLException;
import models.BikeRack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MoK
 */
public class Main4 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        GeoJsonData g = new GeoJsonData();
        BikeRack ea = g.getbikeData("http://wfs-kbhkort.kk.dk/k101/ows?service=WFS&version=1.0.0&request=GetFeature&typeName=k101:cykelstativ&maxFeatures=50&outputFormat=application%2Fjson");
        System.out.println(ea.getType());

    }
}
