/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author HP
 */
public class Produk {
    private String nama;
    private double harga;
    
    public Produk(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama ;
        
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public void tampilInfo(){
        System.out.println("Nama produk = "+ nama);
        System.out.println("harga = "+ harga);
    }
}
