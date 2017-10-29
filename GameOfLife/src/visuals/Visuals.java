package visuals;

import java.awt.Container;
import java.awt.Dimension;
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
    private final List<Cell> cells;
    private final int width;
    private final JTextArea area = new JTextArea();
    private final JPanel panel = new JPanel();
    private final int dmnsWidth;
    private final int dmnsHeight;

    public Visuals(GameplayTools tools, int width, int height) {
        this.tools = tools;
        this.tools.setGame();
        this.cells = this.tools.getCells();
        this.width = width;
        this.dmnsWidth = width * 16;
        this.dmnsHeight = height * 21;
    }

    @Override
    public void run() {
        this.frame = new JFrame("Game of Life");
        this.frame.setPreferredSize(new Dimension(this.dmnsWidth, this.dmnsHeight));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        generateComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void generateComponents(Container container) {
        this.panel.add(this.area);
        container.add(panel);
    }

    public void generation() {
        Font font = new Font("Consolas", Font.CENTER_BASELINE, 12);
        this.area.setFont(font);
        String s = "";

        int row = 0;
        for (Cell cell : this.cells) {
            if (row == this.width) {
                row = 0;
                s += "\n";
            }
            if (cell.getStatus()) {
                s += "■ ";

            } else {
                s += "  ";
            }
            row++;
        }
        
        this.area.setText(s);
    }
}
