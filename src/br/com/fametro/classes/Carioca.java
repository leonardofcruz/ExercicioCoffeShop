package br.com.fametro.classes;

public class Carioca extends Bebida {

	public Carioca() {
		super.description = "Carioca";
	}
	
	@Override
	public double cost() {
		return 2.50;
	}

	
}
