package gameoflife;

public class Cell {
    private int locationX;
    private int locationY;
    private boolean lifeStatus;

    public Cell(int locationX, int locationY, boolean alive) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.lifeStatus = alive;
    }
    
    private int getX() {
        return this.locationX;
    }
    
    private int getY() {
        return this.locationY;
    }
    
    private boolean getAlive() {
        return this.lifeStatus;
    }
    
    private void setX(int newX) {
        this.locationX = newX;
    }
    
    private void setY(int newY) {
        this.locationY = newY;
    }
    
    private void setAlive(boolean newStatus) {
        this.lifeStatus = newStatus;
    }
    
}
