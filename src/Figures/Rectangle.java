
package figures;

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
    public void printPerimeter(){
        double perimeter = (width *2 ) + (height * 2);
        System.out.println("Rectangle Perimeter" + perimeter + "[cm]");
    }
    public void printArea(){
        double area = width * height;
        System.out.println("Rectangle Area" + area + "[cm]");
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
