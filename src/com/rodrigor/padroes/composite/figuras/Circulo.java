package com.rodrigor.padroes.composite.figuras;

import java.awt.Graphics;

public class Circulo extends FiguraComposta{
	
	private Posicao posicao;
	private int diametro;

	public Circulo(String nome,Posicao posicao,int diametro) {
		super(nome);
		this.posicao = posicao;
		this.diametro = diametro;
	}

	@Override
	public Posicao getPosicao() {
		// TODO Auto-generated method stub
		return null;
	}

	public void desenhar(Graphics g, Posicao abs) {
		Posicao n = new Posicao(posicao.x+abs.x,posicao.y+abs.y);
		g.drawOval(n.x, n.y, diametro, diametro);
		super.desenhar(g,n);
	}


}
