package br.com.alura.java8;

import java.util.Arrays;
import java.util.List;

public class OrdenaString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Caelum", "Casa do Codigo", "Alura");

		new ComparadorDeStringsPeloTamanho();

		list.sort((s1, s2) -> s1.length() - s2.length());

		System.out.println(list);

		list.forEach(s -> System.out.println(s));

	}

}
