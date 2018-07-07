package br.edu.fapi.sga.instituicao.database.impl;

import br.edu.fapi.sga.instituicao.database.InstituicaoDAO;
import br.edu.fapi.sga.model.instituicao.Instituicao;

import java.util.ArrayList;
import java.util.List;

public class DummyInstituicaoDAO implements InstituicaoDAO {


	Instituicao instituicaoResultado = new Instituicao();

	@Override
	public int create(Instituicao instituicao) {
		System.out.println("Data Layer -> Instituição cadastrada com sucesso");
		return 1;
	}

	@Override
	public Instituicao retrieve(Instituicao instituicao) {

		System.out.println("Data Layer -> Instituicao pesquisada com sucesso");
		instituicaoResultado.setCnpj("99999999");
		return instituicaoResultado;
	}

	@Override
	public List<Instituicao> retrieveList(Instituicao instituicao) {
		return null;
	}

	@Override
	public int update(Instituicao instituicao) {

		System.out.println("Data Layer -> Instituicao atualizada com sucesso");
		return 1;
	}


	@Override
	public int delete(Instituicao instituicao) {

		System.out.println("Data Layer -> Instituicao apagada com sucesso");
		return 1;
	}


	/*


	@Override
	public List<Funcionario> retrieveList(Funcionario funcionario) {
		System.out.println("Data Layer -> Funcion�rios pesquisados com sucesso");

        Funcionario funcionarioResultado1 = new Funcionario();
        funcionarioResultado1.setCpf("Teste Conteudo 1");

        Funcionario funcionarioResultado2 = new Funcionario();
        funcionarioResultado2.setCpf("Teste Conteudo 2");

        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario.add(funcionarioResultado1);


*/
	
}
