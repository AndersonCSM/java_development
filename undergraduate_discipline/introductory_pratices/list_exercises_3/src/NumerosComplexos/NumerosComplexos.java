package NumerosComplexos;

public class NumerosComplexos {
    private double real;
    private double img;

    public NumerosComplexos(){
        this.real = 0;
        this.img = 0;
    }

    public NumerosComplexos(double real, double img){
        this.real = real;
        this.img = img;
    }

    public NumerosComplexos(double real){
        this.real = real;
        this.img = 0;
    }

    public String toString(){
        String stringImg = "";
        if (this.img > 0){
            stringImg += String.format("+%.2fi",img);
        } else if (this.img == 0){
            stringImg = "";
        } else {
            stringImg += String.format("%.2fi",img);
        }

        return String.format("%.2f%s",real, stringImg);
    }
}
