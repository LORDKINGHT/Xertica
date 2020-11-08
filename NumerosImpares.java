import java.util.stream.IntStream;

public class NumerosImpares {
	public static void main(String[] args) {
		int totalImpar = IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 1).peek(i -> System.out.print(i + " "))
				.sum();
		System.out.println("\nSuma total impar: " + totalImpar);
	}
}
