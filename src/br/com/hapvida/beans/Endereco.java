package br.com.hapvida.beans;

public class Endereco {

	private int codigo = 1;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	public Endereco() {
		super();
	}
	public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade,
			String uf, String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	// METODO getCodigo que gera um novo código ao Endereco sempre que o construtor for acionado
	public int getCodigo() {
		return codigo = codigo + 1;
	}

	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	@Override
	public String toString() {
		return "Endereco"
				+ "\nCodigo: " + codigo 
				+ "\nLogradouro: " + logradouro 
				+ "\nNumero: " + numero 
				+ "\nComplemento: " + complemento 
				+ "\nBairro: " + bairro 
				+ "\nCidade: " + cidade 
				+ "\nUF: " + uf 
				+ "\nCEP: " + cep;
	}
	
	

	


}
