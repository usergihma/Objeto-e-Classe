package aula21_08;

public class Fornecedor {
	int id;
	String razaoSocial;  
	String nomeFantasia;
	String cnpj;
	String endereço;
	String fone;
	String email;
	String inscricaoEstadual;
	
	public String getRazaoSocial() { //com retorno
		return razaoSocial;

	}
	public void setRazaoSocial(String razaoSocial) {  //sem retorno
		this.razaoSocial = razaoSocial;  //Atribui este a String nome
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj (String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
	this.endereço = endereço;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
	this.fone = fone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
	this.inscricaoEstadual = inscricaoEstadual;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String cadastrar() {
		return "Cadastrando";
	}
	public String logar() {
		return "Logando";
	}
	public String excluir() {
		return "Excluindo a conta";
	}
	public String editar() {
		return "Editando";
	}



}
