/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
        

public class KelasBufferedReader {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        
        String name = "", hoby ="" ;
        
        try {
            System.out.print("Nama Anda : ");
            name = dataIn.readLine();
            System.out.print("Hoby Anda : ");
            hoby = dataIn.readLine();
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
        
        System.out.println("Jadi Hobi Anda "+hoby+". Hobi yang bagus " + name);
        
        
        
    }
    
}
