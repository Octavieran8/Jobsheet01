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
public class BiodataDiri {
    public static void main(String[]args) {
    Scanner masukan = new Scanner(System.in);
    String nama, nis, tmp, tgl, jna, almt, motto;
    System.out.println();
    System.out.print("Biodata");
    System.out.println();
    System.out.print(" Nama :");
    nama = masukan.nextLine();
    System.out.print(" NIS :");
    nis = masukan.nextLine();
    System.out.print(" Tempat lahir :");
    tmp = masukan.nextLine();
    System.out.print(" Tanggal lahir :");
    tgl = masukan.nextLine();
    System.out.print(" Jenis Kelamin :");
    jna = masukan.nextLine();
    System.out.print(" Alamat di Malang :");
    almt = masukan.nextLine();
    System.out.print(" Motto HIUDP :");
    motto = masukan.nextLine();
    }
}
