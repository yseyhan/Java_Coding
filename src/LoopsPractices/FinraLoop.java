package LoopsPractices;

public class FinraLoop {
    public static void main(String[] args) {

         for (int i=1; 100>=i; i++){
             if (i%3==0&&i%5==0){
                 System.out.print(" Finra ");
             }else if(i%3==0){
                 System.out.print(" fin ");
             }else if(i%5==0){
                 System.out.print(" ra ");
             }else{
                 System.out.print(i+" ");
             }

             //  System.out.print( (i%3==0 && i%5 ==0)? "FINRA " :(i%3==0)? "FIN " : (i%5==0)? "RA ":i+" ");
         }
    }
}
