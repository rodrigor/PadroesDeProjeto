/**
 * Autor: Rodrigo Rebouças de Almeida
 * http://www.rodrigor.com
 * (cc)Creative Commons 2008
 *
 * Este trabalho está licenciado sob uma Licença 
 * Creative Commons Atribuição-Uso Não-Comercial-Compartilhamento 
 * pela mesma Licença 2.5 Brasil. 
 * Para ver uma cópia desta licença, visite 
 * http://creativecommons.org/licenses/by-nc-sa/2.5/br/ 
 * ou envie uma carta para Creative Commons, 
 * 171 Second Street, Suite 300, 
 * San Francisco, California 94105, USA.
 */


package com.rodrigor.padroes.composite.rede.gui;

import com.rodrigor.padroes.composite.rede.Posicao;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class Painel {
	private int x,y;
	
	public Painel(int x, int y){
		setTamanho(x,y);
	}
	
	public void setTamanho(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void desenhar(ComponenteGrafico componente, Posicao posicao){
		// codigo que desenha o componente no Painel Gráfico
	}

}
