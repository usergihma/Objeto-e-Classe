package aula21_08;

import Objetoeclasse.Cliente;

public class ObjetoUsuario {

	public static void main(String[] args) {
		Usuario usuario1 = new Usuario();//contrua para mim a partir da Classe Aviao. o objrto aviao 1
		Usuario usuario2 = new Usuario();

		//OBJETO 1
		System.out.println("----------------Usuário 1----------------"); //Chamando o método set para adicionar os objetos
		usuario1.setNome("Giovanna");//inserir
		usuario1.setPermissao("Gerenciar");
		usuario1.setUsuario("Adm");
		usuario1.setPassword(5556667);
		usuario1.setId(12345);

		//Chamando o método get() para apresentar os objetos

		System.out.println(usuario1.getNome());
		System.out.println(usuario1.getPermissao());
		System.out.println(usuario1.getUsuario());
		System.out.println(usuario1.getPassword());
		System.out.println(usuario1.getId());
		System.out.println(usuario1.logar());

		//OBJETO 2
		System.out.println("----------------Usuário 2----------------");
		usuario2.setNome("Giulia");//inserir
		usuario2.setPermissao("Editar");
		usuario2.setUsuario("Usuário");
		usuario2.setPassword(9900011);
		usuario2.setId(1234);

		System.out.println(usuario2.getNome());
		System.out.println(usuario2.getPermissao());
		System.out.println(usuario2.getUsuario());
		System.out.println(usuario2.getPassword());
		System.out.println(usuario2.getId());
		System.out.println(usuario2.excluir());
	}

}
