/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
          //Pembuatan Array
          String[] names = new String[3];
          
          //cek array
          System.out.println("Panjang Array : "+names.length);
          
          names[0] = "rin";
          names[1] = "duri";
          names[2] = "dara";
          
          //menampilkan semua nilsai array
          for(int i=0; i<names.length; i++){
          System.out.println(i + ": "+ names[i]);
          }
    }
}
