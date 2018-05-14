package br.edu.fapi.sga.vaga.view.menu;

import java.util.Scanner;

import br.edu.fapi.sga.vaga.view.atualizarVaga.AtualizarVaga;
import br.edu.fapi.sga.vaga.view.cadastrarVaga.CadastrarVaga;
import br.edu.fapi.sga.vaga.view.excluirVaga.ExcluirVaga;
import br.edu.fapi.sga.vaga.view.listarVaga.ListarVaga;
import br.edu.fapi.sga.vaga.view.pesquisarVaga.PesquisarVaga;

public class Menu {

	public void menu() {
		Scanner scanner = new Scanner(System.in);
		int op = 0;
		while (op == 0) {

			System.out.println("ESCOLHA O NUMERO DA OPÇÃO DESEJADA E PRESSIONE ENTER:");
			System.out.println("MENU DE VAGAS");
			System.out.println("01 - Cadastrar Vagas.");
			System.out.println("02 - Atualizar Vagas.");
			System.out.println("03 - Listar Vagas.");
			System.out.println("04 - Pesquisar Vagas.");
			System.out.println("05 - Excluir Vagas.\n");
			System.out.println("Opcao:");
			op = scanner.nextInt();

			if (op == 1) {
				CadastrarVaga cadastro = new CadastrarVaga();
				cadastro.cadastrarVaga();
			}
			if (op == 2) {
				AtualizarVaga atualizar = new AtualizarVaga();
				atualizar.atualizarVaga();
			}
			if (op == 3) {
				ListarVaga listar = new ListarVaga();
				listar.listarVaga();
			}
			if (op == 4) {
				PesquisarVaga pesquisar = new PesquisarVaga();
				pesquisar.pesuisarVaga();
			}
			if (op == 5) {
				ExcluirVaga excluir = new ExcluirVaga();
				excluir.excluirVaga();
			}
		}
	}
}