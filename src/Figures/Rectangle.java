package Figures;

import org.w3c.dom.css.Rect;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public void printRectangle() {
        for (int b = 0; b < width; b++) {
            for (int c = 0; c < height; c++)
                System.out.print("* ");
            System.out.println();
        }
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}