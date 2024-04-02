package br.com.hapvida.beans;

public class ProntuarioEletronico {
	
	private int codigo; 
	private String antecedentesPessoais[];
	private String antecedentesFamiliares[];
	private Prescricao prescricao[];
	private String complicacoes;
	public ProntuarioEletronico() {
		super();
	}
	public ProntuarioEletronico(String[] antecedentesPessoais,
			String[] antecedentesFamiliares, Prescricao[] prescricao, String complicacoes) {
		super();
		this.antecedentesPessoais = antecedentesPessoais;
		this.antecedentesFamiliares = antecedentesFamiliares;
		this.prescricao = prescricao;
		this.complicacoes = complicacoes;
	}
	// METODO getCodigo que gera um novo código ao Prontuário Eletronico sempre que o construtor for acionado
	public int getCodigo() {
		return codigo = codigo + 1;
	}
	public String[] getAntecedentesPessoais() {
		return antecedentesPessoais;
	}
	public void setAntecedentesPessoais(String[] antecedentesPessoais) {
		this.antecedentesPessoais = antecedentesPessoais;
	}
	public String[] getAntecedentesFamiliares() {
		return antecedentesFamiliares;
	}
	public void setAntecedentesFamiliares(String[] antecedentesFamiliares) {
		this.antecedentesFamiliares = antecedentesFamiliares;
	}
	public Prescricao[] getPrescricao() {
		return prescricao;
	}
	public void setPrescricao(Prescricao[] prescricao) {
		this.prescricao = prescricao;
	}
	public String getComplicacoes() {
		return complicacoes;
	}
	public void setComplicacoes(String complicacoes) {
		this.complicacoes = complicacoes;
	}

	
	
}
