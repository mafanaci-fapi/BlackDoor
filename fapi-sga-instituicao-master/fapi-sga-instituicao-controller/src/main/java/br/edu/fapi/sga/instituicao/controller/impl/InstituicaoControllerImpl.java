package br.edu.fapi.sga.instituicao.controller.impl;
import br.edu.fapi.sga.instituicao.business.imp.InstituicaoBusinessImp;
import br.edu.fapi.sga.instituicao.controller.InstituicaoController;
import br.edu.fapi.sga.model.instituicao.Instituicao;

import java.util.List;

public class InstituicaoControllerImpl implements InstituicaoController {

	private InstituicaoBusinessImp instituicaoBusinessImp;

	public InstituicaoBusinessImp getInstituicaoBusinessImp() {
		return instituicaoBusinessImp;
	}

	public void setInstituicaoBusinessImp(InstituicaoBusinessImp instituicaoBusinessImp) {
		this.instituicaoBusinessImp = instituicaoBusinessImp;
	}

	@Override
	public int cadastrarInstituicao(Instituicao instituicao) {
		return 0;
	}

	@Override
	public Instituicao pesquisarInstituicao(Instituicao instituicao) {
		return null;
	}

	@Override
	public List<Instituicao> pesquisarListaInstituicao(Instituicao instituicao) {
		return null;
	}

	@Override
	public int atualizarInstituicao(Instituicao instituicao) {
		return 0;
	}

	@Override
	public int excluirInstituicao(Instituicao instituicao) {
		return 0;
	}




}
