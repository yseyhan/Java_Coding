package LoopsInJava;
import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String w1=scan.next();
        System.out.println("Enter your second word");
        String w2=scan.next();

        int aa=w1.length();
        int bb=w2.length();

        boolean isIt= aa==bb;

        if (isIt){
            System.out.println("Same length");

        }else{
            System.out.println("Not Same");
        }


        scan.close();

    }
}
