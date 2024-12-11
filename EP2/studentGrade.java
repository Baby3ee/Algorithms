package EP2;

import java.util.Random;

public class studentGrade {
    public static void main(String[] args) {
        // สร้างอาเรย์เก็บคะแนนของนักศึกษาทั้ง 10 คน
        int[] scores = new int[10];
        
        // สร้างอ็อบเจกต์ Random สำหรับสุ่มคะแนน
        Random rand = new Random();

        // สุ่มคะแนนให้กับนักศึกษา 10 คน
        for (int i = 0; i < scores.length; i++) {
            // สุ่มคะแนนในช่วง 40-99
            scores[i] = rand.nextInt(60) + 40; // (60 คือช่วงของตัวเลขที่สุ่มได้ 0-59 แล้วบวก 40 เพื่อให้ได้ช่วง 40-99
            System.out.println("Score of student " + (i + 1) + " is " + scores[i]);
        }
        
        System.out.println("\nCalculation Grade..");
        
        // คำนวณเกรดของนักศึกษาแต่ละคน
        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(scores[i]);
            System.out.println("Grade of student " + (i + 1) + " is " + grade);
        }
    }

    // ฟังก์ชันคำนวณเกรดตามคะแนน
    public static String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "A-";
        } else if (score >= 75) {
            return "B+";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 65) {
            return "B-";
        } else if (score >= 60) {
            return "C+";
        } else if (score >= 50) {
            return "C";
        } else if (score >= 45) {
            return "D+";
        } else if (score >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}