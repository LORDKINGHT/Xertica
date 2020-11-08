
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OrdernarNumeros {

	public static void main(String[] args) {
		List<Integer> ListaOrdenada = Arrays.asList(500, 900, 13, 48, 300, 20, 10, 5, 1, 0, 250, 44, 94, 25, 22, 150, 8,
				2, 9, 44, 75, 67, 33);

		Collections.sort(ListaOrdenada, Collections.reverseOrder());
		
		System.out.println("Lista descendente:");
		ListaOrdenada.stream().forEach(i -> System.out.print(i + " "));

		List<Integer> listaMenor50 = ListaOrdenada.stream().filter(i -> i < 50).collect(Collectors.toList());
		System.out.println("\nLista numeros menores de 50: ");
		listaMenor50.stream().forEach(i -> System.out.print(i + " "));
	}
}
