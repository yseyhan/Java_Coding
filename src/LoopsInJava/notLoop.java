package LoopsInJava;
import java.util.Scanner;
public class notLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");

        String word=scan.next();

        boolean isEmpthy=word.isEmpty();
        int moreThan3 =word.length();

        if (moreThan3>3){
            System.out.println(word.substring(word.length()-3));
        }else if(isEmpthy){
            System.out.println("Nada");
        }else{
            System.out.println(word);
        }


scan.close();



    }

}
