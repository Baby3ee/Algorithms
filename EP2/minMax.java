package EP2;

import java.util.Scanner;
public class minMax {
    public static int mymax(int a, int b, int c) {
        int max = a;  // เริ่มต้นจากค่า a เป็นค่ามากที่สุด
        if (b > max) {
            max = b;  // ถ้า b มากกว่า max, เปลี่ยน max เป็น b
        }
        if (c > max) {
            max = c;  // ถ้า c มากกว่า max, เปลี่ยน max เป็น c
        }
        return max;
    }

    // ฟังก์ชันในการหาค่าน้อยที่สุด
    public static int mymin(int a, int b, int c) {
        int min = a;  // เริ่มต้นจากค่า a เป็นค่าน้อยที่สุด
        if (b < min) {
            min = b;  // ถ้า b น้อยกว่า min, เปลี่ยน min เป็น b
        }
        if (c < min) {
            min = c;  // ถ้า c น้อยกว่า min, เปลี่ยน min เป็น c
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // รับค่า 3 ตัวจากผู้ใช้
        System.out.print("Input first number: ");
        int a = scanner.nextInt();
        System.out.print("Input second number: ");
        int b = scanner.nextInt();
        System.out.print("Input third number: ");
        int c = scanner.nextInt();

        // หาค่ามากที่สุดและค่าน้อยที่สุด
        int maxValue = mymax(a, b, c);
        int minValue = mymin(a, b, c);

        // คำนวณผลลัพธ์จากการบวกค่ามากที่สุดและค่าน้อยที่สุด
        int total = maxValue + minValue;

        // แสดงผลลัพธ์
        System.out.println("Max value = " + maxValue);
        System.out.println("Min value = " + minValue);
        System.out.println("Total Max plus Min is " + total);

        scanner.close();  // ปิด scanner
    }
}
