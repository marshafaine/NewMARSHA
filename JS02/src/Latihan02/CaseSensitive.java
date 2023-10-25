package Latihan02; //terdapat pada package Latihan02

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class CaseSensitive { // dengan class CaseSensitive
    public static void main(String args[]) {
        String nama = "Petani Kode";
        String Nama = "petanikode";
        String NAMA = "Petanikode.com";
        
        System.out.println(nama);
        System.out.println(Nama);
        System.out.println(NAMA);
    }
}
/*
**Dapat kita lihat bahwa meskipun nama variabel-variabel tersebut mirip , 
*Java mengolah mereka dengan cara yang berbeda karena Java adalah bahasa pemrograman yang bersifat case sensitive. 
*Artinya, huruf besar dan huruf kecil dianggap berbeda dalam penamaan variabel.
*Hasil keluaran dari program ini akan mencetak nilai dari ketiga variabel dalam bentuk sesuai dengan cara mereka didefinisikan. 
*/