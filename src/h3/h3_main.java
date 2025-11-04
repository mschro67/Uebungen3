//by mschro67

package h3;

public class h3_main {
    public static void main(String[] args) {
        int max=5,fix=2,wartend=2;
        boolean istVoll=(!(fix<max));

        System.out.println("wartend: "+wartend+", fix: "+fix+", max: "+max+", istVoll: "+istVoll);

        while (!(istVoll) && !(wartend==0)){
            fix+=1;
            wartend-=1;
            istVoll=(!(fix<max));
        }

        istVoll=(!(fix<max));

        System.out.println("wartend: "+wartend+", fix: "+fix+", max: "+max+", istVoll: "+istVoll);
    }
}