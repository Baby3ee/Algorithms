import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = scanIn.nextInt();
        scanIn.close();

        int fact = 1;
        for (int i = 1; i <= a; i++) {
            System.out.println(i + "! =" + fact);
            fact += fact * i;

        }
    }
}
