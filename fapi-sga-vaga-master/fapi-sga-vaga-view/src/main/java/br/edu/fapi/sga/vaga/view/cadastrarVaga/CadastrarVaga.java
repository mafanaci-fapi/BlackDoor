package br.edu.fapi.sga.vaga.view.cadastrarVaga;

import java.util.Scanner;

import br.edu.fapi.sga.model.vaga.Vaga;

public class CadastrarVaga {

	public void cadastrarVaga() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("CADASTRAMENTO DE VAGA:");
		System.out.println("Vaga:");
		Vaga.setNomeDaVaga(scanner.nextLine());
		System.out.println("\nNome da Empresa:");
		Vaga.setNomeDaEmpresa(scanner.nextLine());
		System.out.println("\nCNPJ:");
		Vaga.setCNPJ(scanner.nextLine());
		System.out.println("\nRequisitos Obrigatorios:");
		Vaga.setRequisitoObrigatorio(scanner.nextLine());
		System.out.println("\nRequisitos Desejaveis:");
		Vaga.setRequisitoDesejaveis(scanner.nextLine());
		System.out.println("\nDescrição das Atividades:");
		Vaga.setDescricaoDasAtividades(scanner.nextLine());
		System.out.println("\nHorario de Trabalho:");
		Vaga.setHorarioDeTrabalho(scanner.nextLine());
		System.out.println("\nLocal de Trabalho:");
		Vaga.setLocalTrabalho(scanner.nextLine());
		System.out.println("\nBeneficios:");
		Vaga.setBeneficio(scanner.nextLine());
		System.out.println("\nResponsável Pela Vaga:");
		Vaga.setResponsavelPelaVaga(scanner.nextLine());
		System.out.println("\nTelefone:");
		Vaga.setTelefone(scanner.nextLong());
		System.out.println("Observação:");
		Vaga.setObservacao(scanner.nextLine());
		System.out.println("\nSalario:");
		Vaga.setSalario(scanner.nextFloat());
		System.out.println("Cadastro realizado com sucesso!");

	}
}