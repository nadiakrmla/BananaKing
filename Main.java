/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.bananaking;

import java.util.Scanner;

/**
 *
 * @author NADIA
 */
public class BananaKing {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner input = new Scanner (System.in);
        String a;
        int HargaMakan = 0 , uang, kembalian;
        
        System.out.println("Menu Banana King");
        System.out.println("Variant: ");
        System.out.println("1. Greentea");
        System.out.println("2. Tiramisu");
        System.out.println("3. Capucino");
        System.out.println("4. Vanila");
        System.out.println("5. Choconut");
        System.out.println("---------------");
        a = input.next ();
        
        System.out.println("Harga menu yang anda pilih");
      switch (a){
          case "1":HargaMakan=15000;break;
          case "2":HargaMakan=12000;break;
          case "3":HargaMakan=11000;break;
          case "4":HargaMakan=10000;break;
          case "5":HargaMakan=13000;break;    
      }
      System.out.println("Masukkan uang yang dimiliki: ");
              uang=input.nextInt();
              System.out.println("");
              
              if(uang>HargaMakan){
                  kembalian=uang-HargaMakan;
                  System.out.println("Kembalian: "+kembalian);
              }else{
                  System.out.println("maaf, uang anda kurang!");
              }
    }
}
