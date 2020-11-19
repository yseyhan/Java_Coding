package LoopsPractices;
import java.util.Scanner;
public class loopsWithNumbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        int num1= scan.nextInt();
        scan.close();
int result= 0;

        if (num1 >= 1) {
            for (int i=1; num1>=i; i++){
            result+=i;

            }
            System.out.println(result);
        }else{
            System.err.println("invalid");
        }




    }
}
