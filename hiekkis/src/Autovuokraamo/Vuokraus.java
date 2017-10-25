package Autovuokraamo;

import java.util.Date;

public class Vuokraus {

    public Ajoneuvo ajoneuvo;
    public String varausnumero;
    public String asiakastunnus;
    public Date alkamisPvm;
    public Date loppumisPvm;
    public int hinta;
    public Varaukset varaukset;

    public Vuokraus(String varausnumero, Asiakas asiakas, Ajoneuvo ajoneuvo, Date alku, Date loppu, Varaukset varaukset) {
        this.ajoneuvo = ajoneuvo;
        this.varausnumero = varausnumero;
        this.asiakastunnus = asiakas.getTunnus();
        this.alkamisPvm = alku;
        this.loppumisPvm = loppu;
        this.hinta = this.ajoneuvo.getHinta();
        this.varaukset = varaukset;

        setVaraus();
    }

    public void setVarausnumero(String uusNro) {

    }

    public String getVarausnumero() {
        return null;
    }

    public String getRekkari() {
        return null;
    }

    public void setAlku(Date uusAlku) {

    }

    public Date getAlku() {
        return null;
    }

    public void setLoppu(Date uusLoppu) {

    }

    public Date getLoppu() {
        return null;
    }

    public void setKilometrit(int korjattuKm) {

    }

    public int getKilometrit() {
        return 0;
    }

    public void setHinta(Lisavarusteet lisavarusteet, Vakuutus vakuutus) {

    }

    public int getHinta() {
        return 0;
    }

    public void setVaraus() {

    }

    public Varaukset getVaraukset() {
        return null;
    }

    @Override
    public String toString() {
        return null;
    }
}
