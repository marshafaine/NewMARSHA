package Latihan06;

import java.util.Scanner;

public class PercabanganIF {

    public static void main(String[] args) {
        double total_pembelian, diskon = 0;

        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukan Total Pembelian : Rp ");
        total_pembelian = dataMasuk.nextDouble();

        if (total_pembelian >= 50000) { // Perbaikan kesalahan operator dan penambahan kurung kurawal
            diskon = 0.1 * total_pembelian;
        }

        System.out.println("Besarnya diskon : Rp " + diskon);
    }
}
