package br.edu.fapi.sga.funcionario.view.acoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.funcionario.Funcionario;

public class ExcluirFuncionario {

	public void excluirFuncionario() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Excluir funcionario");
		System.out.println("Digite o nome do funcionario: ");
		String Nome = scanner.nextLine();

		if (Nome == Funcionario.getNomeCompleto()) {
			System.out.println("Funcionario excluido");
		} else {
			System.out.println("Nao existe funcionarios no sistema com esse nome. ");
		}
	}
}
