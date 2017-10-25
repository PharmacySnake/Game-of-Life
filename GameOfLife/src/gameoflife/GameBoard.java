package gameoflife;

public class GameBoard {
    private int width;
    private int height;

    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public void setWidth(int newWidth) {
        this.width = newWidth;
    }
    
    public void setHeight(int newHeight) {
        this.height = newHeight;
    }
}
