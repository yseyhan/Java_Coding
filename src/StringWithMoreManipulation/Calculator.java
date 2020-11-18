package StringWithMoreManipulation;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

     Scanner scan= new Scanner(System.in);

        System.out.println("Enter a Number");
        double num1=scan.nextDouble();

        System.out.println("Enter a math operator");
        char operotor= scan.next().charAt(0);

        System.out.println("Enter a Number");
        double num2= scan.nextDouble();


        boolean isValid= operotor=='+'||operotor=='-'||operotor=='*'||operotor=='/'||operotor=='%';

        if(isValid){
            if (operotor=='+'){
                System.out.println("Addition: "+(num1+num2));
            }else if(operotor=='-'){
                System.out.println("Subtraction:"+ (num1-num2));
            }else if(operotor=='%'){
                System.out.println("Reminder:"+(num1%num2));
            }else if(operotor=='/'){
                System.out.println("Division:"+(num1/num2));
            }else if(operotor=='*')
                System.out.println("Multiplication:"+(num1*num2));

        }else{
            System.err.println("Invalid operator");
        }



        scan.close();







    }
}
