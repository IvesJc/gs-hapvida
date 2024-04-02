package br.com.hapvida.beans;

public class Medico extends Pessoa{
	
	private int codigo = 1; 
	private String dataAdmissao;
	private String dataDesligamento;
	private String crm;
	
	public Medico() {
		super();
	}
	
	public Medico(String nome, String sobrenome, String cpf, String sexo, String dataNascimento, String naturalidade,
			String email, String estadoCivil, String dataAdmissao, String dataDesligamento, String crm) {
		super(nome, sobrenome, cpf, sexo, dataNascimento, naturalidade, email, estadoCivil);
		this.dataAdmissao = dataAdmissao;
		this.dataDesligamento = dataDesligamento;
		this.crm = crm;
	}

	// METODO getCodigo que gera um novo código ao Médico sempre que o construtor for acionado
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

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	// METODO QUE RETORNA UMA STRING PARA CONFIRMAR O AGENDAMENTO
	public String agendarConsulta(String nomePaci) {
		return "Consulta agendada para o paciente " + nomePaci + " com o(a) médico(a) " + getNome();
	}
}
