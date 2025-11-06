//by mschro67

package h2;

public class h2_main {
    public static void main(String[] args){
        int jahr=2025;
        boolean schalt;
        schalt=false;

        if (jahr%100==0){
            if (jahr%400==0){
                schalt=true;
            }
        }else{
            if (jahr%4==0){
                schalt=true;
            }
        }

        System.out.println("jahr: "+jahr+", schalt: "+schalt);
    }
}
