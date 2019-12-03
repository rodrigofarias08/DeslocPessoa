package br.edu.senai.modelos;

public abstract class Quadrilatero {
	
	private int tamanhoX;
	private int tamanhoY;
	
	
	public Quadrilatero() {
		super();
	}


	public Quadrilatero(int tamanhoX, int tamanhoY) {
		super();
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
	}


	public int getTamanhoX() {
		return tamanhoX;
	}


	public void setTamanhoX(int tamanhoX) {
		this.tamanhoX = tamanhoX;
	}


	public int getTamanhoY() {
		return tamanhoY;
	}


	public void setTamanhoY(int tamanhoY) {
		this.tamanhoY = tamanhoY;
	}


}
