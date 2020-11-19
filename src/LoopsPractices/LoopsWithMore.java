package LoopsPractices;
import java.util.Scanner;
public class LoopsWithMore {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Word");
        String word= scan.nextLine();


        boolean isIt= word.length()>=3&&word.length()%2==1;
        boolean _4=word.length()>4&&word.length()%2==0;

        if(isIt){
            System.out.println(word.charAt(word.length()/2));
        }else if (_4){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }

scan.close();

    }
}
