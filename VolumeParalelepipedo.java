package PacoteDaDroga;

import java.util.Scanner;

public class VolumeParalelepipedo {

	private static Scanner dados;

	public static void main(String[] args) {
		dados = new Scanner (System.in);
		double c,l,h,v;
		System.out.println("..:Volume do Paralelipipedo:..");
		System.out.println("Qual o comprimento?");
		c = dados.nextDouble();
		System.out.println("Qual a altura?");
		h = dados.nextDouble();
		System.out.println("Qual a largura?");
		l = dados.nextDouble();
		v = c*l*h;
		System.out.printf("Volume do Paralelipipedo = " + v);

	}

}
