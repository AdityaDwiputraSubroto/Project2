/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
public class KerucutTerpancung extends Kerucut{
    private double tinggi;
    private double miring;
    private double tinggiTerpancung;
    private double rTerpancung;
    
   
    public KerucutTerpancung(double tinggi, double jari, double tinggiTerpancung, double rTerpancung){
        super(tinggi,jari);
        this.tinggi = tinggi;
        this.rTerpancung = rTerpancung;
        this.tinggiTerpancung = tinggiTerpancung;
    }

    public double hitungLuasRuang(){
        Kerucut terpancung = new Kerucut(this.tinggiTerpancung, this.rTerpancung);
        super.setLuas(2*terpancung.getLuasLingkaran()+super.hitungLuasRuang()-terpancung.hitungLuasRuang());
        return super.getLuas();
    }

    public double hitungVolumeRuang() {
        Kerucut terpancung = new Kerucut(this.tinggiTerpancung, this.rTerpancung);
        super.setVolume(super.hitungVolumeRuang()-terpancung.hitungVolumeRuang());
       
        return super.getVolume();
    }
}
