package chess.peli;

import chess.Nappulat;
import chess.domain.Lauta;
import chess.domain.Pelinappula;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Shakki {

    private Lauta lauta = new Lauta();
    private List<Nappulat> nappulat = new ArrayList<>();
    private List<Pelinappula> valkoiset = new ArrayList<>();
    private List<Pelinappula> mustat = new ArrayList<>();
    private Map<Character, Integer> muunnin = new HashMap<>();
    private Scanner lukija = new Scanner(System.in);
    private int vuoro = 0;

    public Shakki() {
        this.muunnin.put('a', 0);
        this.muunnin.put('b', 1);
        this.muunnin.put('c', 2);
        this.muunnin.put('d', 3);
        this.muunnin.put('e', 4);
        this.muunnin.put('f', 5);
        this.muunnin.put('g', 6);
        this.muunnin.put('h', 7);

        nappulat.add(Nappulat.T);
        nappulat.add(Nappulat.R);
        nappulat.add(Nappulat.L);
        nappulat.add(Nappulat.Q);
        nappulat.add(Nappulat.K);
        nappulat.add(Nappulat.L);
        nappulat.add(Nappulat.R);
        nappulat.add(Nappulat.T);

        nappulatListoille();

        for (int x = 1; x < 7; x++) {
            if (x == 1) {
                for (int y = 0; y < 8; y++) {
                    this.valkoiset.add(new Pelinappula(x, y, Nappulat.S));
                }
            } else {
                for (int y = 0; y < 8; y++) {
                    this.mustat.add(new Pelinappula(x, y, Nappulat.S));
                }
            }

            if (x == 1) {
                x = 5;
            }
        }
    }

    public void run() {
        while (true) {
            asetaNappulat();
            this.lauta.tulosta();

            if (this.vuoro == 0) {
                System.out.println("\nValkoisen siirto");
            } else {
                System.out.println("\nMustan siirto");
            }
            String siirto = "";

            while (true) {
                System.out.print("Siirto: ");
                siirto = lukija.nextLine();
                if (siirto.toLowerCase().matches("[a-h][1-8]-[a-h][1-8]")) {
                    break;
                }
            }

            siirraNappulaa(tulkkaa(siirto));

            if (this.vuoro == 0) { //pelivuoron vaihto. 0 on valkoinen, 1 on musta
                this.vuoro = 1;
            } else {
                this.vuoro = 0;
            }
        }
    }

    public void nappulatListoille() {
        for (int x = 0; x < this.lauta.getLauta().length; x++) {
            if (x == 0) {
                for (int y = 0; y < this.nappulat.size(); y++) {
                    this.valkoiset.add(new Pelinappula(x, y, this.nappulat.get(y)));
                }
            } else {
                for (int y = 0; y < this.nappulat.size(); y++) {
                    this.mustat.add(new Pelinappula(x, y, this.nappulat.get(y)));
                }
            }

            if (x == 0) {
                x = 6;
            }
        }
    }

    public void asetaNappulat() {
        for (Pelinappula vNappula : this.valkoiset) {
            this.lauta.lisaaNappula(vNappula);
        }

        for (Pelinappula mNappula : mustat) {
            this.lauta.lisaaNappula(mNappula);
        }
    }

    public void tulostaNappulat(List<Pelinappula> lista) {
        for (Pelinappula nappula : lista) {
            System.out.println(nappula);
        }
    }

    public String tulkkaa(String siirto) {
        String koordinaatit = "";
        
        if (siirto.length() == 5 && siirto.charAt(siirto.length() / 2) == '-') {
            String[] splitattu = siirto.split("-");

            for (int i = 0; i < splitattu.length; i++) {
                for (int j = 0; j < 2; j++) {
                    for (Character kirjain : this.muunnin.keySet()) {
                        if (splitattu[i].charAt(j) == kirjain) {
                            koordinaatit += this.muunnin.get(kirjain);

                        } else if (Character.toString(splitattu[i].charAt(j)).matches("[1-8]")) {
                            koordinaatit += "" + (Integer.parseInt(Character.toString(splitattu[i].charAt(j))) - 1);
                            //koordinaatit += splitattu[i].charAt(j);
                            break;
                        }
                    }
                }
            }

            System.out.println("\nnaatit: " + koordinaatit + "\n");
        }

        return koordinaatit;
    }

    public void siirraNappulaa(String siirto) {
        int mistaX = Integer.parseInt(Character.toString(siirto.charAt(0)));
        int mistaY = Integer.parseInt(Character.toString(siirto.charAt(1)));
        int mihinX = Integer.parseInt(Character.toString(siirto.charAt(2)));
        int mihinY = Integer.parseInt(Character.toString(siirto.charAt(3)));

        //if (this.vuoro == 0) {
        for (Pelinappula nappula : this.valkoiset) {
            if (nappula.getX() == mistaX && nappula.getY() == mistaY) {
                System.out.println("löyty");
                nappula.setX(mihinX);
                nappula.setY(mihinY);
            }
        }

        /*} else {
         for (Pelinappula nappula : this.mustat) {
         if (nappula.getX() == mistaX && nappula.getY() == mistaY) {
         nappula.setX(mihinX);
         nappula.setY(mihinY);
         }
         }
         }*/
    }

}
