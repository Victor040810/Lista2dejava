

package ex3l2;

import java.util.Scanner;



    public class FaturaTeste {
        
    public static void main (String[] args){
        Fatura F1= new Fatura();
        Scanner scan = new Scanner(System.in);
        String numero,descri;
        double preco;
        int qtd;
            System.out.println(" Informe o número do produto:");
                numero=scan.nextLine();
            System.out.println("Informe  a descrição do produto:");
                descri = scan.nextLine();
            System.out.println("Informe a quantidade do produto");
                qtd = scan.nextInt();
            System.out.println("Informe  o preco do produto");
                preco= scan.nextDouble();
            F1.setNumero(numero);
            F1.setDescribe(descri);
            F1.setPreco(preco);
            F1.setQTD(qtd);
            F1.Status();
    }
    
}