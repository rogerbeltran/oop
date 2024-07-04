public static void main(String[] args) {
    //printLine( 10);
    //printSquare(6);


    printTriangle(3);
    printTriangle(5);
    printTriangle(7);

}

public static void printTriangle(int T) {
    System.out.println( "---------------Printing Square Triangsle-----------------------");
    for (int Altura = 0; Altura < T; Altura++) {
        for (int Ancho = 0; Ancho < T; Ancho++) {
            if (Ancho <= Altura) {
                System.out.print(" * ");
            }
        }
        System.out.println();
    }
}
    