/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas06;

import java.util.Scanner;

public class BilanganA {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka antara 1 hingga 10: ");
        int angka = scanner.nextInt();

        // Mengonversi angka menjadi kata yang sesuai
        String kata = "";

        if (angka == 1) {
            kata = "Satu";
        } else if (angka == 2) {
            kata = "Dua";
        } else if (angka == 3) {
            kata = "Tiga";
        } else if (angka == 4) {
            kata = "Empat";
        } else if (angka == 5) {
            kata = "Lima";
        } else if (angka == 6) {
            kata = "Enam";
        } else if (angka == 7) {
            kata = "Tujuh";
        } else if (angka == 8) {
            kata = "Delapan";
        } else if (angka == 9) {
            kata = "Sembilan";
        } else if (angka == 10) {
            kata = "Sepuluh";
        } else {
            kata = "Invalid number";
        }

        System.out.println("Output: " + kata);

        scanner.close();
    }
}
