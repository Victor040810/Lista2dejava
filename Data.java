
 
package ex5l2;

import java.util.Scanner;


 
class Data {
  
    Scanner input = new Scanner(System.in);
    private int dia,mes,ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        
        
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
       
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        
        this.ano = ano;
    }
    public void exibeData(){
        System.out.printf("%s/%s/%s\n",dia,mes,ano);
        
        }
   
}
 
