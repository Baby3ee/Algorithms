import java.util.Scanner;

public class fibonanci {
    
public static void main(String[] args) {
    Scanner scanIn = new Scanner(System.in);
    System.out.print("Enter a Fibonanci number:");
    int a = scanIn.nextInt();
    System.out.print("Calculating");
    scanIn.close();
    int f0 = 0, f1=1;

    if(a>=0){
        System.out.println("f0 = " + f0);
    }if(a >=1){
        System.out.println("f1 = " + f1);
    }for(int i =2; i<= a; i++){
        int fa= f0 + f1;
        System.out.println("f" + i+ " = "+fa);
        f0 = f1;
        f1 = fa;
    }
    System.out.println("Value of Fibonanci is " + f1);
}
}