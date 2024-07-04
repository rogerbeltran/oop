
package figures;

public class Square {
    private int length;

    public Square() {
    }
    public void printSquare() {
        for (int b = 0; b < length; b++) {
            for (int c = 0; c < length; c++)
                System.out.print("* ");
            System.out.println();

        }
    }
    public void printPerimeter(){
        double perimeter = length * 4;
        System.out.println("Square perimeter: " + perimeter + "[CM]");
    }

    public void printArea(){
        double area = length * length;
        System.out.println("Square area: " + area + "[CM]");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
