package br.com.alura.java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Pyton", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("html e css", 113));
		cursos.add(new Curso("C", 55));

		int alunos = cursos.stream().mapToInt(Curso::getQtAlunos).sum();

		System.out.println(alunos);

		cursos.sort(Comparator.comparingInt(Curso::getQtAlunos));

		// cursos.forEach(c -> System.out.println(c.getNome()));

		// cursos.stream().map(Curso::getNome).forEach(s ->
		// System.out.println(s));
		// cursos.stream().max(Comparator.comparingInt(Curso::getQtAlunos))
		// .ifPresent(c -> System.out.println(c.getNome()));

		cursos.stream().filter(c -> c.getQtAlunos() >= 50).collect(Collectors.toList());

		Map<String, Integer> collect = cursos.stream()
				.filter(c -> c.getQtAlunos() >= 50)
				.collect(Collectors.toMap(Curso::getNome, Curso::getQtAlunos));

		collect.keySet().forEach(System.out::println);

		OptionalDouble average = cursos.stream().mapToInt(Curso::getQtAlunos).average();
		
		System.out.println(average.orElse(-100));

	}
}
