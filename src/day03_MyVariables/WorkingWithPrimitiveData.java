package day03_MyVariables;

public class WorkingWithPrimitiveData {
    public static void main(String[] args) {
        // score is 85
        double  score = 85;

        System.out.println( score );
        System.out.println("score");

        //    long number0 = 9999999999;
        // int is preferred, compiler takes it as an int, and the number 999999999 is out of int' range

        long number1 = 9999999999L;

        double decimal1 = 0.5;
        //    float flot1  = 0.5; //double is preferred for decimals, compiler takes it as, double' range is greater than float
        float float2 = 0.5f;

        System.out.println(float2); //0.5

        /*
        in future:
                for integers: int
                for decimal: double
         */



    }
}
