package ScannerWithStrings;

public class String_Memory_Heap_Pool {
    public static void main(String[] args) {

        String strOne= "Java";
        String strTwo="Java";

        String strThree=new String("Java");
        String strFour=new String("Java");

        boolean poolCheck= strOne==strTwo;
        boolean heapCheck= strFour==strThree;
        boolean normalCheck= strFour==strTwo;
        System.out.println(poolCheck);
        System.out.println(heapCheck);
        System.out.println(normalCheck);

    }
}
