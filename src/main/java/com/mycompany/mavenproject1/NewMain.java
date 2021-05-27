/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double Nacimiento,Actual, res;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el año de Nacimiento");
    Nacimiento = sc.nextDouble();
    System.out.println("Ingrese el año Actual");
    Actual = sc.nextDouble();
    res= Actual-Nacimiento;
        System.out.println("su edad:"+res);
                
    }
    
}
