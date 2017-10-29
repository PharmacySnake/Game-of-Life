package logic;

public class Cell {

    private int locationX;
    private int locationY;
    private boolean lifeStatus;

    public Cell(int locationX, int locationY, boolean status) {
        this.locationX = locationX;
        this.locationY = locationY;
        this.lifeStatus = status;
    }

    protected int getX() {
        return this.locationX;
    }

    protected int getY() {
        return this.locationY;
    }

    protected boolean getStatus() {
        return this.lifeStatus;
    }

    protected void setX(int newX) {
        this.locationX = newX;
    }

    protected void setY(int newY) {
        this.locationY = newY;
    }

    protected void setStatus(boolean newStatus) {
        this.lifeStatus = newStatus;
    }

    protected boolean checkLocation(int otherX, int otherY) {
        return this.locationX == otherX && this.locationY == otherY;
    }
}
