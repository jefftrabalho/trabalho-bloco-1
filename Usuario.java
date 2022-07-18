package br.com.gen.projeto;

public class Usuario extends Pessoa{
	
	
 	private String tipoAnimal;
    private String localSeguro;
    
   
	public Usuario(String nome, String tipoAnimal, String localSeguro) {
		super(nome);
		this.tipoAnimal = tipoAnimal;
		this.localSeguro = localSeguro;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getLocalSeguro() {
		return localSeguro;
	}

	public void setLocalSeguro(String localSeguro) {
		this.localSeguro = localSeguro;
	}
 	
	
}