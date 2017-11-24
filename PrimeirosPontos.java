package primeirospontos;

import java.util.Scanner;

public class PrimeirosPontos {

    public static void main(String[] args) {
        Scanner l = new Scanner (System.in);
        int num, fat=1;
        int cont=1;
        do {
            
        System.out.print ("Qual o numero a introduzir?");
        num = l.nextInt();
        
        for(int I=1; I<=num; I++){
            fat=fat*I;
        }
        System.out.println ("!"+num+"="+fat);
        cont ++;
    } while (cont<2);
    }
    
}
