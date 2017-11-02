/*
  1. Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
  2. Any live cell with more than three live neighbours dies, as if by overcrowding.
  3. Any live cell with two or three live neighbours lives on to the next generation.
  4. Any dead cell with exactly three live neighbours becomes a live cell.
 */
package logic;

import java.util.concurrent.TimeUnit;
import javax.swing.SwingUtilities;
import visuals.Visuals;

public class GameOfLife {

    public static void main(String[] args) throws InterruptedException {
        GameBoard board = new GameBoard();
        board.askForDimensions();

        GameplayTools tools = new GameplayTools(20, board);
        Visuals visuals = new Visuals(tools, board.getWidth(), board.getHeight());
        SwingUtilities.invokeLater(visuals);

        while (true) {
            visuals.writeGeneration();
            TimeUnit.MILLISECONDS.sleep(1);
            tools.nextGeneration();
        }
    }

}
