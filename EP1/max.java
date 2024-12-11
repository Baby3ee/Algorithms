import java.util.Scanner;

public class max {
    
public static void main(String[] args) {
    Scanner scanIn = new Scanner (System.in);
    int a = scanIn.nextInt();
    int b = scanIn.nextInt();
    int c = scanIn.nextInt();
    scanIn.close();

    if(a>b && a>c){
        System.out.println("A");
    }else if(b>a && b>c){
        System.out.println("B");
    }else if(c>a && c>b){
        System.out.println("C");
    }

    System.out.println();

}
}
