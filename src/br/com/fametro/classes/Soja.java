package br.com.fametro.classes;

public class Soja extends CondimentoDecorador {

	Bebida bebida;
	
	public Soja(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescription() {
		
		return bebida.getDescription() + ", Soja";
	}

	@Override
	public double cost() {
		return bebida.cost() + 0.90;
	}

}
