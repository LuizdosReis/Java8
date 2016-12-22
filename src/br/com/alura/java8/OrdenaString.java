package br.com.alura.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Alura", "Caelum", "Casa do Codigo");

		Comparator<String> comparador = new ComparadorDeStringsPeloTamanho();

		list.sort(comparador);

		System.out.println(list);

		Consumer<String> consumidorDeStrings = new ConsumidorDeStrings();

		list.forEach(consumidorDeStrings);

	}

}
