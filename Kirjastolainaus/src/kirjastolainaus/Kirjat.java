package kirjastolainaus;

public class Kirjat {
    
    public String isbn;
    public String nimi;
    public String tekija;
    public float luokitus;

    public Kirjat(String isbn, String nimi, String tekija, float luokitus) {
        this.isbn = isbn;
        this.nimi = nimi;
        this.tekija = tekija;
        this.luokitus = luokitus;
    }
    
    public void muutaTiedot(String nimi, String tekija, float luokitus) {}
    
    public void setNimi(String uusNimi) {}
    
    public void setTekija(String uusTekija) {}

    public void setLuokitus(float uusLuokitus) {}
    
    public String getNimi() {
        return null;
    }
    
    public String getTekija() {
        return null;
    }
    
    public float getLuokitus() {
        return 0;
    }
    
    public String getIsbn() {
        return null;
    }
}
