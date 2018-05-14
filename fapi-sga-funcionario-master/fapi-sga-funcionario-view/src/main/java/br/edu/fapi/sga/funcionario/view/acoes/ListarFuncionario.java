package br.edu.fapi.sga.funcionario.view.acoes;

import br.edu.fapi.sga.model.funcionario.Funcionario;

public class ListarFuncionario {

	public void listarFuncionario() {
		if (Funcionario.getNomeCompleto() != null) {
			System.out.println(Funcionario.getNomeCompleto());
		} else {
			System.out.println("Nao existe funcionarios no sistema. ");
		}
	}

}
