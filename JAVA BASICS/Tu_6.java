import java.util.*;
public class Tu_6 {
   public static void main(String[] srgs){

      Scanner sc = new Scanner(System.in);
      int total ;
      int sum ;
      float per;

      System.out.println("Enter you total marks of one paper");
      int total1 = sc.nextInt();

      total = total1 * 5 ;

      System.out.println("Enter marks subject 1: ");
      int sub1 = sc.nextInt();

      System.out.println("Enter marks subject 2: ");
      int sub2 = sc.nextInt();

      System.out.println("Enter marks subject 3: ");
      int sub3 = sc.nextInt();

      System.out.println("Enter marks subject 4: ");
      int sub4 = sc.nextInt();

      System.out.println("Enter marks subject 5: ");
      int sub5 = sc.nextInt();

      sum = sub1 + sub2 + sub3 + sub4 + sub5;
      
      per = (sum * 100.0f) / total;

      System.out.println("CBSE percentage = " + per + "%");
   }
   
}
