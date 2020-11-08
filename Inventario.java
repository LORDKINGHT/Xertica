import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Inventario {

	public static class Articulo {
		int cantidad;
		double precio;
		String nombre;
		int descuento;
		double precioFinal;

		public Articulo(String nombre, int cantidad, double precio) {
			this.nombre = nombre;
			this.cantidad = cantidad;
			this.precio = precio;
		}

		@Override
		public String toString() {
			return String.format("Articulo: %s \tPrecioFinal: %.2f", nombre, precioFinal);
		}
	}

	public static void main(String[] args) {

		ArrayList<Articulo> listaInventario = new ArrayList<Inventario.Articulo>();
		listaInventario.add(new Articulo("Camisa", 30, 100));
		listaInventario.add(new Articulo("Bolsa", 50, 200));
		listaInventario.add(new Articulo("Calcetin", 100, 54));
		listaInventario.add(new Articulo("Corbata", 45, 150));
		listaInventario.add(new Articulo("Pantalones", 200, 300));
		listaInventario.add(new Articulo("Sueter", 150, 250));
		listaInventario.add(new Articulo("Playera", 25, 100));

		List<Inventario.Articulo> lista30Descuento = listaInventario.stream().filter(articulo -> articulo.cantidad < 50)
				.peek(articulo -> setDescount(articulo, 30)).collect(Collectors.toList());
		List<Inventario.Articulo> lista10Descuento = listaInventario.stream()
				.filter(articulo -> articulo.cantidad >= 50).peek(articulo -> setDescount(articulo, 10))
				.collect(Collectors.toList());

		System.out.println("30%");
		lista30Descuento.stream().forEach(System.out::println);
		System.out.println("\n10%");
		lista10Descuento.stream().forEach(System.out::println);
	}

	private static void setDescount(Inventario.Articulo articulo, int descuento) {
		articulo.descuento = descuento;
		articulo.precioFinal = Math.round(articulo.precio * (100.0 - descuento)) / 100;
	}
}
