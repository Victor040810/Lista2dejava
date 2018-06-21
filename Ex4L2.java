/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4l2;

import java.util.Scanner;

/**
 *
 * @author Vycto
 */
public class Ex4L2 {

    public static void main (String [] arg){
        Scanner input = new Scanner (System.in);
        empregado1 op = new empregado1();
        
        System.out.println(" Informe o  Nome");
        op.setPnome(input.nextLine());
        System.out.println("Informe o sobrenome:");
        op.setSnome(input.next());
        System.out.println("Informe o salario do empregado: ");
        op.setSal(input.nextDouble());
        
        System.out.println("\n"+op.getPnome());
        System.out.println(op.getSal()+"\n");
        
        System.out.println("Conceder aumento de 10% Digite \n Sim \n Não");
        String x = input.next();
        if ("sim".equals(x)){
          op.aumento();  
        }
        System.out.println("Salario final "+op.getSal());
        
    }
}



     
 

   

