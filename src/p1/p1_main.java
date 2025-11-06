//by mschro67

package p1;

public class p1_second{
    public static void main(String[] args){
        byte gewuerfelt=1;
        System.out.println("gewürfelt: "+gewuerfelt);
        switch (gewuerfelt){  //switch statt if + else...
            case 1:
                System.out.println("Gewonnen!");
                break;
            case 4:
                System.out.println("Gewonnen!");
                break;
            case 2:
                System.out.println("Verloren!");
                break;
            case 5:
                System.out.println("Unentschieden!");
                break;
            default:
                System.out.println("Unbekannt!");
                break;
        }
    }
}
