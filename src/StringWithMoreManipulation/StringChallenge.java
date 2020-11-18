package StringWithMoreManipulation;
import java.util.Scanner;
public class StringChallenge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the first name");
        String name1=scan.next();
        System.out.println("Enter the second name");
        String name2=scan.next();

        String fullName= name1.substring(1)+name2.substring(1);
        System.out.println(fullName);





    }
}
/*
Task:
1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */