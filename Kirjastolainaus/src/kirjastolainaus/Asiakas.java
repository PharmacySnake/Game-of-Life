package kirjastolainaus;

import java.util.ArrayList;
import java.util.List;

public class Asiakas {

    public final int asiakasNro;
    public String etuN;
    public String sukuN;
    public String osoite;
    private List<String> lainatutKirjat;
    private boolean lainaoikeus;

    public Asiakas(int asiakasNro, String etuN, String sukuN, String osoite) {
        this.asiakasNro = asiakasNro;
        this.etuN = etuN;
        this.sukuN = sukuN;
        this.osoite = osoite;
        this.lainatutKirjat = new ArrayList<>();
        this.lainaoikeus = true;

    }

    public void setHenkilotiedot(String uusEtuN, String uusSukuN, String uusOsoite) {
    }

    public void setEtuN(String uusEtuN) {
    }

    public void setSukuN(String uusSukuN) {
    }

    public void setOsoite(String uusOsoite) {
    }

    public int getAsiakasNro() {
        return 0;
    }

    public String getEtuN() {
        return null;
    }

    public String getSukuN() {
        return null;
    }

    public String getOsoite() {
        return null;
    }

    public List getLainatut() {
        return null;
    }
    
    public void setLainaoikeus(boolean oikeus) {}
    
    public boolean getLainaoikeus() {
        return false;
    }

    public void lainaaKirja(String lainaKirjanIsbn) {
    }

    public void palautaKirja(String palautaKirjaIsbn) {
    }
}
