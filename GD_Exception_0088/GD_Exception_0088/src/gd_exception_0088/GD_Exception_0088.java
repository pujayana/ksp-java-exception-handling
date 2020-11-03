/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gd_exception_0088;

/**
 *
 * @author pujayana
 */

import java.util.Scanner;

public class GD_Exception_0088 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int array[] = {0, 2, 5};
        int idx_1, idx_2;
        
        try {
            System.out.println("Masukkan idx_1 : ");;
            idx_1 = in.nextInt();
            System.out.println("Masukkan idx_2 : ");;
            idx_2 = in.nextInt();
            
            System.out.println("Hasil Pembagian : " + array[1]/array[idx_1]);
            System.out.println("Hasil Penjumlahan : " + array[2]+array[idx_2]);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi exception dengan tipe exception "+e.toString());
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("Terjadi exception dengan tipe exception "+e2.toString());
        }
    }
    
}
