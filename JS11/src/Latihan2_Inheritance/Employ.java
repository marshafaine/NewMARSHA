/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan2_Inheritance;

/**
 *
 * @author ACER
 */
public class Employ {
        private String noKaryawan;
    
    //konstruktor
    public Employ(String noKaryawan, String name, int age){
        
        this.noKaryawan = noKaryawan;
    }
    
    //metode
    public void info(){
        System.out.println("No. karyawan : " + this.noKaryawan);
        
    }
}
