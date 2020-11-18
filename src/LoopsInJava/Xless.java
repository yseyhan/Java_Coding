package LoopsInJava;
import java.util.Scanner;

public class Xless {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a Name");
        String name=scan.nextLine();

        if(name.substring(0,1).equalsIgnoreCase("x")){
            System.out.println(name.substring(1));
        }else{
            System.out.println(name);
        }
scan.close();



    }
}
