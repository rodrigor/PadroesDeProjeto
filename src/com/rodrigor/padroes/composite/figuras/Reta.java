package com.rodrigor.padroes.composite.figuras;

import java.awt.Graphics;

public class Reta implements FiguraGeometrica{
	
	private String nome;
	private Posicao inicio,fim;
	
	public Reta(String nome, Posicao inicio, Posicao fim){
		this.nome = nome;
		this.inicio = inicio;
		this.fim = fim;
		
	}

	@Override
	public Posicao getPosicao() {
		Posicao posicao = new Posicao();
		if(inicio.x < fim.x)
			posicao.x = inicio.x;
		else posicao.x = fim.x;
		
		if(inicio.y < fim.y)
			posicao.y = inicio.y;
		else posicao.y = fim.y;
		return posicao;
			
	}

	@Override
	public void desenhar(Graphics g, Posicao abs) {
		g.drawLine(inicio.x+abs.x,inicio.y+abs.y,fim.x+abs.x, fim.y+abs.y);
		
	}

}
