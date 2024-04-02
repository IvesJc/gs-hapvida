package br.com.hapvida.beans;

public class Prescricao {
	
	private int codigo = 1;
	private String nome;
	public Prescricao() {
		super();
	}
	public Prescricao(String nome) {
		super();
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo = codigo + 1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
