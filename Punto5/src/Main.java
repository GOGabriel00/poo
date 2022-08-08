import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("ingrese numero");
			int numConsolaA = in.nextInt();
			System.out.println("ingrese numero");	
			int numConsolaB = in.nextInt();
			int resu = numConsolaB + numConsolaA;
			System.out.println("el resu es " + resu);
		}

	}

}
