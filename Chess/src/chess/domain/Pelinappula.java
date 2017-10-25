package chess.domain;

import chess.Nappulat;

public class Pelinappula {

    private int x;
    private int y;
    private Nappulat nappula;
    private int vari;

    public Pelinappula(int x, int y, Nappulat nappula) {
        this.x = x;
        this.y = y;
        this.nappula = nappula;
        //this.vari = vari;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void liiku(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ") " + this.nappula.getNappi();
    }

    public String getNappula() {
        return this.nappula.getNappi();
    }

}
