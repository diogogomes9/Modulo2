package opera��es;

import java.util.Scanner;



public class Opera��es {



    	public static void main(String[] args) {
    double num1, num2, resultado;
    int num3;
    Scanner ler=new Scanner(System.in);
    System.out.println ("Digite o número 01: ");
    num1=ler.nextDouble();
    System.out.println ("Digite o número 02: ");
    num2=ler.nextDouble();
    System.out.print("Escolha uma das opções: \n 01: Somar \n 02: Subtrair \n 03: Multiplicar  \n 04: Dividir: \n Opção escolhida: ");
    num3= ler.nextInt();
    resultado = 0;
    switch (num3)
    {
    case 1:
        resultado = num1+num2;
        break;
    case 2:
        resultado = num1-num2;
        break;
    case 3:
        resultado = num1*num2;
        break;
    case 4:
        resultado = num1/num2;
        break;
    }
    System.out.println("Resultado igual a: "+ resultado);           

        
    }
    
}
