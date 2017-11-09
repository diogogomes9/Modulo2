package PacoteDaDroga;

import java.util.Scanner;

public class Média {

	private static Scanner dados;

	public static void main(String[] args) {
		dados = new Scanner (System.in);
		double n1,n2,n3,m;
		System.out.println("..:Média:..");
		System.out.println("Qual a nota 1?");
		n1 = dados.nextDouble();
		System.out.println("Qual a nota 2?");
		n2 = dados.nextDouble();
		System.out.println("Qual a nota 3?");
		n3 = dados.nextDouble();
		m = (n1+n2+n3)/3;
		System.out.printf("Média = " + m);

	}

}
