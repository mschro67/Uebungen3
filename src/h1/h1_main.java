//by mschro67

package h1;

public class h1_main {
    public static void main(String[] args){
        double guthaben=-100,monEingang=200;
        int rating=-2;
        boolean warnhinweis,negativ;
        warnhinweis=false;
        negativ=false;

        System.out.println("guthaben: "+guthaben+", monEingang: "+monEingang);

        if (guthaben<0){
            negativ=true;
        }else if (guthaben>0){
            rating+=3;
        }else if (guthaben==0){
            rating+=2;
        }
        if (guthaben<0) {
            if (monEingang>=guthaben){
                rating+=1;
            }else if (monEingang<guthaben){
                rating-=1;
            }
            if (monEingang<guthaben && rating<0){
                warnhinweis=true;
            }
        }
        System.out.println("rating: "+rating+", warnhinweis: "+warnhinweis+", negativ: "+negativ);
    }
}
