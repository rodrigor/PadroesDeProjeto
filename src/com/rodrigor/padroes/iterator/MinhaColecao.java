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

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class MinhaColecao {
	
	protected String[] array;
	private final int TAMANHO = 10;
	private int quantElementos = 0;
	
	public MinhaColecao(){
		this.array = new String[TAMANHO];
	}
	
	public Iterador getIterador(){
		return new IteradorArray(this);
	}
	
	public int getTamanho(){
		return quantElementos;
	}

	/**
	 * @param string
	 */
	public void add(String string) {
		if(quantElementos >= TAMANHO) throw new ArrayIndexOutOfBoundsException("Colecao cheia!");
		this.array[quantElementos++] = string;
	}

}
