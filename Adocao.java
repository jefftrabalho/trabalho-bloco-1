package br.com.gen.projeto;

public class Adocao extends Pessoa {
	
	private int moradia; // moradia 1 - apartamento , moradia 2 -casa
	private String filhoteAdulto[] = {"filhote", "adulto"};
	private String tipoDoAnimal[] = {"cachorro", "gato"};
	private int filhoteAd;
	private int tipoAn;
	
	
	public Adocao(String nome, int moradia, int filhoteAd, int tipoAn) {
		super(nome);
		this.moradia = moradia;
		this.filhoteAd = (filhoteAd-1);
		this.tipoAn = (tipoAn-1);
	}


	public String tipoAnimalMoradia(int moradia, int filhoteAdulto, int tipoDoAnimal) {
		this.moradia = moradia;
		return "Seu animal ideal e " + this.tipoDoAnimal[(tipoDoAnimal -1)] + " " + this.filhoteAdulto[(filhoteAdulto - 1)] + ".";
	}
	
	
	public int getMoradia() {
		return moradia;
	}
	public void setMoradia(int moradia) {
		this.moradia = moradia;
	}

	public String[] getFilhoteAdulto() {
		return filhoteAdulto;
	}

	public void setFilhoteAdulto(String[] filhoteAdulto) {
		this.filhoteAdulto = filhoteAdulto;
	}

	public String[] getTipoDoAnimal() {
		return tipoDoAnimal;
	}

	public void setTipoDoAnimal(String[] tipoDoAnimal) {
		this.tipoDoAnimal = tipoDoAnimal;
	}
	public int getFilhoteAd() {
		return filhoteAd;
	}


	public void setFilhoteAd(int filhoteAd) {
		this.filhoteAd = filhoteAd;
	}


	public int getTipoAn() {
		return tipoAn;
	}


	public void setTipoAn(int tipoAn) {
		this.tipoAn = tipoAn;
	}

	
}
