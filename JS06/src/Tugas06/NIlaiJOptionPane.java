package Tugas06;

import javax.swing.JOptionPane;

public class NIlaiJOptionPane {
    public static void main(String[] args) {
        try {
            // Meminta pengguna memasukkan bilangan bulat
            String input1 = JOptionPane.showInputDialog("Masukkan nilai ujian pertama:");
            String input2 = JOptionPane.showInputDialog("Masukkan nilai ujian kedua:");
            String input3 = JOptionPane.showInputDialog("Masukkan nilai ujian ketiga:");

            // Mengonversi input menjadi tipe data double
            double nilai1 = Double.parseDouble(input1);
            double nilai2 = Double.parseDouble(input2);
            double nilai3 = Double.parseDouble(input3);

            // Menghitung rata-rata
            double rataRata = (nilai1 + nilai2 + nilai3) / 3;

            // Menyiapkan pesan output
            String pesanOutput = "Rata-rata nilai ujian: " + rataRata;

            // Menambahkan smiley face atau sad face sesuai dengan kondisi
            if (rataRata >= 60) {
                pesanOutput += " :-)";
            } else {
                pesanOutput += " :-(";
            }

            // Menampilkan output menggunakan JOptionPane
            JOptionPane.showMessageDialog(null, pesanOutput);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Masukkan nilai numerik yang valid.");
        }
    }
}
