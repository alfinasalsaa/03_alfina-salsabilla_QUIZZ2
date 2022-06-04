/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.pkg2;

/**
 *
 * @author HP
 */
public class Pesan {
    int kodePesan, harga;
    String namaPesan;
    
    Pesan(int kode, String namaPesan, int harga) {
        this.kodePesan = kode;
        this.namaPesan = namaPesan;
        this.harga = harga;
    }
}
