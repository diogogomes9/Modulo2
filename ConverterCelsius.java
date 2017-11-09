package package1;
import java.util.Scanner;
public class ConverterCelsius {

	public static void main(String[] args) {



	
	Scanner dados = new Scanner(System.in);
	Double F,C;
	System.out.println("Qual a temperatura em Fahrenheit?");
	F=dados.nextDouble();
	C=(F-32)/1.8;
	System.out.printf("A temperatura em Celsius é " + C);
	Scanner dados1 = new Scanner(System.in);
	Double F1,C1;
	System.out.println("Qual a temperatura em Fahrenheit?");
	F1=dados1.nextDouble();
	C1=(F1-32)/1.8;
	System.out.printf("A temperatura em Celsius é " + C1);
	}

}
