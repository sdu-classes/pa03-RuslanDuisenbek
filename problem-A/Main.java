package problemCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator c = new Calculator(scan.nextInt(), scan.nextInt());
       try{
           c.Add();
       }catch (ArithmeticException e){
           System.out.println("You enter a negative number");
       }
       try{
           c.Subtract();
       }catch (ArithmeticException e){
           System.out.println("You enter a negative number");
       }
       try{
           c.Multiplication();
       }catch (ArithmeticException e){
           System.out.println("One of this numbers is zero ");
       }
       try {
           c.Division();
       }catch (ArithmeticException e){
           System.out.println("One of this numbers is zero");
       }
    }
}
