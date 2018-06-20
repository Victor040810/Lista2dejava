/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1l2;

import java.util.Scanner;

/**
 *
 * @author Vycto
 */
public class Ex1L2 {


        public static void main(String[] args) {
    
        Scanner result = new Scanner(System.in);
        System.out.println("====== Banco ======");
        Conta2 c1 = new Conta2();
        c1.abertura_conta(" Jãozinho ", "poupança", "000-1", "5555-x");
        c1.deposito((float) 250.00);
        c1.saque((float) 150.00);
        c1.Status();
      
    }  
}