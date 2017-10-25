package Autovuokraamo;

import java.util.List;

public class Asiakas {

    public String asiakastunnus;
    public String etuN;
    public String sukuN;
    public String osoite;
    public Varaukset varaukset;

    public Asiakas(String asiakastunnus, String etuN, String sukuN, String osoite, Varaukset varaukset) {
        this.asiakastunnus = asiakastunnus;
        this.etuN = etuN;
        this.sukuN = sukuN;
        this.osoite = osoite;
        this.varaukset = varaukset;
    }

    public void setTunnus(String uusTunnus) {

    }

    public String getTunnus() {
        return null;
    }

    public void setEtunimi(String uusNimi) {
        this.etuN = uusNimi;
    }

    public String getEtunimi() {
        return this.etuN;
    }

    public void setSukunimi(String uusNimi) {
        this.sukuN = uusNimi;
    }

    public String getSukunimi() {
        return this.sukuN;
    }

    public void setOsoite(String uusOsoite) {
        this.osoite = uusOsoite;
    }

    public String getOsoite() {
        return this.osoite;
    }

    public Varaukset printVaraukset() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }

}
