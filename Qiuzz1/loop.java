import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
    Scanner ScanIn = new Scanner(System.in);
    System.out.print("Enter N :");
        int n = ScanIn.nextInt();
        for(int i=1; i<= n; i++){ // *จะทำการเริ่มตั้งแต่1ถึง5 โดยi++เป็นการเพิ่มค่าทีละ1
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
