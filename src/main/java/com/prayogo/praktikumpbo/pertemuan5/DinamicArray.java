/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prayogo.praktikumpbo.pertemuan5;

import java.util.Scanner;


/**
 *
 * @author PRAYOGO
 */
public class DinamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Program Input Nilai ---");
        System.out.print("Masukkan Jumlah Matkul : ");
        int jml = input.nextInt();
        System.out.println();
        
        int[] nilai = new int [jml];
        float total, rata2;
        
        for(int i=0; i<jml; i++){
            System.out.println("Masukan Nilai Ke-"+(i+1)+": ");
            nilai[i]=input.nextInt(); 
        }
        System.out.println();
        
        System.out.println("___Daftar Nilai___");
        for(int i=0; i<jml; i++){
            System.out.println(i+" : "+nilai[i]);
        }
        
        total = 0;
        for(int i = 0; i < jml; i++){
            total = total+nilai[i];
            }
        
        rata2 = (total/jml);
        System.out.println("Nilai rata-rata dari "+ jml +
                           " inputan adalah: "+ rata2);
    }
}
