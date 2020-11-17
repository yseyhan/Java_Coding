package ScannerWithStrings;

public class Stringlen {
    public static void main(String[] args) {

        String str= "Pneumonoultramicroscopicsilicovolcanoconiosis";
        String str2= "word";

        int len1= str.length();
        int len2= str2.length();

        boolean isEqual= len1==len2;

        if(isEqual){
            System.out.println("I did good job");
        }else{
            System.out.println("Keep learning");
        }



    }
}
