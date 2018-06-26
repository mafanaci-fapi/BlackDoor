package br.edu.fapi.sga.funcionario.database.impl;

import br.edu.fapi.sga.funcionario.database.FuncionarioDAO;
import br.edu.fapi.sga.model.funcionario.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class DummyFuncionarioDAO implements FuncionarioDAO{

	@Override
	public int create(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcionário cadastrado com sucesso");
        return 1;
	}

	@Override
	public Funcionario retrieve(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcionário pesquisado com sucesso");
        Funcionario funcionarioResultado = new Funcionario();
        funcionarioResultado.setCpf("Teste Conteudo");
        return funcionarioResultado;
	}

	@Override
	public List<Funcionario> retrieveList(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcionários pesquisados com sucesso");

        Funcionario funcionarioResultado1 = new Funcionario();
        funcionarioResultado1.setCpf("Teste Conteudo 1");

        Funcionario funcionarioResultado2 = new Funcionario();
        funcionarioResultado2.setCpf("Teste Conteudo 2");

        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario.add(funcionarioResultado1);
        listaFuncionario.add(funcionarioResultado2);

        return listaFuncionario;
    }


	@Override
	public int update(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcionário atualizado com sucesso");
        return 1;
	}

	@Override
	public int delete(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcionário apagado com sucesso");
        return 1;
	}

	
}
