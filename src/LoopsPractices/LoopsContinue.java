package LoopsPractices;

public class LoopsContinue {
    public static void main(String[] args) {
         for (int i=1; 50>=i; i++){
             if(i%2==0){
                 continue;
             }
             System.out.print(i+" ");
         }
        System.out.println();
for (int i=1; 50>=i; i++){
    if (i%3==0){
        continue;
    }
    System.out.print(" "+i);
}
        System.out.println();
for (int i=1;100>=i;i++){
    if (i%3==0&&i%5==0){
        continue;
    }else{
        System.out.print(i+" ");
    }

}

    }
}
