package javastudy;

class Staff {
    String name;
    int staffid;
    String email;

    public void sayhello(){
        // 下記のthis はこのクラスのことを指している。
        System.out.println("こんにちは " + this.name + this.staffid + this.email);
    }

    public Staff(String name, int staffid, String email) {
        this.name = name;
        this.staffid = staffid;
        this.email = email;
    }
}

public class Staffinfo {

    public static void main(String[] args){
        Staff yamada = new Staff("Taro Ymada",12345, "yamada@abc.co.jp" );
        // yamada.name = "Taro Yamada";

        yamada.sayhello();
        
        // System.out.println(yamada.name);
    }
}
