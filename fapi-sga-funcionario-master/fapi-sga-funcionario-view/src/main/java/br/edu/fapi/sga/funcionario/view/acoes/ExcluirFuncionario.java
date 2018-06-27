package br.edu.fapi.sga.funcionario.view.acoes;

import java.util.ArrayList;
import java.util.Scanner;
import br.edu.fapi.sga.funcionario.controller.FuncionarioController;
import br.edu.fapi.sga.model.funcionario.Funcionario;

public class ExcluirFuncionario {

	public void excluirFuncionario(FuncionarioController funcionarioController, Scanner scanner,
			ArrayList<Funcionario> arrFuncionario) {

		String opcao;
		int defNome = 0;

		Funcionario funcionario = new Funcionario();

		System.out.println("Excluir funcionario");
		System.out.println("Digite o nome do funcionario: ");
		String Nome = scanner.nextLine();

		while (Nome != funcionario.getNomeCompleto()) {

			System.out.println("Nome não existe. Digite Novamente");
			String Nome1 = scanner.nextLine();
			defNome = 1;

		} if (Nome == funcionario.getNomeCompleto()) {
			arrFuncionario.remove(funcionario);

			funcionarioController.excluirFuncionario(funcionario);

			System.out.println("");
			System.out.println("---------------------------");
			System.out.println("FUNCIONÁRIO EXCLUIDO COM SUCESSO.");
			System.out.println("---------------------------");
			System.out.println("");
		}
	}
}