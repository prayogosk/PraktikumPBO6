/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan5;

/**
 *
 * @author PRAYOGO
 */
public class Array2 {
    public static void main(String[] args) {
          //Pembuatan Array
          String[] names = {
              "Rain",
              "Nindi",
              "Nida"
          };
          
          //cek array
          System.out.println("Panjang Array : "+names.length);
          
          //menampilkan semua nilsai array
          for(int i=0; i<names.length; i++){
          System.out.println(i + ": "+ names[i]);
          }
    }
}
