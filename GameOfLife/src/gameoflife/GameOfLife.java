/*
  1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
  2. Any live cell with more than three live neighbours dies, as if by overcrowding.
  3. Any live cell with two or three live neighbours lives on to the next generation.
  4. Any dead cell with exactly three live neighbours becomes a live cell.
 */
package gameoflife;

public class GameOfLife {

    public static void main(String[] args) {
        GameBoard board = new GameBoard(0, 0);
        GameplayTools tools = new GameplayTools(0);
        
        tools.setGame(board.getWidth(), board.getHeight());
        
        tools.checkVitality();
    }

    
}
