/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
class Bola extends BangunRuang{
//    private double luasbola;
//    private double volumebola;
    
    public Bola(double tinggi){
        super(4);
    }
    
    public Bola(double tinggi, double jari){
        super(jari);
    }

//    public double hitungLuasBola(){
//        this.luasbola = 4 * Lingkaran.PI * super.r * super.r;
//        return this.luasbola; 
//    }
//
//    public double hitungVolumeBola() {
//        this.volumebola = (4/3) * Lingkaran.PI * super.r * super.r * super.r;
//        return this.volumebola;
//    }
    
    public double HitungLuasPermukaan(){
        super.luasbola = 4 * Lingkaran.PI * super.r * super.r;
        return super.luasbola; 
    }

    public double getVolumeRuang() {
        super.volumebola = (4/3) * Lingkaran.PI * super.r * super.r * super.r;
        return super.volumebola;
    }
}
