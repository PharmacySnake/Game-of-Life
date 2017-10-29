package logic;

import java.util.Scanner;

public class GameBoard {

    private int width;
    private int height;

    public GameBoard() {
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

    public void askForDimensions() {
        Scanner reader = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("determine width: ");
                this.width = Integer.parseInt(reader.nextLine());

                if (this.width > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("only positive whole numbers.");
            }
        }

        while (true) {
            try {
                System.out.print("determine Height: ");
                this.height = Integer.parseInt(reader.nextLine());

                if (this.height > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("only positive whole numbers.");
            }
        }
    }
}
