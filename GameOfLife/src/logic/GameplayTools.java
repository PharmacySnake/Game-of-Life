package logic;

import java.util.ArrayList;
import java.util.List;

public class GameplayTools {

    private final double random;
    private final GameBoard board;
    private List<Cell> cells;

    public GameplayTools(int random, GameBoard board) {
        this.random = random;
        this.board = board;
        this.cells = new ArrayList();
    }

    public void setGame() {
        for (int y = 0; y < this.board.getHeight(); y++) {
            for (int x = 0; x < this.board.getWidth(); x++) {
                if (cellRandomStatus()) {
                    this.cells.add(new Cell(x, y, true));
                    System.out.print("*");
                } else {
                    this.cells.add(new Cell(x, y, false));
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }

    private boolean cellRandomStatus() {
        return Math.random() * 100 <= this.random;
    }

    public void checkVitality() {
        for (Cell cell : this.cells) {
            int neighbours = countNeighbours(cell);

            if (!cell.getStatus() && neighbours == 3) {
                cell.setStatus(true);
            } else if (neighbours == 3 || neighbours == 2) {
                cell.setStatus(true);
            } else {
                cell.setStatus(false);
            }
        }
    }

    public int countNeighbours(Cell cell) {
        int neighbours = 0;
        int startX = setStart(cell.getX());
        int endX = setEnd(cell.getX());
        int startY = setStart(cell.getY());
        int endY = setEnd(cell.getY());

        for (int y = startY; y <= endY; y++) {
            for (int x = startX; x <= endX; x++) {
                if (notOverlapping(cell, x, y) && checkCellStatus(x, y)) {
                    neighbours++;
                    //break;
                }
                //System.out.println(startX + " : " + x + "-" + y);
            }
        }

        return neighbours;
    }

    protected void drawCycle() {
        int x = 0;
        checkVitality();

        for (Cell cell : this.cells) {
            if (cell.getStatus()) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
            x++;

            if (x == this.board.getWidth()) {
                System.out.println("");
                x = 0;
            }
        }
    }

    @Override
    public String toString() {
        return null;
    }

    private int setStart(int value) {
        if (value - 1 < 0) {
            return value;
        }
        return value - 1;
    }

    private int setEnd(int value) {
        if (value + 1 > this.board.getWidth()) {
            return value;
        }
        return value + 1;
    }

    private boolean checkCellStatus(int x, int y) {
        for (Cell cell : this.cells) {
            if (cell.getX() == x && cell.getY() == y) {
                return cell.getStatus();
            }
        }

        return false;
    }

    protected boolean notOverlapping(Cell cell, int otherX, int otherY) {
        if (cell.getX() == otherX && cell.getY() == otherY) {
            return false;
        }
        return true;
    }
}
