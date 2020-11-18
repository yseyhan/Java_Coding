package StringWithMoreManipulation;
import java.util.Scanner;
public class Checklengths {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word");
        String w1=scan.next();
        System.out.println("Enter another word");
        String w2=scan.next();
        System.out.println("Enter the last word");
        String w3=scan.next();

        boolean isIt= w1==w2&&w2==w3;
        if (isIt){
            System.out.println("They are all equal");
        }else if(w1==w2||w1==w2||w2==w3){
            System.out.println("Not sure");
        }else{
            System.out.println("not equal");
        }

        int a1=w1.length();
        int a2= w2.length();
        int a3=w3.length();

        boolean isEqual= a1==a2&&a1==a3;


        if (isEqual){
            System.out.println("same length");
        }else if(a1==a2||a1==a3||a2==a3){
            System.out.println("not sure");

        }else{
            System.out.println("not same length");
        }


scan.close();

    }
}
