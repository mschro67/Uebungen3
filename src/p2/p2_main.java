//mschro67

package p2;

public class p2_main{
    public static void main(String[] args){
        int a=1,b=2,c=3;
        boolean E1=(a==b),E2=(a==b || a==c),E3=((a+b)>=c),E4=((a+b+c)>=100);
        byte d=0;
        
        System.out.println("a: "+a+", b: "+b+", c: "+c);
        
        if (E1){
            d+=1;
        }
        if (E2){
            d+=1;
        }
        if (E3){
            d+=1;
        }
        if (E4){
            d+=1;
        }
        System.out.println("d: "+d);
    }
}
