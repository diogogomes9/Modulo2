package C�lculos;
import java.io.*;
public class Exerc�cio28 {

	public static void main(String[] args) throws IOException {
	
	String C= "";	
	System.out.print("Digite um digito:");
	InputStreamReader LerS = new InputStreamReader (System.in);
	BufferedReader GuardaS = new BufferedReader (LerS);
	C = GuardaS.readLine();
	System.out.printf("Digitou:%d", Integer.valueOf(C));

	}

}
