import java.util.*;
public class Tu_20 {
   public static void main(String[] args){
      Random rd = new Random();
      Scanner sc = new Scanner(System.in);
      System.out.print("\nHow many time you play the game : ");
      int n = sc.nextInt();

      for(int i = 1 ; i <= n ; i++){
         System.out.print("\n paper for 1 \n scissor for 2 \n stone for 3");
         System.out.print("\n Enter your choice as\' 1 , 2 , 3\' :-  ");
         int uChoice = sc.nextInt();

         int cChoice = rd.nextInt(3)+1;

         System.out.print("\n-----------------");

         System.out.print("\n user choice is: " + uChoice );
         System.out.print("\n computer choice is: " + cChoice);

         System.out.print("\n-----------------");

         if(uChoice == 1 && cChoice == 2){
            System.out.print("\ncomputer is win ");
         }

         else if(uChoice== 2 && cChoice == 1){
            System.out.print("\n you is win");
         }

         else if(uChoice == 1 && cChoice == 3){
            System.out.print("\n you is win");
         }

         else if(uChoice == 3 && cChoice == 1){
            System.out.print("\n computer is win");
         }

         else if(uChoice == 2 && cChoice == 3){
            System.out.print("\n computer is win");
         }

         else if(uChoice == 3 && cChoice == 2){
            System.out.print("\n you is win");
         }

         else if(uChoice == cChoice){
            System.out.print("\n game is tie");
         }

         else{
            System.out.print("\n inveled input");
         }
      }
   }
}
