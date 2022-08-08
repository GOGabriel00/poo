import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("ingrese nro:");
		int valA = in.nextInt();
		Random azar = new Random();
		int valAlAzar = azar.nextInt(11);
		if (valAlAzar != valA) {
			System.out.println(valAlAzar + "es distinto a "+ valA);
		} else {
			System.out.println(valAlAzar + "es igual a " + valA);
		}
		if (valAlAzar <= valA) {
			System.out.println(valAlAzar + "menor o igual a "+ valA);
		} else {
			System.out.println(valAlAzar + "es mayor o igual a " + valA);
		}
		if (valAlAzar < valA) {
			System.out.println(valAlAzar + "menor a "+ valA);
		} else if (valAlAzar > valA){
			System.out.println(valAlAzar + "es mayor a " + valA);
		} else {
			System.out.println(valAlAzar + "igual " + valA);
		}		

	}

}
