package multiplicaçãorussa;

import java.util.Scanner;

public class MultiplicaçãoRussa {

    public static void main(String[] args) {
        int x,y;
        Scanner LerS = new Scanner (System.in);
        System.out.print ("Qual o multiplicador?");
        x = LerS.nextInt();
        System.out.print ("Qual o multiplicando?");
        y = LerS.nextInt();
        System.out.print ("x="+x);
        System.out.println();
        System.out.print ("y="+y);
    }
    
}
