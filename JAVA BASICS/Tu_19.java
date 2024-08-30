import java.util.Scanner;
public class Tu_19 {
   public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      System.out.print("\n Enter the year : ");
      int year = sc.nextInt();

      if((year % 4 == 0 && year != 100) || year % 400 == 0){
         System.out.print("\n" + year + " is leap year");
      }

      else{
         System.out.print("\n" + year + " is not leap year");
      }
   }
}
