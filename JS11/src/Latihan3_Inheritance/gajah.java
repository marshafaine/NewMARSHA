/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3_Inheritance;

/**
 *
 * @author ACER
 */
public class gajah {
    //meng-overwrite method class hewan
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan");
    }
    
    //meng-overwrite method class hewan
    public static void testInstanceMethod(){
        System.out.println("The Instance Method in Hewan");
    }
    
    public static void main(String args[]){
        gajah mygajah = new gajah();
        Hewan myHewan = new Hewan();
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
