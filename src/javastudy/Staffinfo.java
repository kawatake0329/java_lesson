package javastudy;

class Staff {
    String name;
    int staffid;
    String email;
}

public class Staffinfo {

    public static void main(String[] args){
        Staff yamada = new Staff();
        yamada.name = "Taro Yamada";

        System.out.println(yamada.name);
    }
}
