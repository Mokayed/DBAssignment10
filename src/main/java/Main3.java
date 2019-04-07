
import connections.GeoJsonData;
import java.io.IOException;
import java.net.MalformedURLException;
import models.Parks;
import models.Trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MoK
 */
public class Main3 {
    public static void main(String[] args) throws MalformedURLException, IOException {
              GeoJsonData g = new GeoJsonData();
        Parks ea = g.getparkData("http://wfs-kbhkort.kk.dk/k101/ows?service=WFS&version=1.0.0&request=GetFeature&typeName=k101:parkregister&maxFeatures=50&outputFormat=application%2Fjson");
        System.out.println(ea.getType());

    }
}
