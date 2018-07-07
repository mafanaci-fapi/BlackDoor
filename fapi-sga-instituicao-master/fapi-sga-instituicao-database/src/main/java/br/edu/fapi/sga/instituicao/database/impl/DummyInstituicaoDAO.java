package br.edu.fapi.sga.instituicao.database.impl;

import br.edu.fapi.sga.instituicao.database.InstituicaoDAO;
import br.edu.fapi.sga.model.instituicao.Instituicao;

import java.util.ArrayList;
import java.util.List;

public class DummyInstituicaoDAO implements InstituicaoDAO {




	@Override
	public int create(Instituicao instituicao) {
		return 0;
	}

	@Override
	public Instituicao retrieve(Instituicao instituicao) {
		return null;
	}

	@Override
	public List<Instituicao> retrieveList(Instituicao instituicao) {
		return null;
	}

	@Override
	public int update(Instituicao instituicao) {
		return 0;
	}

	@Override
	public int delete(Instituicao instituicao) {
		return 0;
	}


	/*


	@Override
	public int create(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcion�rio cadastrado com sucesso");
        return 1;
	}

	@Override
	public Funcionario retrieve(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcion�rio pesquisado com sucesso");
        Funcionario funcionarioResultado = new Funcionario();
        funcionarioResultado.setCpf("Teste Conteudo");
        return funcionarioResultado;
	}

	@Override
	public List<Funcionario> retrieveList(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcion�rios pesquisados com sucesso");

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
		System.out.println("Data Layer -> Funcion�rio atualizado com sucesso");
        return 1;
	}

	@Override
	public int delete(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcion�rio apagado com sucesso");
        return 1;
	}

*/
	
}
