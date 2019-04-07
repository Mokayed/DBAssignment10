
import com.google.gson.Gson;
import connections.DBConnector;
import connections.GeoJsonData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import models.ExposedAreas;
import models.Feature;
import models.Trees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hallur
 */
public class MainExercise1 {

    public static void main(String[] args) throws MalformedURLException, IOException {

        GeoJsonData g = new GeoJsonData();
        ExposedAreas ea = g.getData("http://wfs-kbhkort.kk.dk/k101/ows?service=WFS&version=1.0.0&request=GetFeature&typeName=k101:f_udsatte_byomraader&maxFeatures=50&outputFormat=application%2Fjson");
        Trees t = g.gettreeData("http://wfs-kbhkort.kk.dk/k101/ows?service=WFS&version=1.0.0&request=GetFeature&typeName=k101:gadetraer&maxFeatures=50&outputFormat=application%2Fjson");
        System.out.println(ea.getType());

        DBConnector c = new DBConnector();
        c.connect("jdbc:mysql://localhost:3306", "root", "123");
        c.createSomeTables();
        c.executeQuery(ea, t);

        Feature[] features = ea.getFeatures();

    }
}