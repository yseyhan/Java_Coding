package day04_MyVariablesContinues;

public class CurrencyCalculator {
    public static void main(String[] args) {
        //I will create a better one with a UI and real-time updates but step-by-step
        double dollar= 1;
        double lira = dollar / 0.13;
        double euro = dollar / 1.16;
        double rubles = dollar * 78.22;
        double JYP = dollar/0.009;
        double som = dollar * 80;

        double AZN = dollar * 1.7;
        double PLN = dollar * 3.6;
        double AFG = dollar * 76.9;
        double CAD = dollar * 1.34;
        double PAK = dollar * 165.7;

        String result = dollar+"$ equal to ";

        System.out.println(result+lira+" lira");
        System.out.println(result+euro +" euro");
        System.out.println(result+rubles+" rubles");
        System.out.println(result+JYP+" JYP");
        System.out.println(result+som+" som");
        System.out.println(result + AZN +" AZN");
        System.out.println(result+PLN+" PLN");
        System.out.println(result + AFG+" AFG");
        System.out.println(result+CAD+" CAD");
        System.out.println(result+PAK+" PAK");



    }
}
