package br.edu.fapi.sga.funcionario.view.acoes;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.fapi.sga.funcionario.controller.FuncionarioController;
import br.edu.fapi.sga.model.funcionario.Funcionario;

public class AtualizarFuncionario {

	public void atualizarFuncionario(FuncionarioController funcionarioController, Scanner scanner,
			ArrayList<Funcionario> arrFuncionario) {

		int opcao;
		Funcionario func = new Funcionario();
		String nomeCompleto, cpf, rg, telefone, email, endereco;
		Boolean status;
		Integer id;

		do {
			System.out.println("");
			System.out.println("Digite 1 para atualizar um funcionário.");
			opcao = scanner.nextInt();

			System.out.println("Atualizar Funcionario");
			System.out.println("Informe o nome completo: ");
			nomeCompleto = scanner.nextLine();
			func.setNomeCompleto(nomeCompleto);
			if (nomeCompleto == func.getNomeCompleto()) {
				System.out.println("Informe o CPF: ");
				cpf = scanner.nextLine();
				func.setCpf(cpf);

				System.out.println("Informe o RG: ");
				rg = scanner.nextLine();
				func.setRg(rg);

				System.out.println("Informe o telefone: ");
				telefone = scanner.nextLine();
				func.setTelefone(telefone);

				System.out.println("Informe o e-mail: ");
				email = scanner.nextLine();
				func.setEmail(email);

				System.out.println("Informe o endereco: ");
				endereco = scanner.nextLine();
				func.setEndereco(endereco);

				System.out.println("Informe o status: ");
				status = convertToBoolean(scanner.nextLine());
				func.setStatus(status);

				System.out.println("Informe o ID do funcionario: ");
				id = scanner.nextInt();
				func.setIdFuncionario(id);

				funcionarioController.cadastrarFuncionario(func);

				System.out.println("");
				System.out.println("----------------------------------");
				System.out.println("ATUALIZAÇÃO REALIZADA COM SUCESSO.");
				System.out.println("----------------------------------");
				System.out.println("");
			} else {
				System.out.println("");
				System.out.println("Aviso não encontrado");
				System.out.println("");
			}

		} while (opcao != 1);

	}

	private boolean convertToBoolean(String valor) {
		if ("ativo".equalsIgnoreCase(valor)) {
			return true;
		} else if ("inativo".equalsIgnoreCase(valor) || "Inativo".equalsIgnoreCase(valor)) {
			return false;
		} else {
			System.out.println("Opcao invalida. ");
			return false;
		}
	}
}
