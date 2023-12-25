/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet13;

/**
 * Created by_22343004 Erpiana
 * Example to illustrate "Method Overloading"
 */

public class MethodOverloadingTest {
   public static int average(int n1, int n2) {          // version 1
      System.out.println("Run version 1");
      return (n1+n2)/2;
   }
   public static double average(double n1, double n2) { // version 2
      System.out.println("Run version 2");
      return (n1+n2)/2;
   }
   public static int average(int n1, int n2, int n3) {  // version 3
      System.out.println("Run version 3");
      return (n1+n2+n3)/3;
   }

   public static void main(String[] args) {
      System.out.println(average(1, 2));
      //Run version 1
      //1
      System.out.println(average(1.0, 2.0));
      //Run version 2
      //1.5
      System.out.println(average(1, 2, 3));
      //Run version 3
      //2
      System.out.println(average(1.0, 2));
      //Run version 2 (int 2 implicitly casted to double 2.0)
      //1.5

      //average(1, 2, 3, 4);
      //compilation error: no suitable method found for average(int,int,int,int)
   }
}