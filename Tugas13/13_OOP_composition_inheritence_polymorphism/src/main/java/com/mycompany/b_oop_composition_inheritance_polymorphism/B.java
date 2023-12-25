/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.b_oop_composition_inheritance_polymorphism;

/**
 * Created by_22343004 Erpiana
 */

public class B extends A {
   public B() {  // Constructor
      // Pemanggilan super() tidak diperlukan karena akan dipanggil secara otomatis
      System.out.println("Constructed an instance of B");
   }

   @Override
   public String toString() {
      return "This is B";
   }
}
