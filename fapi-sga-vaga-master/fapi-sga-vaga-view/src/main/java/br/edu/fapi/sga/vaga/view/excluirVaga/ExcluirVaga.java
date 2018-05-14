package br.edu.fapi.sga.vaga.view.excluirVaga;

import java.util.Scanner;

import br.edu.fapi.sga.model.vaga.Vaga;

public class ExcluirVaga {

	public void excluirVaga() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Excluir vaga");
		System.out.println("Digite a vaga: ");
		String Nome = scanner.nextLine();

		if (Nome == Vaga.getNomeDaVaga()) {
			System.out.println("Vaga excluida");
		} else {
			System.out.println("Nao existe vagas no sistema com esse nome. ");
		}
	}
}
