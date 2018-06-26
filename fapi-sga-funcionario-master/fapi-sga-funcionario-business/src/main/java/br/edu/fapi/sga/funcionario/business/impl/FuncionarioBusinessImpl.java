package br.edu.fapi.sga.funcionario.business.impl;

import java.util.List;

import br.edu.fapi.sga.funcionario.business.FuncionarioBusiness;
import br.edu.fapi.sga.funcionario.database.FuncionarioDAO;
import br.edu.fapi.sga.funcionario.database.impl.DummyFuncionarioDAO;
import br.edu.fapi.sga.model.funcionario.Funcionario;

public class FuncionarioBusinessImpl implements FuncionarioBusiness{

    private FuncionarioDAO funcionarioDAO;

    public FuncionarioBusinessImpl(){
        this.funcionarioDAO = new DummyFuncionarioDAO();
    }

    public void setFuncionarioDAO(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }
    


	@Override
	public int cadastrarFuncionario(Funcionario funcionario) {
		if(funcionario != null){
            return funcionarioDAO.create(funcionario);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
	}

	@Override
	public Funcionario pesquisarFuncionario(Funcionario funcionario) {
		if(funcionario != null){
            return funcionarioDAO.retrieve(funcionario);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
	}

	@Override
	public List<Funcionario> pesquisarListaFuncionarios(Funcionario funcionario) {
		if(funcionario != null){
            return funcionarioDAO.retrieveList(funcionario);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
	}

	@Override
	public int atualizarFuncionario(Funcionario funcionario) {
		if(funcionario != null){
            return funcionarioDAO.update(funcionario);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }
	}

	@Override
	public int excluirFuncionario(Funcionario funcionario) {
		if(funcionario != null){
            return funcionarioDAO.delete(funcionario);
        }else{
            throw new IllegalArgumentException("Parametro nulo nao e permitido !!!");
        }

		
	}

}
