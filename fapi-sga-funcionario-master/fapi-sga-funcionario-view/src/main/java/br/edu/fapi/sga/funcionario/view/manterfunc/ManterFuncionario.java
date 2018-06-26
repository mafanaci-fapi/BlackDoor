package br.edu.fapi.sga.funcionario.view.manterfunc;

import java.util.Scanner;

import br.edu.fapi.sga.funcionario.view.acoes.AtualizarFuncionario;
import br.edu.fapi.sga.funcionario.view.acoes.CadastrarFuncionario;
import br.edu.fapi.sga.funcionario.view.acoes.ExcluirFuncionario;
import br.edu.fapi.sga.funcionario.view.acoes.ListarFuncionario;
import br.edu.fapi.sga.funcionario.view.acoes.PesquisarFuncionario;

public class ManterFuncionario {

	public void menu() {

		Scanner scanner = new Scanner(System.in);
		int opcao = 0;
		while (opcao == 0) {
			System.out.println("Menu Funcionarios");
			System.out.println("Digite 0 p/ retornar ao menu");
			System.out.println("Digite 1 p/ cadastrar um funcionario");
			System.out.println("Digite 2 p/ atualizar um funcionario");
			System.out.println("Digite 3 p/ listar os funcionarios");
			System.out.println("Digite 4 p/ pesquisar um funcionario");
			System.out.println("Digite 5 p/ excluir um funcionario");
			System.out.println("Opcao:");
			opcao = scanner.nextInt();

			if (opcao == 1) {
				CadastrarFuncionario funcionario = new CadastrarFuncionario();
				funcionario.cadastrarFuncionario(null, scanner, null);
			}
			if (opcao == 2) {
				AtualizarFuncionario funcionario = new AtualizarFuncionario();
				funcionario.atualizarFuncionario(null, scanner, null);
			}
			if (opcao == 3) {
				ListarFuncionario funcio = new ListarFuncionario();
				funcio.listarFuncionario(null, null, null);
			}
			if (opcao == 4) {
				PesquisarFuncionario pesquisar = new PesquisarFuncionario();
				pesquisar.pesquisarFuncionario(null, scanner, null);
			}
			if (opcao == 5) {
				ExcluirFuncionario excluir = new ExcluirFuncionario();
				excluir.excluirFuncionario();
			}
		}

	}

}
