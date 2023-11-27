/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js08;

import javax.swing.JOptionPane;

public class Tugas02 {
   public static void main(String[] args) {
        // Inisialisasi array untuk menyimpan 10 nomor
        double[] numbers = new double[10];

        // Menggunakan loop untuk meminta input dari pengguna dan menyimpannya dalam array
        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Masukkan nomor ke-" + (i + 1));
            
            // Konversi input menjadi double
            try {
                numbers[i] = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Masukkan nomor yang valid.");
                i--; // Jika input tidak valid, kurangi nilai i agar pengguna diminta kembali
            }
        }

        // Temukan nilai terbesar dalam array
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Tampilkan nilai terbesar kepada pengguna
        JOptionPane.showMessageDialog(null, "Nilai terbesar yang dimasukkan adalah: " + max);
    } 
}
