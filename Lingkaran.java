/**
 * Created by RockStar on 5/19/2015.
 */
public class Lingkaran {
    int diameter;
    int jari2;
    double phi;

    public void cetakProperty() {
        System.out.println("diameter = " + diameter);
        System.out.println("phi = " + phi);
        System.out.println("jari-jari = "+jari2);
    }

    public void ubahProperty(int d,int r,double ph) {
        diameter = d;
        phi = ph;
        jari2 = r;
    }

    public double hitungLuas() {
        double luas;
        luas = phi *jari2*jari2;
        return luas;
    }
    public double hitungKeliling(){
        double keliling;
        keliling= phi*diameter;
        return keliling;
    }
}