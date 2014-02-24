package com.rodrigor.padroes.composite.figuras;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exemplo  extends Frame {
	
	private FiguraGeometrica base;
	
	public static void main(String args[]) {
		new Exemplo();
	}

	public Exemplo() {
		super("Exemplo Composite");

		setSize(800, 600);

		setVisible(true);

		
		Retangulo retangulo = new Retangulo("q1", new Posicao(30,30), 150,200);
		
		
		Circulo circulo = new Circulo("circulo",new Posicao(10,10),80);
		Circulo circulo2 = new Circulo("c2",new Posicao(10,90),60);
		
		retangulo.add(circulo);
		retangulo.add(circulo2);

		Triangulo triangulo = new Triangulo("t10", new Posicao(40,0), new Posicao(0,40), new Posicao(80,40));

		circulo.add(triangulo);
		
		Reta reta = new Reta("reta",new Posicao(25,25),new Posicao(25,35));
		
		triangulo.add(reta);
		base = retangulo;
				
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}


	public void paint(Graphics g) {

		
		base.desenhar(g,new Posicao(0,0));
	}
	

}
