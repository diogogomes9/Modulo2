package package1;
import java.io.*; 
public class Do�uraOuTravessura {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String C= "";	
		System.out.println("Do�ura ou Travessura?");
		InputStreamReader LerS = new InputStreamReader (System.in);
		BufferedReader GuardaS = new BufferedReader (LerS);
		C= GuardaS.readLine();
		System.out.printf("Digitou:"+ C, args);

		
		
	}

}
