package MoreLoops;
import java.util.Scanner;
public class StrReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word to reverse");
        String word= scan.nextLine();

        String result="";
        for (int i=word.length()-1; i>=0; i--){
            result += word.charAt(i);


        }

        System.out.println(result);
scan.close();

    }
}
