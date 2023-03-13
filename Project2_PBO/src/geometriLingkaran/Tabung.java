/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

class Tabung extends Lingkaran{
    private double luasTabung;
    private double volumeTabung;
    private double tinggi = 5;
    
    public Tabung(double tinggi){
        super(4);
        this.tinggi = tinggi;
    }
    
    public Tabung(double tinggi, double jari){
        super(jari);
        this.tinggi = tinggi;
    }

    public double hitungLuasTabung(){
        this.luasTabung = 2*super.luasLingkaran + super.kelilingLingkaran*tinggi;
        return this.luasTabung; 
    }

    public double hitungVolumeTabung() {
        this.luasTabung = super.luasLingkaran * this.tinggi;
        return this.volumeTabung; 
    }
}