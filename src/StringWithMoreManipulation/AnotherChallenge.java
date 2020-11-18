package StringWithMoreManipulation;
import java.util.Scanner;
public class AnotherChallenge {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word");
        String w1=scan.next();
        System.out.println("Enter another word");
        String w2 = scan.next();

        boolean isIt= w1.substring(w1.length()-1).equalsIgnoreCase(w2.substring(0,1));
        String new1=w1+w2;
        String new2= w1+w2.substring(1);

        if (isIt){
            System.out.println(new2);
        }else{
            System.out.println(new1);
        }



scan.close();

    }
}
