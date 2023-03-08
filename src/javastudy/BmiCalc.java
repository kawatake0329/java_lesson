package javastudy;

import java.util.Scanner;

public class BmiCalc {
// BMI(体格指数)を計算するプログラム
// BMI　＝　体重　/　(身長　*　身長)
// 体重　kg,　身長　cm

    public static void main(String[] args){
        double weight,height,bmi;

        // weight = 63;
        // height = 170;

        Scanner stdIn = new Scanner(System.in);
        System.out.println("体重は? (kg):");
        weight = stdIn.nextDouble();
        System.out.println("身長は? (kg):");
        height = stdIn.nextDouble();

        height /= 100;

        bmi = weight / (height * height);

        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("やせ型です/nもう少し食べましょう!");
        }else if (bmi < 25) {
            System.out.println("標準です\nこのまま維持しましょう!");
        } else {
            System.out.println("肥満です\n 痩せましょう！");
        }

    }
    
}
