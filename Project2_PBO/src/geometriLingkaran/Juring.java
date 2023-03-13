/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
public class Juring extends Lingkaran {
    
    private double sudut,luasJuring,kelilingJuring;
    
    public Juring(double r, double sudut) {
        super(r);
        this.sudut = sudut;
    }
    
    public double hitungLuasJuring() {
        
        this.luasJuring = (this.sudut/360)* super.PI * Math.pow(super.r, 2);
        return luasJuring;
    }
    
    public double hitungKelilingJuring(){
        this.kelilingJuring = 2*super.r+(this.sudut/360.00)*super.kelilingLingkaran;
        return kelilingJuring;
    }
    
}
