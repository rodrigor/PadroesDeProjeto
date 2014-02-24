package com.rodrigor.padroes.composite.figuras;

import java.awt.Graphics;
import java.util.LinkedList;
import java.util.List;

public abstract class FiguraComposta implements FiguraGeometrica {
	
	protected String nome;
	protected List<FiguraGeometrica> figuras;
	
	public FiguraComposta(String nome){
		this.figuras = new LinkedList<FiguraGeometrica>();
		this.nome = nome;
	}

	
	public void add(FiguraGeometrica figura){
		this.figuras.add(figura);
	}

	@Override
	public void desenhar(Graphics g, Posicao posPainel) {
		for(FiguraGeometrica fig: figuras)
			fig.desenhar(g,posPainel);

	}

}






