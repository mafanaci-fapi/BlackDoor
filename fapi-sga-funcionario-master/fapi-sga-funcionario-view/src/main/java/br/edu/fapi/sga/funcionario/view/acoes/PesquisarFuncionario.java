package br.edu.fapi.sga.funcionario.view.acoes;

import br.edu.fapi.sga.model.funcionario.Funcionario;
import java.util.ArrayList;
import java.util.Scanner;
import br.edu.fapi.sga.funcionario.controller.FuncionarioController;

public class PesquisarFuncionario {

	public void pesquisarFuncionario(FuncionarioController funcionarioController, Scanner scanner,
		ArrayList<Funcionario> arrFuncionario) {

		Funcionario funcionario = new Funcionario();
		
		String Nome;
		
		for (int i = 0; i < arrFuncionario.size(); i++) {
			System.out.println("Digite o nome completo: ");
			Nome = scanner.nextLine();
			if (arrFuncionario.get(i).getNomeCompleto() == funcionario.getNomeCompleto()) {
				System.out.println("----------------");
				System.out.println("FUNCIONÁRIOS");
				System.out.println("----------------");
				System.out.print(arrFuncionario.get(i).getNomeCompleto());
			} else {
				System.out.println("");
				System.out.println("Não há funcionários cadastrados.");
				System.out.println("");
			}
		

		}

	}
}
