package package1;
import java.io.*;

public class CálculosRetângulo {

	public static void main(String[] args) throws IOException {

	String largura1 ="";
	System.out.println("Digite a altura:");
	InputStreamReader LerS = new InputStreamReader (System.in);
	BufferedReader GuardaS = new BufferedReader (LerS);
	largura1= GuardaS.readLine();

	String comprimento1 ="";
	System.out.println("Digite a base");
	InputStreamReader LerS1 = new InputStreamReader (System.in);
	BufferedReader GuardaS2 = new BufferedReader (LerS1);
	comprimento1 = GuardaS2.readLine();
	
	System.out.printf("a area do retângulo é: %d", Integer.valueOf(largura1) * Integer.valueOf(comprimento1));
	
	
	}

}
