package br.edu.senai.modelos;

public class Ambiente extends Quadrilatero implements AmbienteInterface {

	public Ambiente() {
		super();
	}

	public Ambiente(int tamanhoX, int tamanhoY) {
		super(tamanhoX, tamanhoY);
	}

	public int calcularArea() {
		
		return (this.getTamanhoX() * this.getTamanhoY());
	}
	

}
