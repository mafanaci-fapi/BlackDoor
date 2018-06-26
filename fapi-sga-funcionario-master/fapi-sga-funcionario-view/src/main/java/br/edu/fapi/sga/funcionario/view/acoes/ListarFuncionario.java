package br.edu.fapi.sga.funcionario.view.acoes;

import br.edu.fapi.sga.model.funcionario.Funcionario;
import java.util.ArrayList;
import java.util.Scanner;
import br.edu.fapi.sga.funcionario.controller.FuncionarioController;

public class ListarFuncionario {

	public void listarFuncionario(FuncionarioController funcionarioController, Scanner scanner,
		ArrayList<Funcionario> arrFuncionario) {

		for (int i = 0; i < arrFuncionario.size(); i++) {
			if (arrFuncionario.get(i).getNomeCompleto() != "") {
				System.out.println("----------------");
				System.out.println("LISTA DE FUNCIONÁRIOS.");
				System.out.println("----------------");
				System.out.println("Nome Completo: " + arrFuncionario.get(i).getNomeCompleto());
				System.out.println("CPF: " + arrFuncionario.get(i).getCpf());
			} else {
				System.out.println("");
				System.out.println("Não há funcionários cadastrados.");
				System.out.println("");
			}
		

		}

	}
}
