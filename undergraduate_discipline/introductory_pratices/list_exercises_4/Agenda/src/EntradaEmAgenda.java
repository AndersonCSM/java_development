import java.util.Date;

public class Agenda {
    private float hh;
    private int dd;
    private int mm;
    private int yy;

    Agenda(float hh, int dd, int mm, int yy){
        if ((hh > 0) && (hh <=24)) {
            this.hh = hh;
        }
        else{
            this.hh = 0f;
        }

        if ((dd > 0) && (dd <= 31))
            this.dd = dd;
        else
            this.dd = 1;

        if ((mm > 0) && (hh <=12)) {
            this.hh = hh;
        }
        else{
            this.hh = 1;
        }

        if ((yy > 0)) {
            this.hh = hh;
        }
        else{
            this.hh = 2000;
        }
    }


}
