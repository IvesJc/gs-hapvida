package br.com.hapvida.beans;

public class RedeCredenciada {

	private int codigo; 
	private String nome;
	private String razaoSocial;
	private String cnpj;
	private int cnes;
	private String localizacao;
	private String cidade;
	private String uf;
	public RedeCredenciada() {
		super();
	}
	public RedeCredenciada(int codigo, String nome, String razaoSocial, String cnpj, int cnes, String localizacao,
			String cidade, String uf) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.cnes = cnes;
		this.localizacao = localizacao;
		this.cidade = cidade;
		this.uf = uf;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getCnes() {
		return cnes;
	}
	public void setCnes(int cnes) {
		this.cnes = cnes;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
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

	
	
}
