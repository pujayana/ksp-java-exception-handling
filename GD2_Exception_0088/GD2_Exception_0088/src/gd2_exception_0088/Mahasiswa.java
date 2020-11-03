/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gd2_exception_0088;

import Exception.NULLNameException;
import Exception.NULLnpmException;

/**
 *
 * @author pujayana
 */
public class Mahasiswa {
    private String Name, npm;
    
    public Mahasiswa(String N, String NPM) throws NULLNameException,NULLnpmException{
        if(N.equalsIgnoreCase(""))
            throw new NULLNameException();
        else if(NPM.length()!=9)
            throw new NULLnpmException();
        else{
            Name = N;
            npm = NPM;
        }
    }
    
    public void showMahasiswa(){
        System.out.println("\nMahasiswa");
        System.out.println("Name : "+Name);
        System.out.println("NPM : "+npm);
    }
}
