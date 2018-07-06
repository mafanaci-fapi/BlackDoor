package br.edu.fapi.sga.instituicao.business;

import br.edu.fapi.sga.model.instituicao.Instituicao;

import java.util.List;

public interface InstituicaoBusiness {

    int cadastrarInstituicao(Instituicao instituicao);

    Instituicao pesquisarInstituicao (Instituicao instituicao);

    List<Instituicao> pesquisarListaInstituicao (Instituicao instituicao);

    int atualizarInstituicao (Instituicao instituicao);

    int excluirInstituicao(Instituicao instituicao);
}
