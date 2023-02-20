

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);package problemCalculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator c = null;
        try{
            c = new Calculator(scan.nextInt(), scan.nextInt());
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.exit(1);
        }

       try{
           c.Add();
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
       try{
           c.Subtract();
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
       try{
           c.Multiplication();
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
       try {
           c.Division();
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }
    }
}

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
