/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan4;

/**
 *
 * @author ACER
 */
public class Aktor {
    String nama;
    int umur;
    
    Aktor(String n,int u) { //aktor adalah constructor
       nama=n;
       umur=u;
    }
    
    void tampilAktor() {
        System.out.println("Namaku : "+nama);
        System.out.println("Umurke  "+umur+" tahun");
    }
    
    public static void main(String args[]) {
        Aktor a;
        
        a = new Aktor("Ronaldo", 33);
        a.tampilAktor();
        System.out.println("===============");
        
        a = new Aktor("SALAh", 31);
        a.tampilAktor();
        System.out.println("================");
    }   
}
