/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan04;

/**
 *
 * @author ACER
 */
public class LogikadnBooleanOR {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;
        boolean test = true;
        
        //demonstrasi &&
        test = (i < j) || (j++ > 9);
        System.out.println(i);
        System.out.println(i);
        System.out.println(test);
        
        //demonstrasi &
        test = (i < j) | (j++ > 9);
        System.out.println(i);
        System.out.println(i);
        System.out.println(test);
    }  
}
