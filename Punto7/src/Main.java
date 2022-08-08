import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("ingrese primer frase: ");
			String valConsolaA = in.nextLine();
			System.out.println("ingrese 2da frase: ");
			String valConsolaB = in.nextLine();
			System.out.println("EL RESULTADO ES:" + valConsolaA + valConsolaB);
		}
	}

}
