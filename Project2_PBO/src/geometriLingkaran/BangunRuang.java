/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
public abstract class BangunRuang extends Lingkaran{
    public double luasbola;
    public double volumebola;
    public BangunRuang(double r){
        super(r);
    }
   public abstract double getVolumeRuang();
   public abstract double getLuasPermukaan();
   
}
