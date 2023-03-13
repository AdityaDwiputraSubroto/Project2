/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
public class Utama {
    public static void main(String[] args) {
        System.out.println("TABUNG");
        Tabung cekson = new Tabung(10);
        double wew = cekson.hitungLuasRuang();
        double wow = cekson.hitungVolumeRuang();
        
        System.out.println("Luas = " + wew);
        System.out.println("Volume = " + wow);
        
        System.out.println();
        System.out.println("BOLA");
        Bola coksen = new Bola(5);
        double wew2 = coksen.hitungLuasRuang();
        double wow2 = coksen.hitungVolumeRuang();

        System.out.println("Luas = " + wew2);
        System.out.println("Volume = " + wow2);
        
        System.out.println();
        System.out.println("KERUCUT");
        Kerucut cekcek = new Kerucut(10,5);
        double wew3 = cekcek.hitungLuasRuang();
        double wow3 = cekcek.hitungVolumeRuang();

        System.out.println("Luas = " + wew3);
        System.out.println("Volume = " + wow3);
        
        System.out.println("KERUCUT TERPANCUNG");
        KerucutTerpancung terpancung = new KerucutTerpancung(10,5,3,2);
       

        System.out.println("Luas = " + terpancung.hitungLuasRuang());
        System.out.println("Volume = " + terpancung.hitungVolumeRuang());
        
        System.out.println("KERATAN BOLA");
        KeratanBola keratan = new KeratanBola(10,5);
       

        System.out.println("Luas = " + keratan.hitungLuasRuang());
        System.out.println("Volume = " + keratan.hitungVolumeRuang());
        
         System.out.println("JURING");
        Juring juring = new Juring(10,90);
       

        System.out.println("Luas = " + juring.hitungLuasJuring());
        System.out.println("Keliling = " + juring.hitungKelilingJuring());
        
         System.out.println("TEMBERENG");
        Tembereng tembereng = new Tembereng(5,7,10,90);
       

        System.out.println("Luas = " + tembereng.hitungLuasTembereng());
        System.out.println("Keliling = " + tembereng.hitungKelilingTembereng());
    }
}
