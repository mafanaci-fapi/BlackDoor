package br.edu.fapi.sga.funcionario.controller.impl;

import br.edu.fapi.sga.funcionario.business.impl.FuncionarioBusinessImpl;
import br.edu.fapi.sga.funcionario.controller.FuncionarioController;
import br.edu.fapi.sga.model.funcionario.Funcionario;
import java.util.List;

public class FuncionarioControllerImpl implements FuncionarioController {

	    private FuncionarioBusinessImpl funcionarioBusiness;

	    public FuncionarioControllerImpl() {
	        this.funcionarioBusiness = new FuncionarioBusinessImpl();
	    }

	    public void setFuncionarioBusiness(FuncionarioBusinessImpl funcionarioBusiness) {
	        this.funcionarioBusiness = funcionarioBusiness;
	    }

		@Override
		public int cadastrarFuncionario(Funcionario funcionario) {
			return funcionarioBusiness.cadastrarFuncionario(funcionario);
		}

		@Override
		public Funcionario pesquisarFuncionario(Funcionario funcionario) {
			return funcionarioBusiness.pesquisarFuncionario(funcionario);
		}

		@Override
		public List<Funcionario> pesquisarListaFuncionario(Funcionario funcionario) {
			return funcionarioBusiness.pesquisarListaFuncionarios(funcionario);
		}

		@Override
		public int atualizarFuncionario(Funcionario funcionario) {
			return funcionarioBusiness.atualizarFuncionario(funcionario);
		}

		@Override
		public int excluirFuncionario(Funcionario funcionario) {
			return funcionarioBusiness.excluirFuncionario(funcionario);
		}

}
