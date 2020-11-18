package LoopsInJava;
import java.util.Scanner;

public class Karla {
    public static void main(String[] args) {
        System.out.println("Enter a name");
        Scanner scan= new Scanner(System.in);
        String name=scan.nextLine();


       name= name.substring(name.length()-2);
       switch (name){
           case "ma":
               System.out.println("I love you");
               break;
           default:
               System.out.println("Never mind");
       }

        scan.close();



    }
}
