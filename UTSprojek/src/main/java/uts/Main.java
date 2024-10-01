/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[]args){
        Produk produk1= new Elektronik("IPHONE",150000,5);
        Produk produk2= new Makanan("MILO", 100000," 21 Januari 2022");
        
        Pegawai pegawai1= new PegawaiTetap("Gray Fulbuster",5000000,3000000);
        Pegawai pegawai2= new PegawaiKontrak("Natsu Dragneel",1000000,6 );
        
        produk1.tampilInfo();
        System.out.println();
        produk2.tampilInfo();
        System.out.println();
        pegawai1.tampilInfo();
        System.out.println();
        pegawai2.tampilInfo();
        System.out.println();
               
    }
}
