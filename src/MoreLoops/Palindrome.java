package MoreLoops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String word=scan.nextLine();

        String result ="";

        for (int i=word.length()-1;i==0;i--){

            result+=word.charAt(i);



        }
        if (word.equalsIgnoreCase(result)){
            System.out.println(result+" is a Palindrome word");
        }else{
            System.out.println(word+" is not a Palindrome word");
        }

scan.close();

    }

}
