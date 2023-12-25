/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

/**
 *
 * @author User
 */
public class Rectangle {
   // private instance variables
   private float length;
   private float width;

   // Constructors (overloaded)
   public Rectangle() {
      length = 1.0f;
      width = 1.0f;
   }

   public Rectangle(float length, float width) {
      this.length = length;
      this.width = width;
   }

   // Getters and Setters
   public float getLength() {
      return length;
   }

   public void setLength(float length) {
      this.length = length;
   }

   public float getWidth() {
      return width;
   }

   public void setWidth(float width) {
      this.width = width;
   }

   // Other methods
   public double getArea() {
      return length * width;
   }

   public double getPerimeter() {
      return 2 * (length + width);
   }

   @Override
   public String toString() {
      return "Rectangle[length=" + length + ",width=" + width + "]";
   }
}

