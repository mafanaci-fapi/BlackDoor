package br.edu.fapi.sga.vaga.view.pesquisarVaga;

import java.util.Scanner;

import br.edu.fapi.sga.model.vaga.Vaga;

public class PesquisarVaga {

	public void pesuisarVaga() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Pesquisar funcionario");
		System.out.println("Digite o nome do funcionario: ");
		String Nome = scanner.nextLine();
		System.out.println("Digite o CPF do funcionario: ");
		String CPF = scanner.nextLine();
		if (Nome == Vaga.getNomeDaVaga()) {
			System.out.println("Nome: " + Vaga.getNomeDaVaga());
			System.out.println("Empresa: " + Vaga.getNomeDaEmpresa());
			System.out.println("Salario: " + Vaga.getSalario());
		} else {
			System.out.println("Nao existe dados para essa vaga ");
		}

	}
}