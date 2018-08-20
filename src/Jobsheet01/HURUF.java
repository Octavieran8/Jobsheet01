/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet01;

/**
 *
 * @author WINDOWS
 */
public class HURUF {
    public static void main(String[]args) {
        int o,l,m,n;
        for(o=1;o<=4;o++) {
            for (l=1;l<=1;l++) {
                System.out.print("@");
            }
        for(m=2;m<=3;m++) {
            if(o==m) {
                System.out.print("@");
            }
            else {
                System.out.print(" ");
            }
        }
        for(n=1;n<=1;n++) {
            System.out.print("@");
        }
        System.out.println();
        }
    }
}
