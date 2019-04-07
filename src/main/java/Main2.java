
import connections.GeoJsonData;
import models.Trees;
import java.io.IOException;
import java.net.MalformedURLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MoK
 */
public class Main2 {

    public static void main(String[] args) throws MalformedURLException, IOException {
        GeoJsonData g = new GeoJsonData();
        Trees ea = g.gettreeData("http://wfs-kbhkort.kk.dk/k101/ows?service=WFS&version=1.0.0&request=GetFeature&typeName=k101:gadetraer&maxFeatures=50&outputFormat=application%2Fjson");
        System.out.println(ea.getType());

    }
}
