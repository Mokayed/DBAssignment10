/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hallur
 */
public class FeatureProperties {
    private int id;
    private String byomraade;
    private String delomraade;
    private int m2;

    public FeatureProperties(int id, String byomraade, String delomraade, int m2) {
        this.id = id;
        this.byomraade = byomraade;
        this.delomraade = delomraade;
        this.m2 = m2;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getByomraade() {
        return byomraade;
    }

    public void setByomraade(String byomraade) {
        this.byomraade = byomraade;
    }

    public String getDelomraade() {
        return delomraade;
    }

    public void setDelomraade(String delomraade) {
        this.delomraade = delomraade;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "FeatureProperties{" + "id=" + id + ", byomraade=" + byomraade + ", delomraade=" + delomraade + ", m2=" + m2 + '}';
    }
    
    
    
}
