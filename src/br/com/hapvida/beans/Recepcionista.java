package br.com.hapvida.beans;

public class Recepcionista extends Pessoa{
	

	private int codigo = 1; 
	private String dataAdmissao;
	private String dataDesligamento;
	public Recepcionista() {
		super();
	}
	
	public Recepcionista(String nome, String sobrenome, String cpf, String sexo, String dataNascimento,
			String naturalidade, String email, String estadoCivil, String dataAdmissao,
			String dataDesligamento) {
		super(nome, sobrenome, cpf, sexo, dataNascimento, naturalidade, email, estadoCivil);
		this.dataAdmissao = dataAdmissao;
		this.dataDesligamento = dataDesligamento;
	}
	// METODO getCodigo que gera um novo código ao Recepcionista sempre que o construtor for acionado
	public int getCodigo() {
		return codigo = codigo + 1;
	}
	public String getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getDataDesligamento() {
		return dataDesligamento;
	}
	public void setDataDesligamento(String dataDesligamento) {
		this.dataDesligamento = dataDesligamento;
	}
	
	

	
}
