package org.catolicasc.beer.dao;

import java.util.ArrayList;
import java.util.List;

import org.catolicasc.beer.model.Beer;


public class BeerDao {

	private static List<Beer> Beers = new ArrayList<Beer>();
	
	static {
		Beer b1 = new Beer();
		b1.setNome("Mirinda");
		b1.setDescri��o("A melhor laranjinha do Brasil");
		b1.setUnidademedida("Litros");
		b1.setVolume("LT");
		b1.setQuantidade(4);
		b1.setPre�o(1);		
		Beers.add(b1);
		
		Beer b2 = new Beer();
		b2.setNome("Guaran�");
		b2.setDescri��o("Melhor que Dolly");
		b2.setUnidademedida("Litros");
		b2.setVolume("LT");
		b2.setQuantidade(4);
		b2.setPre�o(1);		
		Beers.add(b2);
		
		Beer b3 = new Beer();
		b3.setNome("Guaran�");
		b3.setDescri��o("Melhor que Dolly");
		b3.setUnidademedida("Litros");
		b3.setVolume("LT");
		b3.setQuantidade(4);
		b3.setPre�o(1);		
		Beers.add(b3);
	}
	
	public List<Beer> obterBeers() {							
		return Beers;
	}
	
	public void criarBeer(Beer beer) {
		Beers.add(beer);
	}
}
