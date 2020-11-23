package MoreLoops;
import java.util.Scanner;
public class MoreLoops {
    public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
   for(int i=0; i==0; ){

       System.out.println("Enter two numbers");
       int num1= scan.nextInt();
       int num2=scan.nextInt();

       System.out.println("result is "+(num1+num2));

       System.out.println("Would you like to continue?");
       String word=scan.next().toLowerCase();

       if(word.equalsIgnoreCase("no")){
           break;
       }

   }


        scan.close();
    }
}
