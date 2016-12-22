package br.com.alura.java8;

import java.util.Arrays;
import java.util.List;

public class OrdenaString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Caelum", "basa do Codigo", "Alura");

		new ComparadorDeStringsPeloTamanho();

		list.sort(String.CASE_INSENSITIVE_ORDER);

		System.out.println(list);

		list.forEach(System.out::println);

	}

}
