/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.b_oop_composition_inheritance_polymorphism;

import java.awt.Point;

/**
 * Created by_22343004 Erpiana
 * 
 * The Circle class composes a "Point" instance as its center and a radius.
 * We reuse the "Point" class via composition.
 */

public class Circle1 {
   // The private member variables
   private Point center;  // Declare an instance of the "Point" class
   private double radius;
 
   // Constructors
   /** Constructs a Circle instance with the default values */
   public Circle1() {
      this.center = new Point(); // Construct a Point at (0,0)
      this.radius = 1.0;
   }
   /** Constructs a Circle instance with the center at (xCenter, yCenter) and radius */
   public Circle1(int xCenter, int yCenter, double radius) {
      center = new Point(xCenter, yCenter); // Construct a Point at (xCenter,yCenter)
      this.radius = radius;
   }
   /** Constructs a Circle instance with the given Point instance as center and radius */
   public Circle1(Point center, double radius) {
      this.center = center;  // The caller had constructed a Point instance
      this.radius = radius;
   }
 
   // Getters and Setters
   public double getRadius() {
      return this.radius;
   }
   public void setRadius(double radius) {
      this.radius = radius;
   }
   public Point getCenter() {
      return this.center;  // return a Point instance
   }
   public void setCenter(Point center) {
      this.center = center;
   }
 
   public int getCenterX() {
      return (int) center.getX();  // Casting to int
   }
   public void setCenterX(int x) {
      center.setLocation(x, center.getY());  // Use setLocation() to set X
   }
   public int getCenterY() {
      return (int) center.getY();  // Casting to int
   }
   public void setCenterY(int y) {
      center.setLocation(center.getX(), y);  // Use setLocation() to set Y
   }
   public int[] getCenterXY() {
      int[] coordinates = {(int) center.getX(), (int) center.getY()};  // Casting to int
      return coordinates;
   }
   public void setCenterXY(int x, int y) {
      center.setLocation(x, y);  // Use setLocation() to set XY
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
      return "Circle[center=" + center + ",radius=" + radius + "]";  // invoke center.toString()
   }
 
   /** Returns the area of this circle */
   public double getArea() {
      return Math.PI * radius * radius;
   }
 
   /** Returns the circumference of this circle */
   public double getCircumference() {
      return 2.0 * Math.PI * radius;
   }
 
   /** Returns the distance from the center of this circle to the center of
       the given Circle1 instance called another */
   public double distance(Circle1 another) {
      return center.distance(another.center);  // Use distance() of the Point class
   }
}