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

package com.rodrigor.padroes.decorator.bebida;

import java.util.Comparator;

public class BebidaDescricaoComparator implements Comparator<Bebida> {


	public int compare(Bebida b1, Bebida b2) {
		return b1.getDescricao().compareTo(b2.getDescricao());
	}

}
