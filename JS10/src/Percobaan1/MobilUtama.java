/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan1;

/**
 *
 * @author ACER
 */
public class MobilUtama {
    public static void main(String[] args){
        Mobil Honda = new Mobil();
        Honda.merk = "Civic";
        Honda.warna = " hitam";
        Honda.tahunproduksi = 2020;
        System.out.println("Merk\t " +  Honda.merk);
        System.out.println("Warna\t " +  Honda.warna);
        System.out.println("Tahun\t " +  Honda.tahunproduksi);
        Honda.Maju();
        Honda.Maju();
        
    }
}

