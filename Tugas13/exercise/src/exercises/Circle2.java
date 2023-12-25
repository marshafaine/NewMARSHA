/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

/**
 * Created by_22343004 Erpiana
 * The Circle class models a circle with a radius and color.
 */
public class Circle2 {
   private double radius;
   private String color;
   
   public Circle2() {
      radius = 1.0;
      color = "red";
   }
   
   public Circle2(double r) {
      radius = r;
      color = "red";
   }
   
   public double getRadius() {
     return radius; 
   }

   // Menambahkan metode setRadius untuk mengubah nilai radius
   public void setRadius(double r) {
      radius = r;
   }
   
   public double getArea() {
      return radius * radius * Math.PI;
   }

   // Menambahkan metode getCircumference untuk mendapatkan keliling lingkaran
   public double getCircumference() {
      return 2 * Math.PI * radius;
   }

   // Menambahkan metode toString untuk mendapatkan representasi string dari objek Circle
   @Override
   public String toString() {
      return "Circle[radius=" + radius + "]";
   }
}
