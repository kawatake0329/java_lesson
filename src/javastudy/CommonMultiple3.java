package javastudy;

public class CommonMultiple3 {
    
    public static void main(String[] args) {
        int i = 1;
        // 2と3の公倍数以外の数を表示する
        while (i < 20) {
            if (!((i % 2 == 0) && (i % 3 == 0))){
                // NOT演算子の適用例
                System.out.println(i);
            }
            i++; //インクリメント演算子
        }
    }
}
