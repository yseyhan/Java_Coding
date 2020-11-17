package ScannerWithStrings;

import java.security.SecureRandom;

public class CharAt {

    public static void main(String[] args) {

        String schoolName= "Hopkins";

        System.out.println(schoolName.charAt(0));
        char  second= schoolName.charAt(1);
        System.out.println(second);

        char last= schoolName.charAt(schoolName.length()-1);
        System.out.println(last);
        System.out.println("=============================================================================");

        String str= "jira";
        String str2=new String("jira");

        boolean isEqual= str==str2;
        System.out.println(isEqual);

        if(str.equals(str2)){
            System.out.println("Equals");

        }









    }



}
