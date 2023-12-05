/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan1;

/**
 *
 * @author ACER
 */
public class Mobil {

    String merk;
    String warna;
    int tahunproduksi;
    int kecepatan;

    public void Maju() {
        kecepatan += 10;
        System.out.println("Kecepatan saat ini\t " + kecepatan + " km/j");
    }

    public void Mundur() {
        if (kecepatan >= 10) {
            kecepatan -= 10;
        }
        System.out.println("Kecepatan saat ini\t " + kecepatan + " km/j");
    }

    public void Turun() {
        if (kecepatan >= 10) {
            kecepatan -= 10;
        }
        System.out.println("Kecepatan saat ini\t " + kecepatan + " km/j");
    }

}
