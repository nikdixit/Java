
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        double a=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double b=Integer.valueOf(scanner.nextLine());
        
        double average=((double)a+b)/2;
        System.out.println("The average is "+average);
    }
}
