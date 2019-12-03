package br.edu.senai.modelos;

public class Pessoa extends Volume implements PessoaInterface {

	private String nome;

	public Pessoa() {
		super();
	}


	public Pessoa(int tamanhoX, int tamanhoY, int posX, int posY, String nome) {
		super(tamanhoX, tamanhoY, posX, posY);
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Métodos criados:

	// Método definido pela interface PessoaInterface;

	public void deslocar(int deslocX, int deslocY) {

		int testX = this.getPosX() + deslocX;
		int testY = this.getPosY() + deslocY;

		if (this.verificarMovValido(testX, testY)) {
			this.setPosX(this.getPosX() + deslocX);
			this.setPosY(this.getPosY() + deslocY);

		} else {
			System.out.println("Movimento inválido. Não é possível se deslocar para fora do ambiente.");
		}

	}

	private boolean verificarMovValido(int testX, int testY) {

		if ((0 <= testX) && (testX <= Volume.getAmb1().getTamanhoX())) {
			if ((0 <= testY) && (testY <= Volume.getAmb1().getTamanhoY())) {
				return true;
			}
		}
		return false;
	}

}
