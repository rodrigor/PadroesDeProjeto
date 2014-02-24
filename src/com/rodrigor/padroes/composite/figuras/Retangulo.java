package com.rodrigor.padroes.composite.figuras;

import java.awt.Color;
import java.awt.Graphics;

public class Retangulo extends FiguraComposta {

	
	private int larg,alt;
	private Posicao posicao;
	
	public Retangulo(String nome, Posicao pos, int larg, int alt) {
		super(nome);
		this.posicao = pos;
		this.larg = larg;
		this.alt = alt;
	}

	@Override
	public Posicao getPosicao() {
		return posicao;
	}

	public void desenhar(Graphics g, Posicao posPainel) {
		Posicao abs = new Posicao(posPainel.x+posicao.x,posPainel.y+posicao.y);
		g.setColor(Color.red);
		g.drawRect(abs.x, abs.y, larg, alt);
		super.desenhar(g, abs);
	}
}
