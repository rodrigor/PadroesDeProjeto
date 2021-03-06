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

import com.rodrigor.padroes.composite.rede.gui.Painel;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class Roteador extends ElementoComposto {
	
	private int quantPortas;
	
	public Roteador(int quantidadePortas){
		this.quantPortas = quantidadePortas;
	}
	
	public void addElemento(ElementoDeRede elemento){
		if( this.elementos.size() >= this.quantPortas)
			throw new ElementoDeRedeException("Roteador não tem portas livres");
		super.addElemento(elemento);
	}
	
	public void desenhar(Painel painel){
		painel.desenhar(this, Posicao.somar(this.pai.posicao, this.posicao));	
		super.desenhar(painel);
	}

}
