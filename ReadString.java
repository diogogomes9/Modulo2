package dominios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ReadString {


    public static void main (String[] args) throws IOException {
        
        Scanner ler = new Scanner (System.in);
        Scanner ler2 = new Scanner (System.in);
        double Cognitivo;
        double Atitudes;
        double NotaFinal;
        
        System.out.print ("Qual o nome do aluno?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String nome = in.readLine();
        System.out.print ("Qual o valor do domínio Cognitivo?");
        Cognitivo = ler.nextDouble();
        System.out.print ("Qual o valor do domínio das Atitudes?");
        Atitudes = ler.nextDouble();
        NotaFinal = (0.6*Cognitivo + 0.4*Atitudes);
        if (NotaFinal<10)
        System.out.print ("A "+nome+" teve média de "+NotaFinal+" e está reprovada");
         else
        System.out.print ("A "+nome+" teve média de "+NotaFinal+" e está aprovada");
        
       
        
    }
    
}