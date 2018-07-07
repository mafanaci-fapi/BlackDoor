package br.edu.fapi.sga.instituicao.database;

import br.edu.fapi.sga.model.instituicao.Instituicao;

import java.util.List;

public interface InstituicaoDAO {

    int create(Instituicao instituicao);

    Instituicao retrieve(Instituicao instituicao);

    List<Instituicao> retrieveList(Instituicao instituicao);

    int update(Instituicao instituicao);

    int delete(Instituicao instituicao);
}
