/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author MoK
 */
public class BikesProperties {

    private int id;
    private int vejkode;
    private String vejnavn;
    private int park_id;
    private String bydel;
    private String stativ_type;
    private String stativ_placering;
    private String stativ_udformning;
    private String cykler_retning;
    private int antal_pladser;
    private String stativ_tilstand;
    private String stativ_foto;
    private String bemaerkning;
    private String reg_metode;
    private String reg_dato;
    private String rettet_dato;
    private int budget;
    private String projekt;
    private String faerdigmelding;
    private String projektbeskrivelse;
    private int stativ_fjernet;

    public BikesProperties(int id, int vejkode, String vejnavn, int park_id, String bydel, String stativ_type, String stativ_placering, String stativ_udformning, String cykler_retning, int antal_pladser, String stativ_tilstand, String stativ_foto, String bemaerkning, String reg_metode, String reg_dato, String rettet_dato, int budget, String projekt, String faerdigmelding, String projektbeskrivelse, int stativ_fjernet) {
        this.id = id;
        this.vejkode = vejkode;
        this.vejnavn = vejnavn;
        this.park_id = park_id;
        this.bydel = bydel;
        this.stativ_type = stativ_type;
        this.stativ_placering = stativ_placering;
        this.stativ_udformning = stativ_udformning;
        this.cykler_retning = cykler_retning;
        this.antal_pladser = antal_pladser;
        this.stativ_tilstand = stativ_tilstand;
        this.stativ_foto = stativ_foto;
        this.bemaerkning = bemaerkning;
        this.reg_metode = reg_metode;
        this.reg_dato = reg_dato;
        this.rettet_dato = rettet_dato;
        this.budget = budget;
        this.projekt = projekt;
        this.faerdigmelding = faerdigmelding;
        this.projektbeskrivelse = projektbeskrivelse;
        this.stativ_fjernet = stativ_fjernet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVejkode() {
        return vejkode;
    }

    public void setVejkode(int vejkode) {
        this.vejkode = vejkode;
    }

    public String getVejnavn() {
        return vejnavn;
    }

    public void setVejnavn(String vejnavn) {
        this.vejnavn = vejnavn;
    }

    public int getPark_id() {
        return park_id;
    }

    public void setPark_id(int park_id) {
        this.park_id = park_id;
    }

    public String getBydel() {
        return bydel;
    }

    public void setBydel(String bydel) {
        this.bydel = bydel;
    }

    public String getStativ_type() {
        return stativ_type;
    }

    public void setStativ_type(String stativ_type) {
        this.stativ_type = stativ_type;
    }

    public String getStativ_placering() {
        return stativ_placering;
    }

    public void setStativ_placering(String stativ_placering) {
        this.stativ_placering = stativ_placering;
    }

    public String getStativ_udformning() {
        return stativ_udformning;
    }

    public void setStativ_udformning(String stativ_udformning) {
        this.stativ_udformning = stativ_udformning;
    }

    public String getCykler_retning() {
        return cykler_retning;
    }

    public void setCykler_retning(String cykler_retning) {
        this.cykler_retning = cykler_retning;
    }

    public int getAntal_pladser() {
        return antal_pladser;
    }

    public void setAntal_pladser(int antal_pladser) {
        this.antal_pladser = antal_pladser;
    }

    public String getStativ_tilstand() {
        return stativ_tilstand;
    }

    public void setStativ_tilstand(String stativ_tilstand) {
        this.stativ_tilstand = stativ_tilstand;
    }

    public String getStativ_foto() {
        return stativ_foto;
    }

    public void setStativ_foto(String stativ_foto) {
        this.stativ_foto = stativ_foto;
    }

    public String getBemaerkning() {
        return bemaerkning;
    }

    public void setBemaerkning(String bemaerkning) {
        this.bemaerkning = bemaerkning;
    }

    public String getReg_metode() {
        return reg_metode;
    }

    public void setReg_metode(String reg_metode) {
        this.reg_metode = reg_metode;
    }

    public String getReg_dato() {
        return reg_dato;
    }

    public void setReg_dato(String reg_dato) {
        this.reg_dato = reg_dato;
    }

    public String getRettet_dato() {
        return rettet_dato;
    }

    public void setRettet_dato(String rettet_dato) {
        this.rettet_dato = rettet_dato;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getProjekt() {
        return projekt;
    }

    public void setProjekt(String projekt) {
        this.projekt = projekt;
    }

    public String getFaerdigmelding() {
        return faerdigmelding;
    }

    public void setFaerdigmelding(String faerdigmelding) {
        this.faerdigmelding = faerdigmelding;
    }

    public String getProjektbeskrivelse() {
        return projektbeskrivelse;
    }

    public void setProjektbeskrivelse(String projektbeskrivelse) {
        this.projektbeskrivelse = projektbeskrivelse;
    }

    public int getStativ_fjernet() {
        return stativ_fjernet;
    }

    public void setStativ_fjernet(int stativ_fjernet) {
        this.stativ_fjernet = stativ_fjernet;
    }

    @Override
    public String toString() {
        return "BikesProperties{" + "id=" + id + ", vejkode=" + vejkode + ", vejnavn=" + vejnavn + ", park_id=" + park_id + ", bydel=" + bydel + ", stativ_type=" + stativ_type + ", stativ_placering=" + stativ_placering + ", stativ_udformning=" + stativ_udformning + ", cykler_retning=" + cykler_retning + ", antal_pladser=" + antal_pladser + ", stativ_tilstand=" + stativ_tilstand + ", stativ_foto=" + stativ_foto + ", bemaerkning=" + bemaerkning + ", reg_metode=" + reg_metode + ", reg_dato=" + reg_dato + ", rettet_dato=" + rettet_dato + ", budget=" + budget + ", projekt=" + projekt + ", faerdigmelding=" + faerdigmelding + ", projektbeskrivelse=" + projektbeskrivelse + ", stativ_fjernet=" + stativ_fjernet + '}';
    }

}
