import java.util.Scanner;

public class DollarToRupees {
    public static void main(String[] args) {
       
        double Rate = 82.65; 
        
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the amount in dollars: ");
        

        double dollars = scanner.nextDouble();
        

        scanner.close();
        
       
        double rupees = dollars * Rate;
        

        System.out.println(dollars + " dollars is equal to " + rupees + " rupees.");
    }
}
