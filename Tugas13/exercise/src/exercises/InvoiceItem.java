/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises;

/**
 *
 * @author User
 */

public class InvoiceItem {
   private String id;
   private String desc;
   private int qty;
   private double unitPrice;

   // Constructors
   public InvoiceItem(String id, String desc, int qty, double unitPrice) {
      this.id = id;
      this.desc = desc;
      this.qty = qty;
      this.unitPrice = unitPrice;
   }

   // Getters and Setters
   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getDesc() {
      return desc;
   }

   public void setDesc(String desc) {
      this.desc = desc;
   }

   public int getQty() {
      return qty;
   }

   public void setQty(int qty) {
      this.qty = qty;
   }

   public double getUnitPrice() {
      return unitPrice;
   }

   public void setUnitPrice(double unitPrice) {
      this.unitPrice = unitPrice;
   }

   // toString() method
   public String toString() {
      return String.format("InvoiceItem[id=%s,desc=%s,qty=%d,unitPrice=%.2f]",
                           id, desc, qty, unitPrice);
   }

   // getTotal() method
   public double getTotal() {
      return qty * unitPrice;
   }
}
