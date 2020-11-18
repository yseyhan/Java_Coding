package StringWithMoreManipulation;

import day05_UnaryOperators.PrimitiveCasting;

public class StringMethods3 {

    public static void main(String[] args) {
        String sentence ="Python is fun, Python is cool"; // A massage to batch 5

        sentence=sentence.replace("Python","Java" );
        System.out.println(sentence);

        String email = "yalcin.seyhan@hotmail.com";
        email=email.replace("hotmail","apple");

        String essay= "We set sail on this new sea because there is new knowledge to be gained, and new rights to be won, and they must be won and used for the progress of all people. For space science, like nuclear science and all technology, has no conscience of its own";
        essay=essay.replace("new","money");


        String string= "Python R JAVA, java";
        string =string.replace("R","is bad and I would be better off if I only say");

        System.out.println("=====================================================================");

        String catVsDog= "cats are friendly, cats are cute";
        catVsDog=catVsDog.replaceFirst("cats","dogs");


        String days="Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";

        days=days.replaceFirst("Monday","Sunday");
        days=days.replace("be Monday", "be Sunday");

        System.out.println("============================================================");


        String Email="yalcin.seyhan@hotmail.com";

        int B= Email.indexOf("@")+1;
        int E=Email.indexOf(".com");



        String domain= email.substring(B,E);

        System.out.println(domain);

        String movies="I like to watch movies and read books";

        String movies2=movies.substring(movies.lastIndexOf("ies"),movies.indexOf("books")+2);
        System.out.println(movies2);


        System.out.println("=============================================================");
        // isEmpty, equals, equalsIgnoreCase, contains, startsWith, endsWith


        String str= "Hello everyone";
        boolean yesNo=str.isEmpty();
        String nothingness="";
        boolean newa =nothingness.isEmpty();

        boolean por= yesNo&&newa;

        if (por){
            System.out.println("love");
        }else{
            System.out.println("not yet");
        }

        //contains
        String sentense1="I like to learn Java";

        boolean init= sentense1.contains("love");
        boolean in2= sentense1.contains("Java");

        System.out.println(in2);
        System.out.println(init);

        System.out.println("========================================");
        String page= "www.bombabomba.com";
        boolean pages=page.startsWith("www")||page.isEmpty()||page.endsWith(".com");
        System.out.println(pages);
















































    }
}
