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
public class Exemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinhaColecao colecao = new MinhaColecao();
		
		colecao.add("Rodrigo");
		colecao.add("Ayla");
		colecao.add("Jose");
		
		Iterador it = colecao.getIterador();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}
