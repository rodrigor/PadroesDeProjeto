package com.rodrigor.padroes.composite.figuras;

import java.awt.Color;
import java.awt.Graphics;

public class Triangulo extends FiguraComposta {
	
	private Posicao topo,esq,dir;

	public Triangulo(String nome, Posicao topo, Posicao esq, Posicao dir) {
		super(nome);
		this.topo = topo;
		this.esq = esq;
		this.dir = dir;
	}
	
	public Posicao getPosicao(){
		return new Posicao(topo.x,esq.y);
	}
	

	public void desenhar(Graphics g, Posicao abs){
		g.setColor(Color.red);
		g.drawLine(abs.x+topo.x, abs.y+topo.y, abs.x+esq.x, abs.y+esq.y);
		g.drawLine(abs.x+topo.x, abs.y+topo.y, abs.x+dir.x,abs.y+dir.y);
		g.drawLine(abs.x+esq.x,abs.y+esq.y,abs.x+dir.x,abs.y+dir.y);

		super.desenhar(g,abs);
	}
	
	
}
