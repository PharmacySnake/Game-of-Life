package visuals;

import java.awt.Container;
import java.awt.Font;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import logic.Cell;
import logic.GameplayTools;

public class Visuals implements Runnable {

    private JFrame frame;
    private final GameplayTools tools;
    private List<Cell> cells;
    private final int width;
    private final JTextArea area;
    private final JPanel panel = new JPanel();
    Font font = new Font("Consolas", Font.CENTER_BASELINE, 12);

    public Visuals(GameplayTools tools, int width, int height) {
        this.tools = tools;
        this.tools.setGame();
        this.cells = this.tools.getCells();
        this.width = width;
        this.area = new JTextArea(width, height);
        this.area.setFont(this.font);

    }

    @Override
    public void run() {
        this.frame = new JFrame("Game of Life");
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        generateComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void generateComponents(Container container) {
        this.panel.add(this.area);
        container.add(panel);
    }

    public void writeGeneration() {
        updateList();
        String listOnString = "";

        int row = 0;
        for (Cell cell : this.cells) {
            if (row == this.width) {
                row = 0;
                listOnString += "\n";
            }
            
            if (cell.getStatus()) {
                listOnString += "■ ";

            } else {
                listOnString += "  ";
            }
            row++;
        }

        this.area.setText(listOnString);
    }
    
    public void updateList() {
        this.cells = this.tools.getCells();
    }
}
