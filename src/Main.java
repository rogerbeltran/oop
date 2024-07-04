
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //printLine( 10);
        printSquare(6);

    }
    //  public static void printLine(int n){
    //    for(int i = 0; i < n; i++) {
    //      System.out.print("*");

    //}
    //System.out.print("* ");

    //}
    public static void printSquare(int a) {
        for (int b = 0; b < a; b++) {
            for (int c = 0; c < a; c++)
                System.out.print("* ");
            System.out.println();
            //}
        }
    }
}
