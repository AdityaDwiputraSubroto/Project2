/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;


public class Lingkaran {
    public static final double PI = 3.14159265359;
    public double x, y; 
    public double luasLingkaran;
    public double r = 5;
    public double kelilingLingkaran;

    public Lingkaran(double r){
        this.r = r;
    }

    public double getLuasLingkaran() {
         this.luasLingkaran = PI * this.r * this.r;
         return luasLingkaran;
        // this.luasLingkaran = ;
        // return PI * this.r * this.r;
    }
    
    public double getKelilingLingkaran(){
        this.kelilingLingkaran = 2*PI*r;
        return kelilingLingkaran;
    }
}

