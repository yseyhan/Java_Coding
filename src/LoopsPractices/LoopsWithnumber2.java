package LoopsPractices;
import java.util.Scanner;

public class LoopsWithnumber2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int result= 0;

        for (int i =1; 6>i;i++){
            System.out.println("Enter a number "+ i);
            double number= scan.nextDouble();
             result+=number;// result += scan.nextInt(); // each user input will be added to result
        }
        System.out.println(result);
scan.close();
    }
}
