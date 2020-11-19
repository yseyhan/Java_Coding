package LoopsPractices;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word");
        String word= scan.next();


        int last= word.length()-1;

        char f=word.charAt(0);
        char l=word.charAt(last);

        System.out.println(""+f+l);








    }
}
