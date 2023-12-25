/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan4_Inheritance;

/**
 *
 * @author Administrator
 */
public class classB extends classA{
    private int b;
    
    public void setB(int nilai) {
        b = nilai;
    }
    
    public int getB() {
        return b;
    }
    
    public void tampilkanNilai() {
        System.out.println("Nilai b = " + getB());
    }
}
