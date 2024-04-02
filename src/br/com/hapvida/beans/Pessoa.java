package br.com.hapvida.beans;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private String cpf;
	private String sexo;
	private String dataNascimento;
	private String naturalidade;
	private String email;
	private String estadoCivil;

	public Pessoa() {
		super();
	}

	public Pessoa(String nome, String sobrenome, String cpf, String sexo, String dataNascimento, String naturalidade,
			String email, String estadoCivil) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.naturalidade = naturalidade;
		this.email = email;
		this.estadoCivil = estadoCivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	

}
