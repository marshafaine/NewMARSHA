/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.b_oop_composition_inheritance_polymorphism;

import java.awt.Point;

/**
 * Created by_22343004 Erpiana
 * A Line composes of two Points - a begin "Point" and an end "Point".
 * We reuse the Point class via composition.
 */

public class Line {
   // The private instance variables
   Point begin, end;   // instances of the "Point" class
 
   /** Constructs a Line instance given 2 points at (x1, y1) and (x2, y2) */
   public Line(int x1, int y1, int x2, int y2) {
      begin = new Point(x1, y1);  // Construct the instances declared
      end   = new Point(x2, y2);
   }
   /** Construct a Line instance given 2 Point instances */
   public Line(Point begin, Point end) {
      this.begin = begin;  // The caller had constructed the instances
      this.end   = end;
   }
 
   // The public getter and setter for the private instance variables
   public Point getBegin() {
      return begin;
   }
   public Point getEnd() {
      return end;
   }
   public void setBegin(Point begin) {
      this.begin = begin;
   }
   public void setEnd(Point end) {
      this.end = end;
   }
 
   public double getBeginX() {
      return begin.getX();  // Point's getX()
   }
   public void setBeginX(int x) {
      begin.setLocation(x, begin.getY());  // Point's setLocation()
   }
   public double getBeginY() {
      return begin.getY();  // Point's getY()
   }
   public void setBeginY(int y) {
      begin.setLocation(begin.getX(), y);  // Point's setLocation()
   }
   public double[] getBeginXY() {
      return new double[]{begin.getX(), begin.getY()};  // Point's getLocation()
   }
   public void setBeginXY(int x, int y) {
      begin.setLocation(x, y);  // Point's setLocation()
   }
   public double getEndX() {
      return end.getX();  // Point's getX()
   }
   public void setEndX(int x) {
      end.setLocation(x, end.getY());  // Point's setLocation()
   }
   public double getEndY() {
      return end.getY();  // Point's getY()
   }
   public void setEndY(int y) {
      end.setLocation(end.getX(), y);  // Point's setLocation()
   }
   public double[] getEndXY() {
      return new double[]{end.getX(), end.getY()};  // Point's getLocation()
   }
   public void setEndXY(int x, int y) {
      end.setLocation(x, y);  // Point's setLocation()
   }
 
   /** Returns a self-descriptive String */
   public String toString() {
      return "Line[begin=" + begin + ",end=" + end + "]";
            // Invoke begin.toString() and end.toString()
   }
 
   /** Returns the length of this line */
   public double getLength() {
      return begin.distance(end);  // use Point's distance() method
   }
}