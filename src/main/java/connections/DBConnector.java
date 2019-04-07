package connections;


import models.Feature;
import models.ExposedAreas;
import connections.SqlScriptCreator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hallur
 */
public class DBConnector {

    Connection con;

    public void connect(String url, String userName, String password) {
        try {
            con = DriverManager.getConnection(
                    url, userName, password);

            Statement stmt = con.createStatement();

            SqlScriptCreator ssc = new SqlScriptCreator();

            stmt.execute("drop schema if exists exposedAreas;");
            stmt.execute("create schema exposedAreas;");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void executeQuery(ExposedAreas exposedAreas) {
        try {
            Statement stmt = con.createStatement();

            stmt.execute("create table exposedAreas.general_information("
                    + "id int not null auto_increment,"
                    + "type varchar(100),"
                    + "totalFeatures int,"
                    + "crsType varchar(45),"
                    + "crsPropertyName varchar(500),"
                    + "PRIMARY KEY(id)"
                    + ")");

            stmt.execute("create table exposedAreas.property("
                    + "id int not null,"
                    + "byomraade varchar(50),"
                    + "delomraade varchar(50),"
                    + "m2 int,"
                    + "PRIMARY KEY(id)"
                    + ")");

            stmt.execute("create table exposedAreas.geolocations("
                    + "id int not null auto_increment,"
                    + "type varchar(40),"
                    + "lattitude FLOAT(7,4),"
                    + "longitude FLOAT(7,4),"
                    + "PRIMARY KEY(id)"
                    + ")");

            stmt.execute("insert into exposedAreas.general_information(type, totalFeatures, crsType, crsPropertyName)values("
                    + "'" + exposedAreas.getType() + "', "
                    + exposedAreas.getTotalFeatures() + ", "
                    + "'" + exposedAreas.getCrs().getType() + "', "
                    + "'" + exposedAreas.getCrs().getProperties().getName() + "');");
            Feature[] features = exposedAreas.getFeatures();
            for (int i = 0; i < features.length; i++) {
                stmt.execute("insert into exposedAreas.property()values("
                        + "" + features[i].getProperties().getId() + ","
                        + "'" + features[i].getProperties().getByomraade() + "',"
                        + "'" + features[i].getProperties().getDelomraade() + "',"
                        + features[i].getProperties().getM2()
                        + ")");
            }
            for (int i = 0; i < features.length; i++) {
                String type = features[i].getType();
     
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
