
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int a=Integer.valueOf(scan.nextLine());
        
        if(a<5000){
            System.out.println("No tax!");
        }else if(a>=5000 && a<25000){
            System.out.println("Tax: "+(100+(a-5000)*0.08));
        }else if(a>=25000 && a<55000){
            System.out.println("Tax: "+(1700+(a-25000)*0.10));
        }else if(a>=55000 && a<200000){
            System.out.println("Tax: "+(4700+(a-55000)*0.12));
        }else if(a>=200000 && a<1000000){
            System.out.println("Tax: "+(22100+(a-200000)*0.15));
        }else if(a>=1000000){
            System.out.println("Tax: "+(142100+(a-1000000)*0.17));
        }
        
    }
}
