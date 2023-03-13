/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
public class tes extends Lingkaran {
     public double luastabung = 0;
     public double tinggi = 0;
     //public float r = 0;
      
     public double hitungLuasTabung() {
         Lingkaran jj = new Lingkaran();
         //luasTabung = Lingkaran.PI*jj.r*jj.r*t;
         luasTabung = super.luasLingkaran*t;
         // luasTabung = super.getLuasLingkaran()*t;
     }
} 

