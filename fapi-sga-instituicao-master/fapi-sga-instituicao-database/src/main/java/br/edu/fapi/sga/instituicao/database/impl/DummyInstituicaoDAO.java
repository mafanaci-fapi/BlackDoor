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

		System.out.println("Data Layer -> Instituicoes pesquisadas com sucesso");
		Instituicao instituicao1 = new Instituicao();
		instituicao1.setCnpj("Teste1");
		Instituicao instituicao2 = new Instituicao();
		instituicao2.setCnpj("Teste2");

		ArrayList<Instituicao>listaInstituicao = new ArrayList<>();
		listaInstituicao.add(instituicaoResultado);

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

}
