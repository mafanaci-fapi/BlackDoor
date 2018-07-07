package br.edu.fapi.sga.instituicao.controller;

import br.edu.fapi.sga.model.funcionario.Funcionario;
import br.edu.fapi.sga.model.instituicao.Instituicao;

import java.util.List;

public interface InstituicaoController {

	int cadastrarInstituicao(Instituicao instituicao);

	Instituicao pesquisarInstituicao (Instituicao instituicao);

	List<Instituicao> pesquisarListaInstituicao (Instituicao instituicao);

	int atualizarInstituicao (Instituicao instituicao);

	int excluirInstituicao(Instituicao instituicao);

}
