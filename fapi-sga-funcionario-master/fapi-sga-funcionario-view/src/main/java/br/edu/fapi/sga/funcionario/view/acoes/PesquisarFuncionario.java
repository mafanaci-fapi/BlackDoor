package br.edu.fapi.sga.funcionario.view.acoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.funcionario.Funcionario;

public class PesquisarFuncionario {

	public void pesquisarFuncionario() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pesquisar funcionario");
		System.out.println("Digite o nome do funcionario: ");
		String Nome = scanner.nextLine();
		System.out.println("Digite o CPF do funcionario: ");
		String CPF = scanner.nextLine();
		if (Nome == Funcionario.getNomeCompleto() && CPF == Funcionario.getCpf()) {
			System.out.println("Nome: " + Funcionario.getNomeCompleto());
			System.out.println("CPF: " + Funcionario.getCpf());
		} else {
			System.out.println("Nao existe dados para esse funcionario ");
		}
	}
}
