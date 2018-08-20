/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet01;

import java.util.Scanner;

/**
 *
 * @author WINDOWS
 */
public class Suhu {
    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    float C,F,R,K;
    System.out.print("Masukkan Nilai Celcius:");
    C = masukan.nextInt();
    System.out.println("Reamur ="+ (C*4/5));
    System.out.println("Farenheit ="+ (C*9/5+32));
    System.out.println("Kelvin ="+ (C+273));
    }
}
