package StringWithMoreManipulation;
import java.util.Scanner;
public class StringPractices2 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a product name");

        String productName=scan.nextLine().replace(" ","").toLowerCase();

        switch (productName){
            case "iphone":
                System.out.println("Which model would you like ?");
                String iphoneName= scan.nextLine();
                if (iphoneName.equalsIgnoreCase("xr")){
                    System.out.println("MAcbook price is 2400$");
                }else if (iphoneName.equalsIgnoreCase("x")){

            }else{
                    System.out.println("We dont have it");
                }

            break;
            case "Ipad":
                System.out.println("Which model would you like");
                String model1= scan.nextLine();
                if (model1.equalsIgnoreCase("ipodmini")){
                    System.out.println(" price is 200$");
                }else if(model1.equalsIgnoreCase("ipodair"))
                    System.out.println("price 120$");
                break;




        }

















    }
}
