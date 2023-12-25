/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan1_Inheritance;

/**
 *
 * @author ACER
 */
public class Pertama {

    private int a = 10;
    
    protected void terprotek(){
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void info (){
       System.out.println("a = " + a) ;
       System.out.println("Dipanggil pada =  " + this.getClass().getName());
    }
}