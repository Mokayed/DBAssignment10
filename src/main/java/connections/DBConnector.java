package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import models.ExposedAreas;
import models.Feature;
import models.TreeFeature;
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
public class DBConnector {

    Connection con;

    public void connect(String url, String userName, String password) {
        try {
            con = DriverManager.getConnection(
                    url, userName, password);

            Statement stmt = con.createStatement();

            SqlScriptCreator ssc = new SqlScriptCreator();

            stmt.execute("drop schema if exists spatialData;");
            stmt.execute("create schema spatialData;");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void createSomeTables() {
        try {

            Statement stmt = con.createStatement();
            stmt.execute("create table spatialData.general_information("
                    + "id int not null auto_increment,"
                    + "type varchar(100),"
                    + "totalFeatures int,"
                    + "crsType varchar(45),"
                    + "crsPropertyName varchar(500),"
                    + "PRIMARY KEY(id)"
                    + ")");

            stmt.execute("create table spatialData.property("
                    + "id int not null,"
                    + "byomraade varchar(50),"
                    + "delomraade varchar(50),"
                    + "m2 int,"
                    + "PRIMARY KEY(id)"
                    + ")");

            stmt.execute("create table spatialData.geolocations("
                    + "id int not null auto_increment,"
                    + "propertyId int,"
                    + "type varchar(40),"
                    + "lattitude Double(40,2),"
                    + "longitude Double(40,2),"
                    + "PRIMARY KEY(id)"
                    + ")");
            stmt.execute("create table spatialData.treeProperties("
                    + "id int not null,"
                    + "                traeart varchar(200),"
                    + "                slaegt varchar(200),"
                    + "                dansk_navn varchar(200),"
                    + "                slaegtsnavn varchar(200),"
                    + "                planteaar int,"
                    + "                plantet_halvaar varchar(200),"
                    + "                garantiperioden_udloeber varchar(200),"
                    + "                plantemetode varchar(200),"
                    + "                ejer varchar(200),"
                    + "                driftsorganisation varchar(200),"
                    + "                driftsplan_navn varchar(200),"
                    + "                driftsaftale_edoc_nr varchar(200),"
                    + "                bemaerkning varchar(1000),"
                    + "                andre_vaekstforhold varchar(1000),"
                    + "                fredet_beskyttet_trae varchar(200),"
                    + "                fredning_edoc_nr varchar(200),"
                    + "                trae_historie varchar(200),"
                    + "                botanisk_interesse varchar(200),"
                    + "                donor varchar(200),"
                    + "                anledning varchar(200),"
                    + "                saerligt_trae varchar(200),"
                    + "                saerlig_trae_bem varchar(1000),"
                    + "                bydelsnavn varchar(200),"
                    + "                fredet_trae_foto varchar(200),"
                    + "                vejstatus int"
                    + ")");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void executeQuery(ExposedAreas exposedAreas, Trees t) {
        try {
            Statement stmt = con.createStatement();

            stmt.execute("create table spatialData.feature("
                    + "id varchar(100),"
                    + "type varchar(40),"
                    + "geometry_name varchar(40),"
                    + "geoId int,"
                    + "propertyId int,"
                    + "PRIMARY KEY(id),"
                    + "FOREIGN KEY (geoId)\n"
                    + "      REFERENCES geolocations(id),"
                    + "FOREIGN KEY (propertyId)\n"
                    + "      REFERENCES property(id)"
                    + ")");

            stmt.execute("ALTER TABLE spatialData.geolocations ADD CONSTRAINT propertyId FOREIGN KEY (propertyId) REFERENCES property(id);");

            stmt.execute("insert into spatialData.general_information(type, totalFeatures, crsType, crsPropertyName)values("
                    + "'" + exposedAreas.getType() + "', "
                    + exposedAreas.getTotalFeatures() + ", "
                    + "'" + exposedAreas.getCrs().getType() + "', "
                    + "'" + exposedAreas.getCrs().getProperties().getName() + "');");
            Feature[] features = exposedAreas.getFeatures();
            TreeFeature[] tFeatures = t.getFeatures();

            stmt.execute("insert into spatialData.general_information(type, totalFeatures, crsType, crsPropertyName)values("
                    + "'" + t.getType() + "', "
                    + t.getTotalFeatures() + ", "
                    + "'" + t.getCrs().getType() + "', "
                    + "'" + t.getCrs().getProperties().getName() + "');");

            for (int i = 0; i < features.length; i++) {
                stmt.execute("insert into spatialData.property()values("
                        + "" + features[i].getProperties().getId() + ","
                        + "'" + features[i].getProperties().getByomraade() + "',"
                        + "'" + features[i].getProperties().getDelomraade() + "',"
                        + features[i].getProperties().getM2()
                        + ");");
            }
            /*
                               + "id int not null,"
                    + "                traeart varchar(45),"
                    + "                slaegt varchar(45),"
                    + "                dansk_navn varchar(45),"
                    + "                slaegtsnavn varchar(45),"
                    + "                planteaar varchar(45),"
                    + "                plantet_halvaar varchar(150),"
                    + "                garantiperioden_udloeber varchar(150),"
                    + "                plantemetode varchar(45),"
                    + "                ejer varchar(45),"
                    + "                driftsorganisation varchar(45),"
                    + "                driftsplan_navn varchar(45),"
                    + "                driftsaftale_edoc_nr varchar(200),"
                    + "                bemaerkning varchar(150),"
                    + "                andre_vaekstforhold varchar(1000),"
                    + "                fredet_beskyttet_trae varchar(45),"
                    + "                fredning_edoc_nr varchar(50),"
                    + "                trae_historie varchar(50),"
                    + "                botanisk_interesse varchar(50),"
                    + "                donor varchar(50),"
                    + "                anledning varchar(50),"
                    + "                saerligt_trae varchar(30),"
                    + "                saerlig_trae_bem varchar(30),"
                    + "                bydelsnavn varchar(50),"
                    + "                fredet_trae_foto varchar(40),"
                    + "                vejstatus int"
             */
            for (int i = 0; i < tFeatures.length; i++) {

                try {
                    tFeatures[i].getProperties().setTraeart(tFeatures[i].getProperties().getTraeart().replace("'", "\""));
                    tFeatures[i].getProperties().setBemaerkning(tFeatures[i].getProperties().getBemaerkning().replace("'", "\""));
                } catch (Exception e) {
                }
                stmt.execute("insert into spatialData.treeProperties()values("
                        + "" + tFeatures[i].getProperties().getId() + ","
                        + "'" + tFeatures[i].getProperties().getTraeart() + "',"
                        + "'" + tFeatures[i].getProperties().getSlaegt() + "',"
                        + "'" + tFeatures[i].getProperties().getDansk_navn() + "',"
                        + "'" + tFeatures[i].getProperties().getSlaegtsnav() + "',"
                        + "" + tFeatures[i].getProperties().getPlanteaar() + ","
                        + "'" + tFeatures[i].getProperties().getPlantet_halvaar() + "',"
                        + "'" + tFeatures[i].getProperties().getGarantiperioden_udloeber() + "',"
                        + "'" + tFeatures[i].getProperties().getPlantemetode() + "',"
                        + "'" + tFeatures[i].getProperties().getEjer() + "',"
                        + "'" + tFeatures[i].getProperties().getDriftsorganisation() + "',"
                        + "'" + tFeatures[i].getProperties().getDriftsplan_navn() + "',"
                        + "'" + tFeatures[i].getProperties().getDriftsaftale_edoc_nr() + "',"
                        + "'" + tFeatures[i].getProperties().getBemaerkning() + "',"
                        + "'" + tFeatures[i].getProperties().getAndre_vaekstforhold() + "',"
                        + "'" + tFeatures[i].getProperties().getFredet_beskyttet_trae() + "',"
                        + "'" + tFeatures[i].getProperties().getFredning_edoc_nr() + "',"
                        + "'" + tFeatures[i].getProperties().getTrae_historie() + "',"
                        + "'" + tFeatures[i].getProperties().getBotanisk_interesse() + "',"
                        + "'" + tFeatures[i].getProperties().getDonor() + "',"
                        + "'" + tFeatures[i].getProperties().getAnledning() + "',"
                        + "'" + tFeatures[i].getProperties().getSaerligt_trae() + "',"
                        + "'" + tFeatures[i].getProperties().getSaerlig_trae_bem() + "',"
                        + "'" + tFeatures[i].getProperties().getBydelsnavn() + "',"
                        + "'" + tFeatures[i].getProperties().getFredet_trae_foto() + "',"
                        + "" + tFeatures[i].getProperties().getVejstatus() + ""
                        + ");");
            }
            for (int i = 0; i < features.length; i++) {

                for (int j = 0; j < features[i].getGeometry().coordinates.get(0).get(0).size(); j++) {
                    String type = features[i].getGeometry().getType();
                    stmt.execute("insert into spatialData.geolocations(propertyId,type,lattitude,longitude)values("
                            + "" + features[i].getProperties().getId() + ","
                            + "'" + type + "',"
                            + "" + features[i].getGeometry().coordinates.get(0).get(0).get(j).get(0) + ","
                            + "" + features[i].getGeometry().coordinates.get(0).get(0).get(j).get(1) + ""
                            + ");");
                }
            }
            int geoIdFromOne = 1;
            for (int i = 0; i < features.length; i++) {

                for (int j = 0; j < features[i].getGeometry().coordinates.size(); j++) {

                    String id = features[i].getId();
                    stmt.execute("insert into spatialData.feature()values("
                            + "'" + id + "',"
                            + "'" + features[i].getType() + "',"
                            + "'" + features[i].getGeometry_name() + "',"
                            + "" + geoIdFromOne + ","
                            + "" + features[i].getProperties().getId()
                            + ")");
                    geoIdFromOne++;
                }
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

