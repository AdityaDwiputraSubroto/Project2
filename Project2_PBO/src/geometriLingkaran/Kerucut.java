/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
public class Kerucut extends BangunRuang{
    private double tinggi;
    private double miring;
    
    public Kerucut(double tinggi){
        super(4);
        this.tinggi = tinggi;
    }
    
    public Kerucut(double tinggi, double jari){
        super(jari);
        this.tinggi = tinggi;
    }

    public double hitungLuasRuang(){
        this.miring = Math.sqrt(super.r * super.r + this.tinggi * this.tinggi);
       
        super.setLuas(Lingkaran.PI * super.r * (super.r + this.miring));
        return super.getLuas();
    }

    public double hitungVolumeRuang() {
        super.setVolume((Lingkaran.PI * super.r * super.r * this.tinggi) / 3);
        return super.getVolume();
    }
}
