package br.edu.fapi.sga.funcionario.view.acoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.funcionario.Funcionario;

public class AtualizarFuncionario {

	public void atualizarFuncionario() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Atualizar Funcionario");
		System.out.println("Digite o nome do funcionario: ");
		String Nome = scanner.nextLine();

		if (Nome == Funcionario.getNomeCompleto()) {
			System.out.println("Informe o nome completo: ");
			Funcionario.setNomeCompleto(scanner.nextLine());
			System.out.println("Informe o CPF: ");
			Funcionario.setCpf(scanner.nextLine());
			System.out.println("Informe o RG: ");
			Funcionario.setRg(scanner.nextLine());
			System.out.println("Informe o telefone: ");
			Funcionario.setTelefone(scanner.nextLine());
			System.out.println("Informe o e-mail: ");
			Funcionario.setEmail(scanner.nextLine());
			System.out.println("Informe o endereco: ");
			Funcionario.setEndereco(scanner.nextLine());
			System.out.println("Informe o status: ");
			Funcionario.setStatus(scanner.nextBoolean());
			System.out.println("Informe o ID do funcionario: ");
			Funcionario.setIdFuncionario(scanner.nextInt());
			System.out.println("Atualizacao realizada com Sucesso!");
		} else {
			System.out.println("Nome nao encontrado! ");
		}
	}
}
