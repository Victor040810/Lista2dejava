
package ex5l2;

import java.util.Scanner;


 
public class Ex5L2 {
    
public static void main(String[] args) {
        Scanner result  = new Scanner(System.in);
        Data n= new Data();
        System.out.println("informe dia, mês e o ano ");
        int d= result.nextInt();
        int m = result.nextInt();
        int a = result.nextInt();
        n.setDia(d);
        n.setMes(m);
        n.setAno(a);
        n.exibeData();
        
    }  
}
    
    

