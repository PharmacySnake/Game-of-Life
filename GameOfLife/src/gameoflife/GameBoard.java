package gameoflife;

public class GameBoard {
    private int width;
    private int height;

    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    private int getWidth() {
        return this.width;
    }
    
    private int getHeight() {
        return this.height;
    }
    
    private void setWidth(int newWidth) {
        this.width = newWidth;
    }
    
    private void setHeight(int newHeight) {
        this.height = newHeight;
    }
}
