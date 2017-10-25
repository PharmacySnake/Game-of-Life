package chess.domain;

import java.util.Arrays;

public class Lauta {

    private String[][] lauta;

    public Lauta() {
        this.lauta = new String[8][8];
        for (String[] rivi : this.lauta) {
            Arrays.fill(rivi, ".");
        }
    }

    public void tulosta() {
        for (int x = 0; x < this.lauta.length; x++) {
            System.out.print(x + 1); //laudan numerot
            
            for (int y = 0; y < this.lauta[x].length; y++) {
                System.out.print(this.lauta[x][y]);
            }
            System.out.println("");
        }
        System.out.println(" ABCDEFGH"); //laudan kirjaimet
    }

    public String[][] getLauta() {
        return this.lauta;
    }

    public void lisaaNappula(Pelinappula nappula) {
        this.lauta[nappula.getX()][nappula.getY()] = nappula.getNappula();
    }

}
