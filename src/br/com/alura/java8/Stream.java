package br.com.alura.java8;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

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

		cursos.stream().map(Curso::getNome).forEach(s -> System.out.println(s));
		System.out.println(cursos.stream().max(Comparator.comparingInt(Curso::getQtAlunos)).get().getNome());
		// cursos.stream().filter(c -> c.getQtAlunos() >= 50).forEach(c ->
		// System.out.println(c.getNome()));

	}
}
