package package1;

import java.util.Scanner;

public class TeoremaPitágoras {

	public static void main(String[] args) throws Exception{
	double c1,c2,h;
		
	System.out.print("Qual a medida do Primeiro Cateto?");
	Scanner LerS=new Scanner(System.in);
	c1= LerS.nextDouble();
	
	System.out.print("Qual a medida do Segundo Cateto?");
	c2= LerS.nextDouble();
	
	h= Math.sqrt (Math.pow (c1, 2) + Math.pow (c2, 2));
	System.out.printf(String.format("Hipotenusa=%4.1f", h));

	}

}
