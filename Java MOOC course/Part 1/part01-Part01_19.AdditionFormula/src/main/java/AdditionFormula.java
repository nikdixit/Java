
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int a= Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int b= Integer.valueOf(scanner.nextLine());
        
        int sum= (a+b);
        System.out.println(a+ " + "+ b +" = "+ sum);

        // write your program here

    }
}
