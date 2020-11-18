package StringWithMoreManipulation;

public class StringPractice3 {
    public static void main(String[] args) {
        String s1="cat";
        String  s2="cat";

        System.out.println(s1==s2);

        String s3=new String("cat");
        String s4=new String("cat");


        System.out.println(s1==s2);
        System.out.println(s3==s4);

        //.equals
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s2.equals(s3));


        System.out.println("========================================================");
        String str= "Johns Hopkins";

        str=str.toLowerCase();

        String fullname= "Yalcin Seyhan";

        int n = fullname.length();
        String lastIndex="What is your name?";
        int last= lastIndex.length()-1;
        char in= lastIndex.charAt(last);

        System.out.println(in);


































    }
}
