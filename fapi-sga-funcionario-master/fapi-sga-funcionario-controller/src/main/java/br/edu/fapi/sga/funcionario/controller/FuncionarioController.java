package br.edu.fapi.sga.funcionario.controller;

import br.edu.fapi.sga.model.funcionario.Funcionario;

import java.util.List;

public interface FuncionarioController {
	
	 int cadastrarFuncionario(Funcionario funcionario);

	 Funcionario pesquisarFuncionario(Funcionario funcionario);

	 List<Funcionario> pesquisarListaFuncionario(Funcionario funcionario);

	 int atualizarFuncionario(Funcionario funcionario);

	 int excluirFuncionario(Funcionario funcionario);

}
