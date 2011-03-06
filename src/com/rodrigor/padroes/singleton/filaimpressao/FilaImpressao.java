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

package com.rodrigor.padroes.singleton.filaimpressao;

import java.util.LinkedList;
import java.util.Queue;

public class FilaImpressao {
	
	private Queue<Documento> fila;
	
	private static FilaImpressao singleton = null;
	
	private FilaImpressao(){
		fila = new LinkedList<Documento>();
		
	}
	
	public static FilaImpressao getInstance(){
		if(singleton == null)
			synchronized(FilaImpressao.class){
				if(singleton == null)
					singleton = new FilaImpressao();
			}
		return singleton;
	}
	
	public void imprimir(Documento documento){
		this.fila.add(documento);
	}

}
