
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int fact=1;
        System.out.println("Give a number:");
        int a=scanner.nextInt();
        
        for(int i=1;i<=a;i++){
            fact*=i;
        }
        System.out.println("Factorial: "+fact);
    }
}
