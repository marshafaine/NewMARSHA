/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan05;

import javax.swing.JOptionPane;

public class PenggunaanClassJOptionPane {
    public static void main(String[] args){
        String name = " ", hobby=" ";
        
        name = JOptionPane.showInputDialog("Nama Anada : ");
        hobby = JOptionPane.showInputDialog("Hobi Anda : ");
        
        String msg = " Jadi Hobi Anda " + hobby +". "
                + " Hobi yang bagus " + name;
        
        JOptionPane.showMessageDialog(null, msg);
        
        System.out.println("Jadi Hobi Anda " + hobby+ ". Hobi yang bagus" + name);
        
    }
    
}
