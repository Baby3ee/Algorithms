import java.util.Scanner;

public class logic {
    
public static void main(String[] args) {
    Scanner scanIn = new Scanner(System.in);
    System.out.print("input P");
    int p = scanIn.nextInt();
    System.out.print("input Q");
    int q = scanIn.nextInt();
    scanIn.close();
    if((p == 0 || p == 1) && (q == 0 || q == 1)){
        if(p == q){
            System.out.println(p + " XOR " + q + " = " +0);

        }else{
            System.out.println(p + " XOR " + q + " = " +1);
        }

        }else{
            System.out.println(("Error"));
        }
    }
}

