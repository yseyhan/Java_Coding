package MoreLoops;
import java.util.Scanner;
public class WordChecking {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
        System.out.println("enter your first word");
        String word1=scan.nextLine();
        System.out.println("Enter a Number");
        int num=scan.nextInt();
        System.out.println("Enter a letter");
        char Ch= scan.next().charAt(0);

        int long1= word1.length();
        boolean abc =num==Ch;

        if(num==Ch){
            System.out.println("bingo");

        }else{
            System.out.println("Try again");
        }

scan.close();


    }
}

