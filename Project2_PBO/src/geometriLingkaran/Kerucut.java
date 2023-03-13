/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
class Kerucut extends Lingkaran{
    private double luaskerucut;
    private double volumekerucut;
    private double tinggi;
    private double miring;
    
    public Kerucut(double tinggi){
        super(4);
    }
    
    public Kerucut(double tinggi, double jari){
        super(jari);
    }

    public double hitungLuasKerucut(){
        // this.miring = Lingkaran.PI * super.r * super.r + Lingkaran.PI * super.r * this.miring;
        this.miring = Math.sqrt(super.r * super.r + this.miring * this.miring);
        this.luaskerucut = Lingkaran.PI * super.r * (super.r + this.miring);
        return this.luaskerucut; 
    }

    public double hitungVolumeKerucut() {
        this.volumekerucut = (1/3) * Lingkaran.PI * super.r * super.r * this.tinggi;
        return this.volumekerucut;
    }
}
