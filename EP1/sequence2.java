import java.util.Scanner;

public class sequence2 {

    public static void main(String[] args) {
        int sum1 = 0;
        System.out.print("Sequence 8.1");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
            sum1 += i;
        }
        System.out.print("\sum = " + sum1);

        int sum2 = 0;
        System.out.print("Sequence 8.2");
        for (int i = 1; i <= 19; i += 2) {
            System.out.print(i + " ");
            sum2 += i;
        }
        System.out.print("\sum =" + sum2);

        int sum3 = 0;
        System.out.print("Sequence 8.3");
        for (int i = 1; i <= 19; i = -i + (i > 0 ? -2 : 2)) {
            System.out.print(i + " ");
            sum3 += i;
        }
        System.out.print("\sum = " + sum3);
    }

}