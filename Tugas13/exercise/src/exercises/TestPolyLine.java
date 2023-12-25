/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

/**
 *
 * @Created by_22343004 Erpiana
 */

import java.awt.Point;
import java.util.*;
public class TestPolyLine {
   public static void main(String[] args) {
      // Test default constructor and toString()
      PolyLine l1 = new PolyLine();
      System.out.println(l1);  // {}

      // Test appendPoint()
      l1.appendPoint(new Point(1, 2));
      l1.appendPoint(3, 4);
      l1.appendPoint(5, 6);
      System.out.println(l1);  // {(1,2)(3,4)(5,6)}

      // Test constructor 2
      List<Point> points = new ArrayList<Point>();
      points.add(new Point(11, 12));
      points.add(new Point(13, 14));
      PolyLine l2 = new PolyLine(points);
      System.out.println(l2);  // {(11,12)(13,14)}
   }
}
