/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
public class cekk {
    public static void main(String[] args) {
        Bola tes = new Bola(5);
        Tabung tabung = new Tabung(5);
        System.out.println(tes.luasbola);
        System.out.println(tes.luasLingkaran);
        System.out.println(tes.getVolumeRuang());
        System.out.println(tabung.hitungVolumeTabung());
        
                
        System.out.println("TABUNG");
        Tabung cekson = new Tabung(5);
        double wew = cekson.hitungLuasTabung();
        Tabung cekson2 = new Tabung(5, 2);
        double wew2 = cekson2.hitungLuasTabung();
         System.out.println("Luas = " + wew);
        System.out.println("Luas 2 = " + wew2);
    }
}
