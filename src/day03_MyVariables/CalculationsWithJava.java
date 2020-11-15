package day03_MyVariables;

public class CalculationsWithJava {
    public static void main(String[] args) {

        // width : 5, length: 20

        int width = 5;
        int length = 20;

        int area = width * length;
        //          5    *   20
        int perimeter = width * 2 + length * 2;

        System.out.print("Area is: ");
        System.out.print( area );

        System.out.print("\nPerimeter is: ");
        System.out.print( perimeter );

        System.out.println("==============================================================================");

        //side=100
        int side =100;
        int areaOfSquare =100*100;
        int perimeterOfSquare = 4*side;

        System.out.println("Area of Square is: ");
        System.out.println(areaOfSquare);

        System.out.println("Perimeter of Square: ");
        System.out.println(perimeterOfSquare);
        System.out.println("====================================================================================");

    }
}
/*
 declare variables:
        DataType name = Data;
 */