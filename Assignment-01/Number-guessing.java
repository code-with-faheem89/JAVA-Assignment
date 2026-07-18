import java.util.Scanner;

public class Qs4 {


   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
        int secret_num = 27;
        for(int i=0;i<5;i++){
            int n=sc.nextInt();
            if(n==secret_num){
                System.out.println("Congrats You Guessed it Right!");
                break;
            }else if(n>secret_num){
                System.out.println("Too High!");
            }else if(n<secret_num){
                System.out.println("Too Low!");
            }
            else{
                System.out.println("Better Luck Next Time!");
            }
        }

   }
}
