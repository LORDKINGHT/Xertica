import java.util.Scanner;

public class ParOImpar {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int inputNumber = scanner.nextInt();
		if (inputNumber % 2 == 0) {
			System.out.println("Es par.");
		} else {
			System.out.println("Es impar.");
		}
	}
}
