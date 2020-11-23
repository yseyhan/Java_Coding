package MoreLoops;
import java.rmi.ServerError;
import java.util.Scanner;
public class SumCal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a Number " );

        int num = scan.nextInt();
        int re=0;
        if (num>1){
            for (int i=0; num>=i; i++){
                re+=i;

            }
            System.out.println(re);
        }else{
            System.err.println("Invalid number");
        }



    }
}
