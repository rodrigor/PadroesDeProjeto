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

import java.util.Set;
import java.util.TreeSet;

public class Cafeteria {
	
	public Set<Bebida> bebidas;
	
	public Cafeteria(){
		this.bebidas = new TreeSet<Bebida>(new BebidaPrecoComparator());
	}
	
	public void addBebida(Bebida bebida){
		bebidas.add(bebida);
	}
	
	public String criarMenu(){
		StringBuffer menu = new StringBuffer();
		menu.append("/--------------------- M E N U -----------------------------\\\n");
		for(Bebida bebida: bebidas){
			menu.append("- "+bebida.getDescricao()+"\t\t\t\tR$ "+bebida.getPreco()+"\n");
		}
		menu.append("/-----------------------------------------------------------\\\n");
		return menu.toString();
	}

}
