package aula21_08;

public class Computador {
	String marca;
	String cor;
	String modelo;
	String material;
	
	public String getMarca() { //com retorno
		return marca;

	}
	public void setMarca(String marca) {  //sem retorno
		this.marca = marca;  //Atribui este a String nome
	}
	public String getCor() { 
		return cor;

	}
	public void setCor(String cor) {  
		this.cor = cor; 
	}
	public String getModelo() { 
		return modelo;

	}
	public void setModelo(String modelo) {  
		this.modelo = modelo;  
	}
	public String getMaterial() { 
		return material;

	}
	public void setMaterial(String material) {  
		this.material = material;  
	}
	public String ligar() {
		return "Ligando";
	}
	public String desligar() {
		return "Desligando";
	}
	public String carregar() {
		return "Carregando";
	}
	public String reiniciar() {
		return "Reiniciando";
	}

}
