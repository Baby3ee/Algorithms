import java.util.Scanner;
public class loop {
    
public static void main(String[] args) {
    
    for(int i=1; i<= 5; i++){ // *จะทำการเริ่มตั้งแต่1ถึง5 โดยi++เป็นการเพิ่มค่าทีละ1
        for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i = 4; i>= 1; i--){ //จะเป็นการไล่จาก4ถึง1 โดยi--เป็นการลดค่าทีละ1
        for(int j = 1; j<= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}