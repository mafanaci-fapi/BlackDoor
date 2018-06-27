package br.edu.fapi.sga.funcionario.view.main;

import br.edu.fapi.sga.funcionario.view.manterfunc.ManterFuncionario;

import br.edu.fapi.sga.funcionario.controller.FuncionarioController;
import br.edu.fapi.sga.funcionario.controller.impl.FuncionarioControllerImpl;
import br.edu.fapi.sga.funcionario.view.acoes.CadastrarFuncionario;
import br.edu.fapi.sga.funcionario.view.acoes.AtualizarFuncionario;
import br.edu.fapi.sga.funcionario.view.acoes.ExcluirFuncionario;
import br.edu.fapi.sga.funcionario.view.acoes.ListarFuncionario;
import br.edu.fapi.sga.funcionario.view.acoes.PesquisarFuncionario;
import br.edu.fapi.sga.model.funcionario.Funcionario;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<Funcionario> arrFuncionario = new ArrayList();
	
    public void menu() {
        FuncionarioController funcionarioController = new FuncionarioControllerImpl();

        int opcao;
        //int voltar = 1;
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        do {
            System.out.println("Escolha uma opção.");
            System.out.println("1 - Cadastrar um funcionário.");
            System.out.println("2 - Excluir um funcionário.");
            System.out.println("3 - Atualizar um funcionário.");
            System.out.println("4 - Pesquisar um funcionário.");
            System.out.println("5 - Listar funcionários.");
            System.out.println("0 - Voltar");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    CadastrarFuncionario cadastro = new CadastrarFuncionario();
                    cadastro.cadastrarFuncionario(funcionarioController, scanner, arrFuncionario);
                    break;
                case 2:
                    ExcluirFuncionario excluir = new ExcluirFuncionario();
                    excluir.excluirFuncionario(funcionarioController, scanner, arrFuncionario);
                    break;
                case 3:
                    AtualizarFuncionario atualiza = new AtualizarFuncionario();
                    atualiza.atualizarFuncionario(funcionarioController, scanner, arrFuncionario);
                    break;
                case 4:
                    PesquisarFuncionario pesquisa = new PesquisarFuncionario();
                    pesquisa.pesquisarFuncionario(funcionarioController, scanner, arrFuncionario);
                    break;
                case 5:
                    ListarFuncionario listar = new ListarFuncionario();
                    listar.listarFuncionario(funcionarioController, scanner, arrFuncionario);
				break;
 
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}

