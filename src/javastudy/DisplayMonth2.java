package javastudy;

public class DisplayMonth2 {

    public static void main(String[] args) {
        String[] month = {"January","February","March","April","May",
        "June","July","August","September","October","Nobember","December"};

        for (int i = 0; i < 12; i++){
            System.out.println(month[i]);
            // 恐らく、変数内の０から１２番目までのものを取り出すもの、
            // 番号を指定しなかった場合は？([Ljava.lang.String;@5ca881b5)エラー文？が表示された
            
        }
    }
    
}
