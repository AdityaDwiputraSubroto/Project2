/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
public class Tembereng extends Lingkaran {  
    private double sudut,luasTembereng,kelilingTembereng,tinggi,alas,luasSegitiga;
    
    public Tembereng(double alas, double tinggi, double r, double sudut) {
        super(r);
        this.sudut = sudut;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public double hitungLuasSegitiga(){
        luasSegitiga = this.alas*this.tinggi/2;
        System.out.println("luas segitiga : "+luasSegitiga);
        return luasSegitiga;
    }
    
    public double hitungLuasTembereng() {
        Juring juring = new Juring(super.r, this.sudut);
        luasTembereng = juring.hitungLuasJuring()-hitungLuasSegitiga();
        return luasTembereng;
    }
    
    public double hitungKelilingTembereng(){
        kelilingTembereng = 2*this.r + this.alas;
        return kelilingTembereng;
    }
}
