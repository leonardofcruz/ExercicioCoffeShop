package br.com.fametro.classes;

public abstract class Bebida {
	
	String description = "Bebida indefinida";
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String descricao) {
		description = descricao;
	}
	
	public abstract double cost();
}
