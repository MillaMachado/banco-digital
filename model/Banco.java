package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private int codigoISPB;
	private List<Conta> contas;
	private List<Cliente> clientes;
	
	
	public Banco(String nome, int codigoISPB) {
		super();
		this.nome = nome;
		this.codigoISPB = codigoISPB;
		this.contas = new ArrayList<Conta>();
		this.clientes = new ArrayList<Cliente>();
	}
	public void addContas(Conta contas) {
		this.contas.add(contas);
	}

	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	public void listContas() {
		for(Conta contas : this.contas) {
			System.out.println("Agencia: "+ contas.getAgencia());
			System.out.println("Conta: "+ contas.getNumero());
		}
	}

	public void listClientes() {
		for(Cliente c : this.clientes) {
			System.out.println("Nome: "+ c.getNome());
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodigoISPB() {
		return codigoISPB;
	}
	public void setCodigoISPB(int codigoISPB) {
		this.codigoISPB = codigoISPB;
	}
	public List<Conta> getContas() {
		return contas;
	}
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
