/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas04;

import java.util.Scanner;

public class TUgas2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int number1 = input.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int number2 = input.nextInt();
        
        System.out.print("Masukkan angka ketiga: ");
        int number3 = input.nextInt();
        
        int maxNumber = (number1 > number2) ? ((number1 > number3) ? number1 : number3) : ((number2 > number3) ? number2 : number3);
        
        System.out.println("number 1 = " + number1);
        System.out.println("number 2 = " + number2);
        System.out.println("number 3 = " + number3);
        System.out.println("Nilai tertingginya adalah angka = " + maxNumber);
    }
}