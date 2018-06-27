package br.edu.fapi.sga.funcionario.view.acoes;

import java.util.Scanner;
import br.edu.fapi.sga.funcionario.controller.FuncionarioController;
import br.edu.fapi.sga.model.funcionario.Funcionario;

public class ExcluirFuncionario {

	public void excluirFuncionario(FuncionarioController funcionarioController, Scanner scanner,
			Funcionario funcionario) {

		String opcao;
		int defNome = 0;

		System.out.println("Excluir funcionario");
		System.out.println("Digite o nome do funcionario: ");
		String Nome = scanner.nextLine();
		if (Nome != funcionario.getNomeCompleto()) {
			System.out.println("Nome n�o existe. Digite Novamente");
		} else {
			defNome = 1;
		}
		while (defNome == 0) {
			if (Nome == funcionario.getNomeCompleto()) {
				funcionario.setNomeCompleto(Nome);

				funcionarioController.excluirFuncionario(funcionario);

				System.out.println("");
				System.out.println("---------------------------");
				System.out.println("FUNCION�RIO EXCLUIDO COM SUCESSO.");
				System.out.println("---------------------------");
				System.out.println("");
			} else {
				System.out.println("");
				System.out.println("Funcion�rio n�o encontrado");
				System.out.println("");
			}
		}
	}

}
