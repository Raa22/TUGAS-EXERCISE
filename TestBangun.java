/**
 * Created by RockStar on 5/19/2015.
 */
public class TestBangun {
    public static void main(String[] args) {
        Segitiga bangun_Segitiga = new Segitiga ();
        Lingkaran  bangun_Lingkaran = new Lingkaran ();

        bangun_Lingkaran.diameter = 22;
        bangun_Lingkaran.jari2 = 11;
        bangun_Lingkaran.phi = 3.14;

        bangun_Segitiga.tinggi = 3;
        bangun_Segitiga.alas = 2;
        bangun_Segitiga.sisi_miring =3;
        //hasil lingkaran
        bangun_Lingkaran.cetakProperty();
        System.out.println("Luas Lingkaran = " + bangun_Lingkaran.hitungLuasLingkaran());
        System.out.println("Keliling Lingkaran = "+bangun_Lingkaran.hitungKelilingLingkaran());
        System.out.println();

        //hasil segitiga
        bangun_Segitiga.cetakProperty();
        System.out.println("Luas Segitiga = "+bangun_Segitiga.hitungLuasSegitiga());
        System.out.println("Keliling Segitiga = "+bangun_Segitiga.hitungKelilingSegitiga());
        System.out.println();

        //property baru
        System.out.println("<<<<<<Property Setelah di Ubah>>>>>>");
        bangun_Lingkaran.diameter = 44;
        bangun_Lingkaran.jari2 = 22;
        bangun_Lingkaran.phi = 3.14;

        bangun_Segitiga.tinggi = 6;
        bangun_Segitiga.alas = 4;
        bangun_Segitiga.sisi_miring =6;
        //hasil lingkaran baru
        bangun_Lingkaran.cetakProperty();
        System.out.println("Luas Lingkaran = " + bangun_Lingkaran.hitungLuasLingkaran());
        System.out.println("Keliling Lingkaran = "+bangun_Lingkaran.hitungKelilingLingkaran());
        System.out.println();
        //hasil segitiga baru
        bangun_Segitiga.cetakProperty();
        System.out.println("Luas Segitiga = "+bangun_Segitiga.hitungLuasSegitiga());
        System.out.println("Keliling Segitiga = "+bangun_Segitiga.hitungKelilingSegitiga());


    }
}
