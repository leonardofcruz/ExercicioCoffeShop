package br.com.fametro.Cafeteria;

import br.com.fametro.classes.*;

public class Cafeteria {
	
	public static void main(String args[]) {
		
		Bebida bebida = new Expresso();		
		//bebida.setDescription("Bebida 1");
		System.out.println(bebida.getDescription() + " R$ " + bebida.cost());
		
		Bebida bebida2 = new Expresso();
		//expresso.setDescription("Bedida 2");
		bebida2 = new Leite(bebida2);
		bebida2 = new Leite(bebida2);
		bebida2 = new Creme(bebida2);
		System.out.println(bebida2.getDescription() + " R$ " + bebida2.cost());
		
		Bebida bebida3 = new Carioca();
		bebida3 = new Leite(bebida3);
		bebida3 = new Creme(bebida3);
		bebida3 = new Soja(bebida3);
		bebida3 = new Leite(bebida3);
		System.out.println(bebida3.getDescription() + " R$ " + bebida3.cost());
		
	}
}
