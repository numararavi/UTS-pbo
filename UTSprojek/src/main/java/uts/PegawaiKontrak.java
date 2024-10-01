/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author HP
 */
public class PegawaiKontrak extends Pegawai{
    private int lamaKontrak;

    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    public int lamaKontrak(){
        return lamaKontrak;
    }
    public void setLamaKontrak(int lamaKontrak){
        this.lamaKontrak = lamaKontrak;
    }
    @Override
    public void tampilInfo(){
        super.tampilInfo();
        System.out.println("lama kontrak = "+ lamaKontrak +"Bulan");
        
    }
    
    
    
}
