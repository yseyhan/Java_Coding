package LoopsPractices;
import java.util.Scanner;
public class LoopsWithStrings {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to reverse");
        String word =scan.nextLine();


        String reversed= "";

        for (int i=word.length()-1; i>=0; i--){
            reversed+=word.charAt(i);

        }

        System.out.println(reversed);
        if (reversed.equalsIgnoreCase(word)){
            System.out.println(word+" is a palindrome");
        }else{
            System.out.println(word+" is not a palindrome");
        }





        scan.close();


        System.out.println("============================================");


        String q = "this word will be reversed like there is no tomorrow";

        String saved="";


        for(int i = q.length()-1; i>=0; i--){
            saved+=q.charAt(i);


        }

        System.out.println(saved);


    }
}
