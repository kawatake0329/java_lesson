package javastudy;

public class DisplayMonth {

    public static void main(String[] args) {
        int month = 2;
        switch(month){
            // caseの行の値に該当するものを処理を行う
        case 1:
            System.out.println("January");
            break;
        case 2:
            System.out.println("February");
            break;
        case 3:
            System.out.println("March");
            break;
        case 4:
            System.out.println("April");
            break;
        default:
            break;
        }
    }
    
}
