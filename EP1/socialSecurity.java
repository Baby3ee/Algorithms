import java.util.Scanner;

public class socialSecurity {
    
public static void main(String[] args) {
    Scanner scanIn = new Scanner(System.in);
    System.out.print("input your salary:");
    float salary = scanIn.nextFloat();
    scanIn.close();
    float a = 0;
    if(salary <= 15000){
        a += salary * 0.05;
    }else{
        a += 15000 * 0.05;
    }
    System.out.println("Your Welfare is :" + a + "Bath");
}
}
