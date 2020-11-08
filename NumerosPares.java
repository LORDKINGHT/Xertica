import java.util.stream.IntStream;

public class NumerosPares {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 20).filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
	}
}
