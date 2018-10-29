/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan54_koordinat;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan koordinat
 *                     berdasarkan warna berdasarkan konsep inheritance.
 */
public class PBO3_10117098_Latihan54_Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat warna = new WarnaKoordinat(10,4,"Jingga");
        System.out.println("Warna Koordinat   : "+warna.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "+warna.getX()
                +", y : "+warna.getY());
    }
    
}
