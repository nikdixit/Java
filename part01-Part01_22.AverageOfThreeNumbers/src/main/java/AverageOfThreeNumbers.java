
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        double a=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double b=Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        double c=Integer.valueOf(scanner.nextLine());
        double average=((double)a+b+c)/3;
        System.out.println("The average is "+average);

    }
}
