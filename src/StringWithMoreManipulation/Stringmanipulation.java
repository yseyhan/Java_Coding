package StringWithMoreManipulation;
import java.util.Scanner;
public class  Stringmanipulation {
    public static void main(String[] args) {

        String str= "Today is monday";

        String day=str.substring(str.indexOf("m"),str.length());
        System.out.println(day);
String email="yalcin.seyhan@hotmail.com";

String domain= email.substring(email.indexOf("@")+1, email.length()-4);
        System.out.println(domain);

        String s1= "I like to study and I like read";
        String sub= s1.substring(s1.indexOf("s"),15);
        System.out.println(sub);

        System.out.println("====================================================");

        String name ="yalcin";
        String lastname="Seyhan";

        String fullName= name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+" "+lastname.substring(0,1)+
                lastname.substring(1).toLowerCase();
        System.out.println(fullName);

        System.out.println("==============================================");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your School name");

        String schoolName=scan.nextLine().toLowerCase();

        schoolName=schoolName.substring(0,1).toUpperCase()+schoolName.substring(1,schoolName.indexOf(" "))+
                schoolName.substring(schoolName.indexOf(" "),schoolName.length()).toUpperCase();

        System.out.println(schoolName);







scan.close();





    }
}
