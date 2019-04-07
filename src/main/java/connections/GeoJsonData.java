package connections;


import models.ExposedAreas;
import models.Trees;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import models.Parks;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hallur
 */
public class GeoJsonData {

    public ExposedAreas getData(String endpoint) throws ProtocolException, MalformedURLException, IOException {
        String url = endpoint;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        String json = response.toString();
        //print result
        ExposedAreas jsonData = null;
        Gson gson = new Gson();
        jsonData = gson.fromJson(json, ExposedAreas.class);
        return jsonData;
    }

    public Trees gettreeData(String endpoint) throws ProtocolException, MalformedURLException, IOException {
        String url = endpoint;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        String json = response.toString();
        //print result
        Trees jsonData = null;
        Gson gson = new Gson();
        jsonData = gson.fromJson(json, Trees.class);
        return jsonData;
    }
      public Parks getparkData(String endpoint) throws ProtocolException, MalformedURLException, IOException {
        String url = endpoint;

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        String json = response.toString();
        //print result
        Parks jsonData = null;
        Gson gson = new Gson();
        jsonData = gson.fromJson(json, Parks.class);
        return jsonData;
    }
}
