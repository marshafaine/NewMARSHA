/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

/**
 *
 * @Created by_22343004 Erpiana
 */

public class Date {
   private int month;
   private int day;
   private int year;

   // Constructors
   public Date(int month, int day, int year) {
      this.month = month;
      this.day = day;
      this.year = year;
   }

   // Setters and getters
   public void setMonth(int month) {
      this.month = month;
   }

   public int getMonth() {
      return month;
   }

   public void setDay(int day) {
      this.day = day;
   }

   public int getDay() {
      return day;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getYear() {
      return year;
   }

   // Additional method to set the date
   public void setDate(int month, int day, int year) {
      this.month = month;
      this.day = day;
      this.year = year;
   }

   // Method to format the date as "MM/DD/YYYY"
   public String toString() {
      return String.format("%02d/%02d/%04d", month, day, year);
   }
}
