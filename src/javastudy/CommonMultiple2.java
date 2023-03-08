package javastudy;

public class CommonMultiple2 {
    
    public static void main(String[] args) {
        // ２または３の倍数を、1から５０未満の範囲で表示するプログラム
        int i = 1;
        while (i < 50) {
            if ((i % 2 == 0) || (i % 3 == 0)){
                // 演算子(論理和||を使うことで両方満たしたものを出力[OR])
                System.out.println(i);
            }
            i++; //インクリメント演算子
        }
    }
}
