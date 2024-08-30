import java.util.*;

public class JavaBasics {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the income : ");
        int income = sc.nextInt();
        int tex;
        if(income < 500000)
        {
            tex = 0;
        }
        else if(income >= 500000 && income <1000000)
        {
            tex = (int)(income * 0.2);
        }
        else 
        {
            tex = (int) (income * 0.3);
        }

        System.out.print("Your tex is = " + tex);


       

    }

    @Override
    public String toString() {
        return "JavaBasics []";
    }

}