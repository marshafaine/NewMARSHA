/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jobsheet12;

/**
 *
 * @Created by_22343004 Erpiana
 */

public class JavaInteritance
{
    public static void main(String[]args)
    {
        //Membuat objek JavaInheritance roda dua
        RodaDua sepeda = new RodaDua();
        //Membuat objek JavaInheritance roda empat
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        sepeda.hargaAkhir();
        
        mobil.tampilkanHarga();
        mobil.hargaAkhir();
    }         
}