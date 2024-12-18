package EP2;

import java.util.Scanner;

public class ReverseArray {
     public static void main(String[] args) {
        // สร้าง Scanner สำหรับรับข้อมูลจากผู้ใช้
        Scanner scanner = new Scanner(System.in);
        
        // รับขนาดของ Array จากผู้ใช้
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // สร้าง Array ตามขนาดที่รับเข้ามา
        int[] array = new int[size];
        
        // รับค่าจำนวนเต็มสำหรับแต่ละตำแหน่งใน Array
        System.out.print("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // แสดงผลลัพธ์แบบตามลำดับหน้าไปหลัง
        System.out.print("\nArray in forward order:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        // แสดงผลลัพธ์แบบตามลำดับหลังไปหน้า
        System.out.print("\nArray in reverse order:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        
        // ปิด Scanner
        scanner.close();
    }
}

