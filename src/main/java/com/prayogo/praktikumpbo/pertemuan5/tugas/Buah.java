/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan5.tugas;

import java.util.Scanner;

public class Buah {
    public static void main(String[] args) {
        // membuat scanner
        Scanner scan = new Scanner(System.in);
        
        String[] buah = new String[5];
        int a = 1 ;

        // mengisi data ke array
        System.out.println("5 Buah yaang Anda Sukai");
        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + a + ": ");
            buah[i] = scan.nextLine();
            a++;
        }
        System.out.println();

        // menampilkan semua isi array
        System.out.println("Menampilkan 5 Buah yang Anda Sukai :");
        for( String b : buah ){
            System.out.println(b);
        }

    }
}
