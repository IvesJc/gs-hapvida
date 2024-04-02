package br.com.hapvida.beans;


public class Paciente extends Pessoa {

	private int codigo = 1;
	private String tipoSanguineo;
	private Endereco endereco;

	public Paciente() {
		super();
	}
	
	public Paciente(String nome, String sobrenome, String cpf, String sexo, String dataNascimento, String naturalidade,
			String email, String estadoCivil, String tipoSanguineo) {
		super(nome, sobrenome, cpf, sexo, dataNascimento, naturalidade, email, estadoCivil);
		this.tipoSanguineo = tipoSanguineo;
	}

	// METODO getCodigo que gera um novo código ao Paciente sempre que o construtor for acionado
	public int getCodigo() {
		return codigo = codigo + 1;
	}



	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

	@Override
	public String toString() {
		return "Paciente"
				+ "\nCodigo: " + codigo 
				+ "\nNome: " + super.getNome() 
				+ "\nSobrenome: " + getSobrenome() 
				+ "\nCPF: " + getCpf()
				+ "\nSexo: " + getSexo() 
				+ "\nData de ascimento: " + getDataNascimento()
				+ "\nNaturalidade: " + getNaturalidade() 
				+ "\nEmail: " + getEmail()
				+ "\nEstado Civil: " + getEstadoCivil()
				+ "\nTipo Sanguineo: " + tipoSanguineo 
				+ "\nEndereço: " + getEndereco();
	}
	
	
	// MÉTODO PARA RETORNAR UMA STRING AFIRMANDO O AGENDAMENTO E CONCATENANDO O NOME DO RESPECTIVO PACIENTE
	public String agendarConsulta(String nome) {
		return "Verificando Médico(a) disponível...";
	}
	
	
	
	
	

	

	

}
