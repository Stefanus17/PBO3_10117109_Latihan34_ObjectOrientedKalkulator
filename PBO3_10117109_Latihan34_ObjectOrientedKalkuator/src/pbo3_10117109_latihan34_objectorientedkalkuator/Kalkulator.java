/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan34_objectorientedkalkuator;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Menampilkan penjumlahan,
 * pengurangan,perkalian seperti pada kalkulator. angka di inputkan oleh user
 
 */
public class Kalkulator {
     public double value1;
    public double value2;
    
    
    public double tambahBilangan(){ 
        return value1+value2;
    }
    public double kurangBiangan(){
        return value1-value2;
    }
    public double kaliBilangan(){
        return value1*value2;
    }
    public double bagiBilangan(){ 
        return value1/value2;
    }
    public double sisaBilangan(){
        return value1%value2;
    }
    
}
