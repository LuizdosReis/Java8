package br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now(); // representa a data de hoje
		System.out.println(hoje);

		// posso passar a data manualmente
		LocalDate aniversario = LocalDate.of(2017, 11, 26);
		System.out.println(aniversario);
		

		// podemos calcular as diferencas na mão
		int diasQuefaltam = aniversario.getDayOfYear() - hoje.getDayOfYear();

		System.out.println(diasQuefaltam);

		// ou podemor usar o Period que faz o calculo existe tambem a Duration que permite trabalhar com horas
		Period periodo = Period.between(hoje, aniversario);
		System.out.println(periodo.getYears());
		System.out.println(periodo.getMonths());
		System.out.println(periodo.getDays());

		// para diminuir da data
		System.out.println(hoje.minusYears(1));

		// o formatador serve para formatar a data
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		// passando um formatador e adicionando um ano na data
		System.out.println(hoje.plusYears(1).format(formatador));

		// para usar data com horas e minutos e segundos
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);

		// formatador para horas
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

		System.out.println(agora.format(formatadorHora));

		// quando precisamos somente de algo especifico podemos usar estas
		// opçoes

		// para representar somente o mes e o ano
		YearMonth anoEMes = YearMonth.of(2016, 11);
		System.out.println(anoEMes);

		// para representar somente a hora
		LocalTime hora = LocalTime.of(12, 30);
		System.out.println(hora);

	}

}
