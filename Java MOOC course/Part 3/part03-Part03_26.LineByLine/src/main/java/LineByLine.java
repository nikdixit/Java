
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
//        String a=scanner.nextLine();
//        String[] pieces = a.split(" ");
        
        while(true){
            String a=scanner.nextLine();
            if(a.equals("")){
                break;
            }
        String[] pieces = a.split(" ");
        
        for(int i=0;i<pieces.length;i++){
            System.out.println(pieces[i]);
            }
        }
    }
}
