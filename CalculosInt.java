package CalculosInt;

import java.util.Scanner;

public class CalculosInt {

    public static void main(String[] args) {
        Scanner L = new Scanner (System.in);
        
        int soma=0;
        int num;
        System.out.print ("Qual o numero a introduzir?");
        num =L.nextInt();
        for (int i = 1; i<=num ; i++){
        soma += i;
        }
        System.out.println ("O total é " +soma);
        
    }
    
}
