/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

class Tabung extends BangunRuang{
    private double tinggi = 5;
    
    public Tabung(double tinggi){
        super(4);
        this.tinggi = tinggi;
    }
    
    public Tabung(double tinggi, double jari){
        super(jari);
        this.tinggi = tinggi;
    }

    public double hitungLuasRuang(){
        super.setLuas(2*super.getLuasLingkaran() + super.kelilingLingkaran*tinggi);
        return super.getLuas();
    }

    public double hitungVolumeRuang() {
        super.setVolume(super.getLuasLingkaran() * this.tinggi);
        return super.getVolume();
    }
}
