/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
        
public class KelasBufferedReader2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b;
        float angka1, angka2, jumlah;
        System.out.println("Program Penjumlahan Dua buah Bilangan");
        
        try {
           System.out.print("Masukan angka pertama : ");
            a = dataIn.readLine();
            /*data yang akan diproses aritmatika harus dikonversikan dulu
            dari tipe data String ke tipe data angka yang diperlukan.
            Data yang diperoleh dari inputan kelas BufferedReader tipe datanya selalu String */
           angka1 = Float.parseFloat(a);//konveksi dari String ke float
           
           System.out.print("Masukan angka kedua : ");
           b = dataIn.readLine();
           angka2 = Float.parseFloat(b);//konveksi drai String ke float
           
           jumlah = (angka1 + angka2) / 2;
           System.out.println("Jumlah : " + jumlah);
        }
        
        catch (IOException e){
            System.out.println("gagal membaca keyboard ");
        }  
    } 
}
