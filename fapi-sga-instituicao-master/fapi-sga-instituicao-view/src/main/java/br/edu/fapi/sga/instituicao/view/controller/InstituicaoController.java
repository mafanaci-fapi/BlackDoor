package br.edu.fapi.sga.instituicao.view.controller;

import java.util.Scanner;

import br.edu.fapi.sga.model.instituicao.Instituicao;

public class InstituicaoController {

	Scanner scanner = new Scanner(System.in);

	public InstituicaoController InstituicaoMenu() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Instituição");
		System.out.println("Digite 0 para retornar ao menu");
		System.out.println("Digite 1 para cadastrar uma instituição");
		System.out.println("Digite 2 para atualizar uma instituição");
		System.out.println("Digite 3 para listar as instituição");
		System.out.println("Digite 4 para pesquisar uma instituição");
		System.out.println("Digite 5 para excluir uma instituição");
		System.out.println("Opcao:");
		int opcao = scanner.nextInt();

		switch (opcao) {
			case 1:
				cadastrarInstituicao();
				break;

			case 2:
				atualizarInstituicao();
				break;

			case 3:
				listarInstituicao();
				break;

			case 4:
				pesquisarInstituicao();
				break;
			case 5:
				excluirInstituicao();
				break;
			default:

				System.out.println("Opção inválida");
				System.out.println("");
				InstituicaoMenu();

		}
				return null;
		}

//		if (opcao == 1) {
//			cadastrarInstituicao();
//		} else {
//			if (opcao == 2) {
//				atualizarInstituicao();
//
//			} else {
//				if (opcao == 3) {
//					listarInstituicao();
//
//				} else {
//					if (opcao == 4) {
//						pesquisarInstituicao();
//
//					} else {
//						if (opcao == 5) {
//							excluirInstituicao();
//
//						} else {
//							System.out.println("Opção inválida");
//							InstituicaoMenu();
//						}
//					}
//				}
//			}
//		}
//		return null;
//	}

	public String cadastrarInstituicao() {

		Instituicao instituicao = new Instituicao();

		System.out.println("Cadastrar instituição:");
		System.out.println("Razão Social:");
		instituicao.setRazaoSocial(scanner.nextLine());
		System.out.println("CNPJ:");
		instituicao.setCnpj(scanner.nextLine());
		System.out.println("Nome Fantasia da Instituição:");
		instituicao.setNomeFantasia(scanner.nextLine());
		System.out.println("Endereço:");
		instituicao.setEndereco(scanner.nextLine());
		System.out.println("Socio(s):");
		instituicao.setSocios(scanner.nextLine());
		System.out.println("");

		System.out.println("Operação realizada com sucesso");
		System.out.println("");
		InstituicaoMenu();
		return null;
	}

	public String atualizarInstituicao() {

		Instituicao instituicao = new Instituicao();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Atualizar Instituição");
		System.out.println("Digite o nome fantasia da instituição que deseja atualizar:");
		String nomeFantasia = scanner.nextLine();

		if (nomeFantasia == instituicao.getNomeFantasia()) {

			System.out.println("Cadastrar instituição:");
			System.out.println("Razão Social:");
			instituicao.setRazaoSocial(scanner.nextLine());
			System.out.println("CNPJ:");
			instituicao.setCnpj(scanner.nextLine());
			System.out.println("Nome Fantasia da Instituição:");
			instituicao.setNomeFantasia(scanner.nextLine());
			System.out.println("Endereço:");
			instituicao.setEndereco(scanner.nextLine());
			System.out.println("Socio(s):");
			instituicao.setSocios(scanner.nextLine());

			System.out.println("Operação realizada com sucesso");
			System.out.println("");
			InstituicaoMenu();
			return null;

		} else {
			System.out.println("");
			System.err.print("Instituição inválida");
			System.out.println("");
			InstituicaoMenu();
			return atualizarInstituicao();
		}

	}

	public String excluirInstituicao() {

		Instituicao instituicao = new Instituicao();

		//COLOCAR PARA LISTAR AS INSTITUIÇÕES E O CLIENTE VERIFICA AS
		// INSTITUIÇÕES CADASTRADAS E PODERÁ SABER QUAL INSTITUIÇÃO SERÁ EXCLUIDA.


		System.out.println("Exluir insituição?");
		System.out.println("Digite o nome fantasia da instituição:");
		String nomeFantasia = scanner.nextLine();

		if (nomeFantasia == instituicao.getNomeFantasia()) {
			System.out.println("Tem certeza que deseja exluir" + instituicao.getNomeFantasia());
			System.out.println("(1)Sim / (2)Não");
			int opcao = scanner.nextInt();

			switch (opcao) {

				case 1:
					System.out.println("Excluido com sucesso");
					InstituicaoMenu();
					break;
				case 2:
					InstituicaoMenu();
					break;
				default:
						System.err.print("Opção inválida");
					System.out.println("");
						excluirInstituicao();
					}
			}
//			if (opcao == 1) {
//				System.out.println("Excluido com sucesso");
//				InstituicaoMenu();
//			}
//			if (opcao == 2) {
//				InstituicaoMenu();
//			}
//			if (opcao != 1 && opcao != 2) {
//				System.out.println("Opção inválida");
//				excluirInstituicao();
//			}
//		} else {
//			System.out.println("Nome inválido");
//			excluirInstituicao();
//		}
			InstituicaoMenu();
			return null;
		}


	public String pesquisarInstituicao() {

		Instituicao instituicao = new Instituicao();

		System.out.println("Pesquisar instituição");
		System.out.println("Digite o nome da instituição: ");
		String Nome = scanner.nextLine();

		if (Nome == instituicao.getNomeFantasia()) {
			System.out.println("Nome: " + instituicao.getNomeFantasia());
			InstituicaoMenu();
		} else {
			System.err.print("Não existe dados para essa instituição ");
			System.out.println("");
			pesquisarInstituicao();
		}
		InstituicaoMenu();
		return null;
	}

	public String listarInstituicao() {

		Instituicao instituicao = new Instituicao();

		if (instituicao.getNomeFantasia() != null) {
			System.out.println(instituicao.getNomeFantasia());
			
		} else {
			System.err.print("Erro.");
			System.out.println("");
			listarInstituicao();
		}
		InstituicaoMenu();
		return null;
	}

}
