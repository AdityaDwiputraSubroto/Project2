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
        Tabung cekson = new Tabung(5);
        double wew = cekson.hitungLuasTabung();
        Tabung cekson2 = new Tabung(5, 2);
        double wew2 = cekson2.hitungLuasTabung();
        
        System.out.println("Luas = " + wew);
        System.out.println("Luas 2 = " + wew2);
        
        System.out.println();
        System.out.println("BOLA");
        Bola coksen = new Bola(5);
        double wow = coksen.hitungLuasBola();
        Bola coksen2 = new Bola(5, 2);
        double wow2 = coksen2.hitungLuasBola();
        System.out.println("Luas = " + wow);
        System.out.println("Luas 2 = " + wow2);
        
        System.out.println();
        System.out.println("KERUCUT");
        Kerucut cekcek = new Kerucut(5);
        double www = cekcek.hitungLuasKerucut();
        Kerucut cekcek2 = new Kerucut(5, 2);
        double www2 = cekcek2.hitungLuasKerucut();
        System.out.println("Luas = " + www);
        System.out.println("Luas 2 = " + www2);
    }
}
