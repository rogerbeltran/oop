package Figures;

import java.util.logging.Level;

public class Line {
    private int lenght;

    public Line() {
    }
    public Line(int length) { this.lenght = lenght;}



    public void printLine() {
        for (int i = 0; i < lenght; i++) {
            System.out.print("*");
            System.out.print("* ");
        }
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int length) {
        this.lenght = length;
    }
}