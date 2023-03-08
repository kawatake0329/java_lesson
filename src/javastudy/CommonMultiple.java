package javastudy;

public class CommonMultiple {
    
    public static void main(String[] args) {
        int i = 1;
        // 2と3の倍数を、1～100未満の範囲で表示するプログラム
        while (i < 100) {
            if ((i % 2 == 0) && (i % 3 == 0)){
                // 演算子(論理積＆＆を使うことで両方満たしたものを出力[AND])
                System.out.println(i);
            }
            i++; //インクリメント演算子
        }
    }
}
