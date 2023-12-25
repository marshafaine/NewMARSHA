/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan5_Inheritance;

/**
 *
 * @author Administrator
 */
public class Bus2 {
    public int addPenumpang;
    public int maxPenumpang;
    
    //konstruktor
    public Bus2(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
        addPenumpang = 0;
    }
    
    public void addPenumpang(int penumpang) {
        int temp;
        temp = this.addPenumpang + penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kouta");
        }
        else {
            this.addPenumpang = temp;
        }
    }

    public void cetak(){
        System.out.println("Penumpang Bus sekarang " + addPenumpang);
        System.out.println("Penumpang maxsimun seharusnya " + maxPenumpang);
    }
}
