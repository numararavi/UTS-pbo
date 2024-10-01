/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts;

/**
 *
 * @author HP
 */
class Elektronik extends Produk {
    private int garansi; // dalam tahun

    public Elektronik(String nama, double harga, int garansi) {
        super(nama, harga);
        this.garansi = garansi;
    }

    public int getGaransi() {
        return garansi;
    }

    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
