package logic;

public class GameBoard {
    private int width;
    private int height;

    public GameBoard(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    protected int getWidth() {
        return this.width;
    }
    
    protected int getHeight() {
        return this.height;
    }
    
    protected void setWidth(int newWidth) {
        this.width = newWidth;
    }
    
    protected void setHeight(int newHeight) {
        this.height = newHeight;
    }
}
