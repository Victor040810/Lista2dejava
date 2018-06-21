/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3l2;

/**
 *
 * @author Vycto
 */
class Fatura {
    
    private String numero,descri;
    private int qtd;
    private double preco;
    private double fatura;
    
        public void setNumero(String num){
            this.numero=num;
        }
        public String getNumero(){
            return this.numero;
        }
        public void setDescribe(String desc){
            this.descri=desc;
        }
        public String getDescribe(){
        return this.descri;
        }
        public void setQTD(int quant){
            this.qtd=quant;
            numP();
            
        }
        public int getQTD(){
            return this.qtd;
        }
        public void setPreco(double pc){
            this.preco=pc;
            numP();
            
        }
        public double getPreco(){
            return this.preco;
        }
        private double calc(){
            fatura=preco*qtd;
            return this.fatura;
        }
        private void numP(){
            if(preco<0){
                preco=0.0;
            }
            if(qtd<0){
                qtd=0;
            }
        }
        public void Status (){
            System.out.printf("Você comprou a quantidade de:%d\n",getQTD());
            System.out.printf("Do produto:%s\n",getNumero());
            System.out.printf("Descrição do produto:%s\n",getDescribe());
            System.out.printf("Preço:%.2f\n",getPreco());
            System.out.printf("Fatura:%.2f\n",calc());
       
        }
    }
  
