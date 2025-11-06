//by mschro67

package p1;

public class p1_main{
    public static void main(String[] args){
        byte gewuerfelt=1;
        System.out.println("gewürfelt: "+gewuerfelt);
      
        if (gewuerfelt==1 || gewuerfelt==4){
            System.out.println("Gewonnen!");
        }else if (gewuerfelt==5)
            System.out.println("Verloren!");
        }else{
            System.out.println("Unbekannt!");
        }
    }
}
