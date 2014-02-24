package com.rodrigor.padroes.composite.figuras;

import java.awt.Graphics;

public interface FiguraGeometrica {

	public Posicao getPosicao();	
	
	public void desenhar(Graphics g, Posicao posPainel);
}
