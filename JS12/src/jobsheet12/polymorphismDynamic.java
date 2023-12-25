/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet12;

/**
 *
 * @Created by_22343004 Erpiana
 */

class polymorphismDynamic {
    public static void main(String[] args) {
        //creating variable of Bank class
        Bank B;
        B = new BRI();
        System.out.println("Tingkat suku bunga BRI adalah: " + B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat suku bunga BNI adalah: " + B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat suku bunga Mandiri adalah: " + B.sukuBunga());
    }
}
