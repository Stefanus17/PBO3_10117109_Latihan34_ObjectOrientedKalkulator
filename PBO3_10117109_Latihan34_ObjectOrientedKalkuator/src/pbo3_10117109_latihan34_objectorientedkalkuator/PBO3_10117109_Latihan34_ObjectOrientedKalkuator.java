/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan34_objectorientedkalkuator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Menampilkan penjumlahan,
 * pengurangan,perkalian seperti pada kalkulator. angka di inputkan oleh user
 */
public class PBO3_10117109_Latihan34_ObjectOrientedKalkuator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Kalkulator kalutor = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka Ke-1 : ");
        kalutor.value1 = scn.nextDouble();
        System.out.print("Masukkan Angka Ke-2 : ");
        kalutor.value2 = scn.nextDouble();

        DecimalFormat df = new DecimalFormat("###.##");

        System.out.println("\nHasil Penjumlahan : "+kalutor.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+kalutor.kurangBiangan());
        System.out.println("Hasil Perkalian : "+kalutor.kaliBilangan());
        System.out.println("Hasil Pembagian : "+df.format(kalutor.bagiBilangan()));
        System.out.println("Hasil Sisa : "+kalutor.sisaBilangan());
    }
    
}
