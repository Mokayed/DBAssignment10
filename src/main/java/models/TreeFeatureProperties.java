package models;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MoK
 */
public class TreeFeatureProperties {
    private int id;
    private String traeart;
    private String slaegt;
    private String dansk_navn;
    private String slaegtsnav;
    private int planteaar;
    private String plantet_halvaar;
    private String garantiperioden_udloeber;
    private String plantemetode;
    private String ejer;
    private String driftsorganisation;
    private String driftsplan_navn;
    private String driftsaftale_edoc_nr;
    private String bemaerkning;
    private String andre_vaekstforhold;
    private String fredet_beskyttet_trae;
    private String fredning_edoc_nr;
    private String trae_historie;
    private String botanisk_interesse;
    private String donor;
    private String anledning;
    private String saerligt_trae;
    private String saerlig_trae_bem;
    private String bydelsnavn;
    private String fredet_trae_foto;
    private int vejstatus;

    public TreeFeatureProperties(int id, String traeart, String slaegt, String dansk_navn, String slaegtsnav, int planteaar, String plantet_halvaar, String garantiperioden_udloeber, String plantemetode, String ejer, String driftsorganisation, String driftsplan_navn, String driftsaftale_edoc_nr, String bemaerkning, String andre_vaekstforhold, String fredet_beskyttet_trae, String fredning_edoc_nr, String trae_historie, String botanisk_interesse, String donor, String anledning, String saerligt_trae, String saerlig_trae_bem, String bydelsnavn, String fredet_trae_foto, int vejstatus) {
        this.id = id;
        this.traeart = traeart;
        this.slaegt = slaegt;
        this.dansk_navn = dansk_navn;
        this.slaegtsnav = slaegtsnav;
        this.planteaar = planteaar;
        this.plantet_halvaar = plantet_halvaar;
        this.garantiperioden_udloeber = garantiperioden_udloeber;
        this.plantemetode = plantemetode;
        this.ejer = ejer;
        this.driftsorganisation = driftsorganisation;
        this.driftsplan_navn = driftsplan_navn;
        this.driftsaftale_edoc_nr = driftsaftale_edoc_nr;
        this.bemaerkning = bemaerkning;
        this.andre_vaekstforhold = andre_vaekstforhold;
        this.fredet_beskyttet_trae = fredet_beskyttet_trae;
        this.fredning_edoc_nr = fredning_edoc_nr;
        this.trae_historie = trae_historie;
        this.botanisk_interesse = botanisk_interesse;
        this.donor = donor;
        this.anledning = anledning;
        this.saerligt_trae = saerligt_trae;
        this.saerlig_trae_bem = saerlig_trae_bem;
        this.bydelsnavn = bydelsnavn;
        this.fredet_trae_foto = fredet_trae_foto;
        this.vejstatus = vejstatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTraeart() {
        return traeart;
    }

    public void setTraeart(String traeart) {
        this.traeart = traeart;
    }

    public String getSlaegt() {
        return slaegt;
    }

    public void setSlaegt(String slaegt) {
        this.slaegt = slaegt;
    }

    public String getDansk_navn() {
        return dansk_navn;
    }

    public void setDansk_navn(String dansk_navn) {
        this.dansk_navn = dansk_navn;
    }

    public String getSlaegtsnav() {
        return slaegtsnav;
    }

    public void setSlaegtsnav(String slaegtsnav) {
        this.slaegtsnav = slaegtsnav;
    }

    public int getPlanteaar() {
        return planteaar;
    }

    public void setPlanteaar(int planteaar) {
        this.planteaar = planteaar;
    }

    public String getPlantet_halvaar() {
        return plantet_halvaar;
    }

    public void setPlantet_halvaar(String plantet_halvaar) {
        this.plantet_halvaar = plantet_halvaar;
    }

    public String getGarantiperioden_udloeber() {
        return garantiperioden_udloeber;
    }

    public void setGarantiperioden_udloeber(String garantiperioden_udloeber) {
        this.garantiperioden_udloeber = garantiperioden_udloeber;
    }

    public String getPlantemetode() {
        return plantemetode;
    }

    public void setPlantemetode(String plantemetode) {
        this.plantemetode = plantemetode;
    }

    public String getEjer() {
        return ejer;
    }

    public void setEjer(String ejer) {
        this.ejer = ejer;
    }

    public String getDriftsorganisation() {
        return driftsorganisation;
    }

    public void setDriftsorganisation(String driftsorganisation) {
        this.driftsorganisation = driftsorganisation;
    }

    public String getDriftsplan_navn() {
        return driftsplan_navn;
    }

    public void setDriftsplan_navn(String driftsplan_navn) {
        this.driftsplan_navn = driftsplan_navn;
    }

    public String getDriftsaftale_edoc_nr() {
        return driftsaftale_edoc_nr;
    }

    public void setDriftsaftale_edoc_nr(String driftsaftale_edoc_nr) {
        this.driftsaftale_edoc_nr = driftsaftale_edoc_nr;
    }

    public String getBemaerkning() {
        return bemaerkning;
    }

    public void setBemaerkning(String bemaerkning) {
        this.bemaerkning = bemaerkning;
    }

    public String getAndre_vaekstforhold() {
        return andre_vaekstforhold;
    }

    public void setAndre_vaekstforhold(String andre_vaekstforhold) {
        this.andre_vaekstforhold = andre_vaekstforhold;
    }

    public String getFredet_beskyttet_trae() {
        return fredet_beskyttet_trae;
    }

    public void setFredet_beskyttet_trae(String fredet_beskyttet_trae) {
        this.fredet_beskyttet_trae = fredet_beskyttet_trae;
    }

    public String getFredning_edoc_nr() {
        return fredning_edoc_nr;
    }

    public void setFredning_edoc_nr(String fredning_edoc_nr) {
        this.fredning_edoc_nr = fredning_edoc_nr;
    }

    public String getTrae_historie() {
        return trae_historie;
    }

    public void setTrae_historie(String trae_historie) {
        this.trae_historie = trae_historie;
    }

    public String getBotanisk_interesse() {
        return botanisk_interesse;
    }

    public void setBotanisk_interesse(String botanisk_interesse) {
        this.botanisk_interesse = botanisk_interesse;
    }

    public String getDonor() {
        return donor;
    }

    public void setDonor(String donor) {
        this.donor = donor;
    }

    public String getAnledning() {
        return anledning;
    }

    public void setAnledning(String anledning) {
        this.anledning = anledning;
    }

    public String getSaerligt_trae() {
        return saerligt_trae;
    }

    public void setSaerligt_trae(String saerligt_trae) {
        this.saerligt_trae = saerligt_trae;
    }

    public String getSaerlig_trae_bem() {
        return saerlig_trae_bem;
    }

    public void setSaerlig_trae_bem(String saerlig_trae_bem) {
        this.saerlig_trae_bem = saerlig_trae_bem;
    }

    public String getBydelsnavn() {
        return bydelsnavn;
    }

    public void setBydelsnavn(String bydelsnavn) {
        this.bydelsnavn = bydelsnavn;
    }

    public String getFredet_trae_foto() {
        return fredet_trae_foto;
    }

    public void setFredet_trae_foto(String fredet_trae_foto) {
        this.fredet_trae_foto = fredet_trae_foto;
    }

    public int getVejstatus() {
        return vejstatus;
    }

    public void setVejstatus(int vejstatus) {
        this.vejstatus = vejstatus;
    }

    @Override
    public String toString() {
        return "TreeFeatureProperties{" + "id=" + id + ", traeart=" + traeart + ", slaegt=" + slaegt + ", dansk_navn=" + dansk_navn + ", slaegtsnav=" + slaegtsnav + ", planteaar=" + planteaar + ", plantet_halvaar=" + plantet_halvaar + ", garantiperioden_udloeber=" + garantiperioden_udloeber + ", plantemetode=" + plantemetode + ", ejer=" + ejer + ", driftsorganisation=" + driftsorganisation + ", driftsplan_navn=" + driftsplan_navn + ", driftsaftale_edoc_nr=" + driftsaftale_edoc_nr + ", bemaerkning=" + bemaerkning + ", andre_vaekstforhold=" + andre_vaekstforhold + ", fredet_beskyttet_trae=" + fredet_beskyttet_trae + ", fredning_edoc_nr=" + fredning_edoc_nr + ", trae_historie=" + trae_historie + ", botanisk_interesse=" + botanisk_interesse + ", donor=" + donor + ", anledning=" + anledning + ", saerligt_trae=" + saerligt_trae + ", saerlig_trae_bem=" + saerlig_trae_bem + ", bydelsnavn=" + bydelsnavn + ", fredet_trae_foto=" + fredet_trae_foto + ", vejstatus=" + vejstatus + '}';
    }
    
}
