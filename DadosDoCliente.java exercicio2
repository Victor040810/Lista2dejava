/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2l2;

import java.util.Scanner;

/**
 *
 * @author Vycto
 */
class DadosDoCliente {
    
    
    String destino;
    String nome;
    String cidade;
    String data;
    float  cpf;
    float valor;
    
    Scanner result  = new Scanner(System.in);
    
    public void exibirdados(){
        System.out.println("          Agência Aérea           ");
        System.out.println(" Informe o nome nome completo  ");
        String nomecli = result .next();
        this.nome = nomecli;
        System.out.println("Informe o seu cpf ");
        float  cpfcli = result .nextLong();
        this.cpf = cpfcli;
        System.out.println("Informe  sua cidade e o estado de você nasceu ");
        String cidadeori = result.next();
        this.cidade = cidadeori;
        System.out.println("Informe a cidade e o estado que deseja ir ");
        String local = result.next();
        this.destino = local;
        System.out.println("Informe as datas  de ida e retorno ");
        String ida = result.next();
        String retorno  = result.next();
        this.data = "A ida será em "+ida+"\n o retorno em "+ retorno;
        System.out.println("Informe o valor da viagem");
        float valorpassagem = result.nextFloat();
        this.valor = valorpassagem;
       
    }
    public void menu(){
        
        System.out.println("Obrigado, por ter a nossa agência aerea como preferencia ! ");
        System.out.printf("Origem: %s   Destino: %s\n",cidade,destino);
        System.out.printf("Valor da passagem : R$ %.2f\n",valor);
        System.out.printf("Nome do passageiro: %s",nome);
        System.out.printf("Cpf do passageiro : %s\n",cpf);
        System.out.println(data);
        System.out.println(" Obrigado pela preferencia, tenha um execelente voo!!");   
    
    }
}

