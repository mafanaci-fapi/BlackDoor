package br.edu.fapi.sga.funcionario.view.acoes;

import java.util.Scanner;

import br.edu.fapi.sga.model.funcionario.Funcionario;

public class CadastrarFuncionario {

	Scanner scanner = new Scanner(System.in);
	private String nomeCompleto;
	private String cpf;
	private String rg;
	private String telefone;
	private String email;
	private String endereco;
	private boolean status;
	private int idFuncionario;

	public void cadastrarFuncionario() {
		System.out.println("Cadastrar Funcionario");
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
		Funcionario.setStatus(convertToBoolean(scanner.nextLine()));
		System.out.println("Informe o ID do funcionario: ");
		Funcionario.setIdFuncionario(scanner.nextInt());
		System.out.println("Cadastro realizado com Sucesso!");
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
