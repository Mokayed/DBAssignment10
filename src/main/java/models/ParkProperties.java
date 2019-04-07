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
class ParkProperties {
    private int areal_id;
    private int park_id;
    private String navn_arealer;
    private int key_field_arealer;
    private int key_field_parker;
    private int parknummer;
    private String parktype;
    private String navn_parke;
    private String undernavn;
    private String bydelsnavn;
    private String ejerforhold;
    private String ejer;
    private double areal;
    private String fredning;
    private String fredning_beskriv;
    private String fredning_bygning;
    private String fredning_fortid;
    private String udviklingsplan;
    private String udviklingsaar;
    private String besoegstal;
    private String brugerunder;
    private String beskrivelse;
    private String link;
    private int opland_300;
    private int opland_875;
    private String registreringsdato;
    private String rettelsesdato;

    public ParkProperties(int areal_id, int park_id, String navn_arealer, int key_field_arealer, int key_field_parker, int parknummer, String parktype, String navn_parke, String undernavn, String bydelsnavn, String ejerforhold, String ejer, double areal, String fredning, String fredning_beskriv, String fredning_bygning, String fredning_fortid, String udviklingsplan, String udviklingsaar, String besoegstal, String brugerunder, String beskrivelse, String link, int opland_300, int opland_875, String registreringsdato, String rettelsesdato) {
        this.areal_id = areal_id;
        this.park_id = park_id;
        this.navn_arealer = navn_arealer;
        this.key_field_arealer = key_field_arealer;
        this.key_field_parker = key_field_parker;
        this.parknummer = parknummer;
        this.parktype = parktype;
        this.navn_parke = navn_parke;
        this.undernavn = undernavn;
        this.bydelsnavn = bydelsnavn;
        this.ejerforhold = ejerforhold;
        this.ejer = ejer;
        this.areal = areal;
        this.fredning = fredning;
        this.fredning_beskriv = fredning_beskriv;
        this.fredning_bygning = fredning_bygning;
        this.fredning_fortid = fredning_fortid;
        this.udviklingsplan = udviklingsplan;
        this.udviklingsaar = udviklingsaar;
        this.besoegstal = besoegstal;
        this.brugerunder = brugerunder;
        this.beskrivelse = beskrivelse;
        this.link = link;
        this.opland_300 = opland_300;
        this.opland_875 = opland_875;
        this.registreringsdato = registreringsdato;
        this.rettelsesdato = rettelsesdato;
    }

    public int getAreal_id() {
        return areal_id;
    }

    public void setAreal_id(int areal_id) {
        this.areal_id = areal_id;
    }

    public int getPark_id() {
        return park_id;
    }

    public void setPark_id(int park_id) {
        this.park_id = park_id;
    }

    public String getNavn_arealer() {
        return navn_arealer;
    }

    public void setNavn_arealer(String navn_arealer) {
        this.navn_arealer = navn_arealer;
    }

    public int getKey_field_arealer() {
        return key_field_arealer;
    }

    public void setKey_field_arealer(int key_field_arealer) {
        this.key_field_arealer = key_field_arealer;
    }

    public int getKey_field_parker() {
        return key_field_parker;
    }

    public void setKey_field_parker(int key_field_parker) {
        this.key_field_parker = key_field_parker;
    }

    public int getParknummer() {
        return parknummer;
    }

    public void setParknummer(int parknummer) {
        this.parknummer = parknummer;
    }

    public String getParktype() {
        return parktype;
    }

    public void setParktype(String parktype) {
        this.parktype = parktype;
    }

    public String getNavn_parke() {
        return navn_parke;
    }

    public void setNavn_parke(String navn_parke) {
        this.navn_parke = navn_parke;
    }

    public String getUndernavn() {
        return undernavn;
    }

    public void setUndernavn(String undernavn) {
        this.undernavn = undernavn;
    }

    public String getBydelsnavn() {
        return bydelsnavn;
    }

    public void setBydelsnavn(String bydelsnavn) {
        this.bydelsnavn = bydelsnavn;
    }

    public String getEjerforhold() {
        return ejerforhold;
    }

    public void setEjerforhold(String ejerforhold) {
        this.ejerforhold = ejerforhold;
    }

    public String getEjer() {
        return ejer;
    }

    public void setEjer(String ejer) {
        this.ejer = ejer;
    }

    public double getAreal() {
        return areal;
    }

    public void setAreal(double areal) {
        this.areal = areal;
    }

    public String getFredning() {
        return fredning;
    }

    public void setFredning(String fredning) {
        this.fredning = fredning;
    }

    public String getFredning_beskriv() {
        return fredning_beskriv;
    }

    public void setFredning_beskriv(String fredning_beskriv) {
        this.fredning_beskriv = fredning_beskriv;
    }

    public String getFredning_bygning() {
        return fredning_bygning;
    }

    public void setFredning_bygning(String fredning_bygning) {
        this.fredning_bygning = fredning_bygning;
    }

    public String getFredning_fortid() {
        return fredning_fortid;
    }

    public void setFredning_fortid(String fredning_fortid) {
        this.fredning_fortid = fredning_fortid;
    }

    public String getUdviklingsplan() {
        return udviklingsplan;
    }

    public void setUdviklingsplan(String udviklingsplan) {
        this.udviklingsplan = udviklingsplan;
    }

    public String getUdviklingsaar() {
        return udviklingsaar;
    }

    public void setUdviklingsaar(String udviklingsaar) {
        this.udviklingsaar = udviklingsaar;
    }

    public String getBesoegstal() {
        return besoegstal;
    }

    public void setBesoegstal(String besoegstal) {
        this.besoegstal = besoegstal;
    }

    public String getBrugerunder() {
        return brugerunder;
    }

    public void setBrugerunder(String brugerunder) {
        this.brugerunder = brugerunder;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public int getOpland_300() {
        return opland_300;
    }

    public void setOpland_300(int opland_300) {
        this.opland_300 = opland_300;
    }

    public int getOpland_875() {
        return opland_875;
    }

    public void setOpland_875(int opland_875) {
        this.opland_875 = opland_875;
    }

    public String getRegistreringsdato() {
        return registreringsdato;
    }

    public void setRegistreringsdato(String registreringsdato) {
        this.registreringsdato = registreringsdato;
    }

    public String getRettelsesdato() {
        return rettelsesdato;
    }

    public void setRettelsesdato(String rettelsesdato) {
        this.rettelsesdato = rettelsesdato;
    }

    @Override
    public String toString() {
        return "ParkProperties{" + "areal_id=" + areal_id + ", park_id=" + park_id + ", navn_arealer=" + navn_arealer + ", key_field_arealer=" + key_field_arealer + ", key_field_parker=" + key_field_parker + ", parknummer=" + parknummer + ", parktype=" + parktype + ", navn_parke=" + navn_parke + ", undernavn=" + undernavn + ", bydelsnavn=" + bydelsnavn + ", ejerforhold=" + ejerforhold + ", ejer=" + ejer + ", areal=" + areal + ", fredning=" + fredning + ", fredning_beskriv=" + fredning_beskriv + ", fredning_bygning=" + fredning_bygning + ", fredning_fortid=" + fredning_fortid + ", udviklingsplan=" + udviklingsplan + ", udviklingsaar=" + udviklingsaar + ", besoegstal=" + besoegstal + ", brugerunder=" + brugerunder + ", beskrivelse=" + beskrivelse + ", link=" + link + ", opland_300=" + opland_300 + ", opland_875=" + opland_875 + ", registreringsdato=" + registreringsdato + ", rettelsesdato=" + rettelsesdato + '}';
    }
    
    
}
