package LoopStatements;
public class ForLoopEx1 {
   // Code for Creating Pyramid pattern using For loop
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
