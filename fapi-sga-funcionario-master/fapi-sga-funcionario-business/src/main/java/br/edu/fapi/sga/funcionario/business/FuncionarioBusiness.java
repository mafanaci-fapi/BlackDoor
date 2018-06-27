package br.edu.fapi.sga.funcionario.business;

import java.util.List;
import br.edu.fapi.sga.model.funcionario.Funcionario;

public interface FuncionarioBusiness {

    int cadastrarFuncionario(Funcionario funcionario);

    Funcionario pesquisarFuncionario(Funcionario funcionario);

    List<Funcionario> pesquisarListaFuncionarios(Funcionario funcionario);

    int atualizarFuncionario(Funcionario funcionario);

    int excluirFuncionario(Funcionario funcionario);
}
