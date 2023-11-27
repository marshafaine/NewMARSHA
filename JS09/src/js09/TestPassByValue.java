/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package js09;

/**
 *
 * @author ACER
 */
public class TestPassByValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 10;
        System.out.println(i);
        
        test(i);
        System.out.println(i);
    }
    public static void test(int j) {
        j = 33;
    }
}
