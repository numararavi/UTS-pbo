/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author HP
 */
public class PegawaiTetap extends Pegawai{
    private double tunjangan;
    
    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    public double getTunjangan(){
        return tunjangan;
    }
    public void setTunjangan(double tunjangan){
        this.tunjangan= tunjangan;
    }
    
    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("tunjangan = "+ tunjangan);  
    }
}
