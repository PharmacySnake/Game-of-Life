package gameoflife;

public class GameplayTools {

    private double random;
    
    public GameplayTools(int random) {
        this.random = random;
    }
    
    public void setGame(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (cellRandomStatus()) {
                    Cell cell = new Cell(width, height, true);
                    System.out.println("*");
                } else {
                    Cell cell = new Cell(width, height, false);
                    System.out.println(".");
                }
            }
        }
    }
    
    private boolean cellRandomStatus() {
        return Math.random() * 100 <= this.random;
    }
    
    public void checkVitality() {
        
    }
}
