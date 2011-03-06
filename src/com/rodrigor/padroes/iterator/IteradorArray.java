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


package com.rodrigor.padroes.iterator;

import com.rodrigor.padroes.composite.rede.OperacaoInvalidaException;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class IteradorArray implements Iterador{

	private int posicao = 0;
	private MinhaColecao colecao;
	
	public IteradorArray(MinhaColecao array){
		this.colecao = array;
	}
	
	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.iterator.Iterador#hasNext()
	 */
	public boolean hasNext() {
		return posicao < colecao.getTamanho();
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.iterator.Iterador#next()
	 */
	public String next() {
		if(!hasNext()) throw new OperacaoInvalidaException();
		return colecao.array[posicao++];
	}

}
