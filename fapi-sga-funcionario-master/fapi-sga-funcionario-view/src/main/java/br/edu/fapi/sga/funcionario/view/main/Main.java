package br.edu.fapi.sga.funcionario.view.main;

import java.util.Scanner;

import br.edu.fapi.sga.funcionario.view.setor.Rh;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("Informe seu cargo:");
			System.out.println("1 - Analista de Recursos Humanos");
			System.out.println("2 - Assistente de Recursos Humanos");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				Rh analistarh = new Rh();
				analistarh.manterFuncionario();
				break;
			
			case 2:
				Rh assistrh = new Rh();
				assistrh.manterFuncionario();
				break;
			default:
				System.out.println("Você não permissão para alterar dados de um funcionário");
				break;
			}
		} while (opcao < 1 || opcao > 2);
	}
}
