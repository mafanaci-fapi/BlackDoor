package br.edu.fapi.sga.funcionario.database;

import br.edu.fapi.sga.model.funcionario.Funcionario;

import java.util.List;

public interface FuncionarioDAO {

    int create(Funcionario funcionario);

    Funcionario retrieve(Funcionario funcionario);

    List<Funcionario> retrieveList(Funcionario funcionario);

    int update(Funcionario funcionario);

    int delete(Funcionario funcionario);
}
