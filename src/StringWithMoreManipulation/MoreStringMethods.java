package StringWithMoreManipulation;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;
public class MoreStringMethods {
    public static void main(String[] args) {

       String str="Hopkins";
       str=str.concat(" School");
        System.out.println(str);
        String str2= "Hopkins";
        str2=str2+" School";

        System.out.println(str2);

        System.out.println("=====================================================================");

        String name= "Bank of America";
        name=name.toUpperCase();
        System.out.println(name);
        name=name.toLowerCase();

        System.out.println(name.concat("best in the west"));

        System.out.println("=============================================================");

        String trimmed= "                                        Someone";
        trimmed=trimmed.trim();
        System.out.println(trimmed);


        System.out.println("=================================================================");

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name");
        String fullName= scan.nextLine().trim();
        System.out.println("Enter last name");
        String lastName = scan.nextLine().trim();

        System.out.println(fullName.concat(lastName));


scan.close();

    }
}
