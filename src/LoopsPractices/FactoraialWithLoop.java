package LoopsPractices;
import java.util.Scanner;
public class FactoraialWithLoop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a Number for Factorial");
        int num=scan.nextInt();
        scan.close();

        int num2=1;

        for (int i= 1; num>=i; i++){
            num2 *=i;

        }

        System.out.println(num2);


    }
}
