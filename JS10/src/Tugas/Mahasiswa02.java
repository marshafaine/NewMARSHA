/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ACER
 */
public class Mahasiswa02 {
    // Atribut
    private String nama;
    private String nim;
    private String semester;
    private double ip;

    // Konstruktor
    public Mahasiswa02(String nama, String nim, String semester, double ip) {
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.ip = ip;
    }

    // Method untuk menentukan jumlah SKS berdasarkan IP
    public int hitungSks() {
        if (ip >= 3.5) {
            return 24;
        } else if (ip >= 3.0) {
            return 22;
        } else if (ip >= 2.5) {
            return 20;
        } else if (ip >= 2.0) {
            return 18;
        } else {
            return 15;
        }
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
        System.out.println("IP Semester ini: " + ip);
        System.out.println("Anda berhak mengontrak " + hitungSks() + " SKS pada Semester " + semester);
    }
}
