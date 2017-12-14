package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        int fat=1, n;
        Scanner ler = new Scanner(System.in);
        System.out.print ("Escolha um numero inferior a 32 - ");
        n = ler.nextInt();
        for (int m=n; m>=1; m--)
            fat*=m;
        System.out.printf("%d! = %d", n, fat);
        
    }
    
}
