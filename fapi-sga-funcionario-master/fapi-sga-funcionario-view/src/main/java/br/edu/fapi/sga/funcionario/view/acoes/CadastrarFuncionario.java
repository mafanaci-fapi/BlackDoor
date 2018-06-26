package br.edu.fapi.sga.funcionario.view.acoes;

import java.util.ArrayList;
import java.util.Scanner;
import br.edu.fapi.sga.funcionario.controller.FuncionarioController;
import br.edu.fapi.sga.model.funcionario.Funcionario;

public class CadastrarFuncionario {

	public void cadastrarFuncionario(FuncionarioController funcionarioController, Scanner scanner, 
		ArrayList<Funcionario> arrFuncionario) {
		
		Funcionario funcionario = new Funcionario();
		String nomeCompleto, cpf, rg, telefone, email, endereco;
		Boolean status;
		Integer id;
		
		//ArrayList<Funcionario> func = new ArrayList<Funcionario>();
		
		System.out.println("Cadastrar Funcionario");
		System.out.println("Informe o nome completo: ");
		nomeCompleto = scanner.nextLine();
		funcionario.setNomeCompleto(nomeCompleto);
		
		System.out.println("Informe o CPF: ");
		cpf = scanner.nextLine();
		funcionario.setCpf(cpf);
		
		System.out.println("Informe o RG: ");
		rg = scanner.nextLine();
		funcionario.setRg(rg);
		
		System.out.println("Informe o telefone: ");
		telefone = scanner.nextLine();
		funcionario.setTelefone(telefone);
		
		System.out.println("Informe o e-mail: ");
		email = scanner.nextLine();
		funcionario.setEmail(email);
		
		System.out.println("Informe o endereco: ");
		endereco = scanner.nextLine();
		funcionario.setEndereco(endereco);
		
		System.out.println("Informe o status: ");
		status = convertToBoolean(scanner.nextLine());
		funcionario.setStatus(status);
		
		System.out.println("Informe o ID do funcionario: ");
		id = scanner.nextInt();
		funcionario.setIdFuncionario(id);
		
		
		if ((funcionario.getNomeCompleto() != "") && (funcionario.getCpf() != "")){
			arrFuncionario.add(funcionario);
			System.out.println("Cadastro realizado com Sucesso!");
		}
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
