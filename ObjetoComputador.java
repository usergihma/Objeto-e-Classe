package aula21_08;

public class ObjetoComputador {

	public static void main(String[] args) {
		Computador computador1 = new Computador();//contrua para mim a partir da Classe Aviao. o objrto aviao 1
		Computador computador2 = new Computador();

		//OBJETO 1
		System.out.println("----------------Computador 1:----------------"); //Chamando o método set() para adicionar os objetos
		computador1.setMarca("Dell");//inserir
		computador1.setCor("Prata");
		computador1.setModelo("Opti Plex");
		computador1.setMaterial("Aluminio");

		//Chamando o método get() para apresentar os objetos

		System.out.println(computador1.getMarca());
		System.out.println(computador1.getCor());
		System.out.println(computador1.getModelo());
		System.out.println(computador1.getMaterial());
		System.out.println(computador1.ligar());
		
		//OBJETO 2
				System.out.println("----------------Computador 2:----------------"); //Chamando o método set() para adicionar os objetos
				computador1.setMarca("Apple");//inserir
				computador1.setCor("Prata");
				computador1.setModelo("MacBook");
				computador1.setMaterial("Aluminio");

				//Chamando o método get() para apresentar os objetos

				System.out.println(computador1.getMarca());
				System.out.println(computador1.getCor());
				System.out.println(computador1.getModelo());
				System.out.println(computador1.getMaterial());
				System.out.println(computador1.reiniciar());


	}

}
