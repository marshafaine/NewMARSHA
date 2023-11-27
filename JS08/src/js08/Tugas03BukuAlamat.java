/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js08;

/**
 *
 * @author ACER
 */
public class Tugas03BukuAlamat {
    public static void main(String[] args) {
        // Array 2D yang menyatakan isi buku alamat
        String[][] entries = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };

        // Cetak buku alamat dalam format yang diminta
        for (int i = 0; i < entries.length; i++) {
            System.out.println("Name : " + entries[i][0]);
            System.out.println("Tel. # : " + entries[i][1]);
            System.out.println("Address : " + entries[i][2]);
            System.out.println();
        }
    } 
}
