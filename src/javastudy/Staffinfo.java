package javastudy;

class Staff {
    String name;
    int staffid;
    String email;

    public void sayhello(){
        // 下記のthis はこのクラスのことを指している。
        System.out.println("こんにちは " + this.name);
    }
}

public class Staffinfo {

    public static void main(String[] args){
        Staff yamada = new Staff();
        yamada.name = "Taro Yamada";

        yamada.sayhello();
        
        System.out.println(yamada.name);
    }
}
