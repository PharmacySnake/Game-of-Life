package Autovuokraamo;

import java.util.Date;
import java.util.List;

public class Vahinkoilmoitus {

    public String vahinkotunnus;
    public Ajoneuvo ajoneuvo;
    public List vahingot;
    public Date pvm;

    public Vahinkoilmoitus(String vahinkotunnus, Ajoneuvo ajoneuvo, List vahinko, Date pvm) {
        this.vahinkotunnus = vahinkotunnus;
        this.ajoneuvo = ajoneuvo;
        this.vahingot = vahinko;
        this.pvm = pvm;
    }

    public void setTunnus() {

    }

    public String getTunnus() {
        return null;
    }

    public void setPvm(Date uusPvm) {

    }

    public Date getPvm() {
        return null;
    }

    public void setAjoneuvo(Ajoneuvo uusAjoneuvo) {

    }

    public Ajoneuvo getAjoneuvo() {
        return null;
    }

    public void setAsiakas(Asiakas uusAsiakas) {

    }

    public Asiakas getAsiakas() {
        return null;
    }

    public void lisaaVahinko(String vahinko) {

    }

    public void poistaVahinko(int nro) {

    }

    @Override
    public String toString() {
        return null;
    }

}
