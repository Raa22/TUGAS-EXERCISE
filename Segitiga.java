/**
 * Created by RockStar on 5/19/2015.
 */
public class Segitiga {
        int tinggi;
        int alas;
        int sisi_miring;

        public void cetakProperty() {
            System.out.println("tinggi = " + tinggi);
            System.out.println("alas = " + alas);
            System.out.println("sisi miring = "+sisi_miring);
        }

        public void ubahProperty(int t,int a,int sm) {
            tinggi = t;
            alas = a;
            sisi_miring=sm;

        }

        public int hitungLuas() {
            int luas;
            luas = alas*tinggi/2;
            return luas;
        }
        public int hitungKeliling(){
            int keliling;
            keliling=alas+(sisi_miring*2);
            return keliling;
        }
    }
