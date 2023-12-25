/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

import java.awt.Rectangle;

/**
 *
 * @Created by_22343004 Erpiana
 */

public class TestMain {
   public static void main(String[] args) {
      Circle2 c1 = new Circle2(1.1);
      System.out.println(c1);   // Menggunakan toString()
      
      Circle2 c2 = new Circle2(); // Menggunakan default constructor
      System.out.println(c2);

      c1.setRadius(2.2);
      System.out.println(c1);   // Menggunakan toString()
      System.out.println("radius is: " + c1.getRadius());

      System.out.printf("area is: %.2f%n", c1.getArea());
      System.out.printf("circumference is: %.2f%n", c1.getCircumference());
   }
}
