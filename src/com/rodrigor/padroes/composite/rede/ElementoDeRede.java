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


package com.rodrigor.padroes.composite.rede;

import com.rodrigor.padroes.composite.rede.gui.ComponenteGrafico;
import com.rodrigor.padroes.composite.rede.gui.Painel;


public class ElementoDeRede implements ComponenteGrafico {
	
	protected int x,y;
	protected Posicao posicao;
	
	protected ElementoDeRede pai;


	public void setTamanho(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setPai(ElementoDeRede pai){
		this.pai = pai;
	}
	
	public void setPosicao(Posicao posicao){
		this.posicao = posicao;
	}
	
	public void addElemento(ElementoDeRede elemento){
		throw new OperacaoInvalidaException();		
	}
	
	public void desenhar(Painel painel){
		throw new OperacaoInvalidaException();		
	}
	
}
