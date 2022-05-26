package model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Banco b = new Banco("Inter", 123);
		
		double valor;
		int conta = 1;
		double saldo1;
		double saldo2;
		int opcao1;
		int opcao2;
		
		System.out.println("---Vamos Criar sua Conta!---");
		System.out.println("Informe o nome: ");
		String nome = sc.nextLine();
		Cliente c1 = new Cliente(nome);
		Conta cc = new ContaCorrente(c1);
		b.addContas(cc);
		Conta poupanca = new ContaPoupanca(c1);
		b.addContas(poupanca);
		b.addCliente(c1);
		do {
		
		System.out.println("---Opções do Banco!---");
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Listar Clientes");
		System.out.println("2 - Listar Contas");
		System.out.println("0 - Sair");
		opcao1 = sc.nextInt();
		switch(opcao1) {
		case 1://Listar Clientes
			b.listClientes();
			break;
			
		case 2://Listar Contas Correntes
			b.listContas();
			break;
		
		}
	}while(opcao1!=0);
		
		do {
			System.out.println("---Movimentar Conta.---");
			System.out.println("Escolha uma opção: ");
			System.out.println("1 - Sacar");
			System.out.println("2 - Depositar");
			System.out.println("3 - Transferir");
			System.out.println("4 - Imprimir Extratos");
			System.out.println("0 - Sair");
			opcao2 = sc.nextInt();
			switch(opcao2) {			
			case 1://Sacar
				System.out.println("Informe o valor: ");
				valor = sc.nextDouble();
				System.out.println("Selecione a conta: ");
				System.out.println("1 - Poupança ");
				System.out.println("2 - Corrente");
				conta = sc.nextInt();
				saldo1 = poupanca.getSaldo();
				saldo2 = cc.getSaldo();
				if(conta == 1 && valor<=saldo1)
					poupanca.sacar(valor);
				else if(conta == 2 && valor<=saldo2)
					cc.sacar(valor);
				else
					System.out.println("Valor indisponível!");
				break;
				
			case 2://Depositar
				System.out.println("Informe o valor: ");
				valor = sc.nextDouble();
				System.out.println("Selecione a conta: ");
				System.out.println("1 - Poupança ");
				System.out.println("2 - Corrente");
				conta = sc.nextInt();
				if(conta == 1)
					poupanca.depositar(valor);
				else if(conta == 2)
					cc.depositar(valor);
				else
					System.out.println("Conta indisponível!");
				break;
				
			case 3://Transferir
				System.out.println("Informe o valor: ");
				valor = sc.nextDouble();
				System.out.println("Selecione a conta de origem: ");
				System.out.println("1 - Poupança ");
				System.out.println("2 - Corrente");
				conta = sc.nextInt();
				saldo1 = poupanca.getSaldo();
				saldo2 = cc.getSaldo();
				if(conta == 1 && valor<=saldo1)
					poupanca.transferir(valor, cc);
				else if(conta == 2 && valor<=saldo2)
					cc.transferir(valor, poupanca);
				else
					System.out.println("Conta indisponível ou saldo insuficiente!");
				break;
				
			case 4://Imprimir Extratos
				cc.imprimirExtrato();
				poupanca.imprimirExtrato();
				break;
			}
		}while(opcao2!=0);
		
			
		}

}
