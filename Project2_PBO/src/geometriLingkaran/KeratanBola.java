/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometriLingkaran;

/**
 *
 * @author LENOVO
 */
public class KeratanBola extends BangunRuang {
    double height;
    
    public KeratanBola(double height, double r){
        super(r);
        this.height = height;
    }
    
    public double hitungLuasRuang(){
        super.setLuas(super.getKelilingLingkaran()*this.height);
        return super.getLuas();
    }
    
    public double hitungVolumeRuang(){
        super.setVolume(Math.PI/3 * Math.pow(this.height, 2) * (3 * super.r - this.height));
        return super.getVolume();
    }
}
