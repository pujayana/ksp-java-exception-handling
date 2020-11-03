/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gd2_exception_0088;

import java.util.Scanner;
import Exception.NULLNameException;
import Exception.NULLnpmException;

/**
 *
 * @author pujayana
 */
public class GD2_Exception_0088 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Name = null, NPM = null;
        
        do{
            try {
                System.out.println("Name : ");
                Name = in.nextLine();
                System.out.println("NPM : ");
                NPM = in.nextLine();
                
                Mahasiswa M;
                M = new Mahasiswa(Name, NPM);
                M.showMahasiswa();
            } catch (NULLNameException e) {
                System.out.println(e.message());
            } catch (NULLnpmException e2){
                System.out.println(e2.message());
            }
        } while(Name.equalsIgnoreCase("") || NPM.length() != 9);
    }
    
}
