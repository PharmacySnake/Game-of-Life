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
                } else {
                    this.cells.add(new Cell(x, y, false));
                }
            }
        }
    }

    //made for personal testing
    /*public void setSpecific() {
        for (int y = 0; y < this.board.getHeight(); y++) {
            for (int x = 0; x < this.board.getWidth(); x++) {
                if (y == 32 && x >= 28 && x <= 37) {
                    this.cells.add(new Cell(x, y, true));
                } else {
                    this.cells.add(new Cell(x, y, false));
                }
            }
        }
    }*/
    private boolean cellRandomStatus() {
        return Math.random() * 100 <= this.random;
    }

    public void nextGeneration() {
        List<Cell> nextGeneration = new ArrayList<>();

        this.cells.forEach((cell) -> {
            int neighbours = countNeighbours(cell);

            if (!cell.getStatus() && neighbours == 3) {
                nextGeneration.add(new Cell(cell.getX(), cell.getY(), true));

            } else if (cell.getStatus() && (neighbours == 2 || neighbours == 3)) {
                nextGeneration.add(new Cell(cell.getX(), cell.getY(), true));

            } else {
                nextGeneration.add(new Cell(cell.getX(), cell.getY(), false));
            }
        });
        this.cells = nextGeneration;
    }

    private int countNeighbours(Cell cell) {
        int neighbours = 0;
        int startX = setStart(cell.getX());
        int endX = setEnd(cell.getX());
        int startY = setStart(cell.getY());
        int endY = setEnd(cell.getY());

        for (int y = startY; y <= endY; y++) {
            for (int x = startX; x <= endX; x++) {
                if (notOverlapping(cell, x, y) && checkCellStatus(x, y)) {
                    neighbours++;
                }
            }
        }

        return neighbours;
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

    //Tells if cell is alive or not
    private boolean checkCellStatus(int x, int y) {
        for (Cell cell : this.cells) {
            if (cell.getX() == x && cell.getY() == y) {
                return cell.getStatus();
            }
        }

        return false;
    }

    //Compares the location of two cells and tells if they're overlapping
    private boolean notOverlapping(Cell cell, int otherX, int otherY) {
        return !(cell.getX() == otherX && cell.getY() == otherY);
    }

    //returns the list of cells
    public List getCells() {
        return this.cells;
    }
}
