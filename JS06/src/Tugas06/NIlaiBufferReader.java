/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NIlaiBufferReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b, c;
        float angka1, angka2, angka3 ,rata;
        System.out.println("Program Penjumlahan tiga buah Bilangan dan Rata-rata");
        
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
           
           System.out.print("Masukan angka ketiga : ");
           c = dataIn.readLine();
           angka3 = Float.parseFloat(c);
           
           rata = (angka1 + angka2 + angka3 ) / 3;
           System.out.println("Rata-rata : " + rata);
        }
        
        catch (IOException e){
            System.out.println("gagal membaca keyboard ");
        }  
    }
}
    
