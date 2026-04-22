public class EntradaEmAgenda {
    private int hh;
    private int dd;
    private int mm;
    private int yy;
    private String assunto;

    EntradaEmAgenda(int hh, int dd, int mm, int yy, String assunto){
        if ((hh > 0) && (hh <=24)) {
            this.hh = hh;
        }
        else{
            this.hh = 0;
        }

        if ((dd > 0) && (dd <= 31))
            this.dd = dd;
        else
            this.dd = 1;

        if ((mm > 0) && (mm <=12)) {
            this.mm = mm;
        }
        else{
            this.mm = 1;
        }

        if ((yy > 0)) {
            this.yy = yy;
        }
        else{
            this.yy = 2000;
        }

        if (assunto.isEmpty()){
            assunto = "";
        } else {
            this.assunto = assunto;
        }
    }

    EntradaEmAgenda(int dd, int mm, int yy, String assunto){
        this.hh = 0;
        if ((dd > 0) && (dd <= 31))
            this.dd = dd;
        else
            this.dd = 1;

        if ((mm > 0) && (mm <=12)) {
            this.mm = mm;
        }
        else{
            this.mm = 1;
        }

        if ((yy > 0)) {
            this.yy = yy;
        }
        else{
            this.yy = 2000;
        }

        if (assunto.isEmpty()){
            assunto = "";
        } else {
            this.assunto = assunto;
        }
    }

    @Override
    public String toString(){
        return String.format("%s as %02d h de %02d / %02d / %04d", assunto, hh, dd, mm, yy);
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getYy() {
        return yy;
    }

    public void setYy(int yy) {
        this.yy = yy;
    }

}
