package br.edu.fapi.sga.vaga.view.listarVaga;

import br.edu.fapi.sga.model.vaga.Vaga;

public class ListarVaga {

	public void listarVaga() {
		if (Vaga.getNomeDaVaga() != null) {
			System.out.println(Vaga.getNomeDaVaga());
		} else {
			System.out.println("Nao existe vagas no sistema. ");
		}
	}

}