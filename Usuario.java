package aula21_08;

public class Usuario {
	String nome;  //Criando variaveis
	String permissao;
	int password;
	String usuario;
	int id;

	public String getNome() { //com retorno
		return nome;

	}
	public void setNome(String nome) {  //sem retorno
		this.nome = nome;  //Atribui este a String nome
	}

	public String getPermissao() {
		return permissao;
	}
	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword (int password) {
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
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