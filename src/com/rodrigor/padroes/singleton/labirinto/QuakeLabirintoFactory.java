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

package com.rodrigor.padroes.singleton.labirinto;

import com.rodrigor.padroes.factory.jogolabirinto.quake.*;
import com.rodrigor.padroes.factory.jogolabirinto.*;

public class QuakeLabirintoFactory implements LabirintoFactory{

	
	private static QuakeLabirintoFactory singleton = null;
	
	private QuakeLabirintoFactory(){}
	
	public static QuakeLabirintoFactory getInstance(){
		if(singleton == null)
			synchronized(QuakeLabirintoFactory.class){
				if(singleton == null)
					singleton = new QuakeLabirintoFactory();
			}
		return singleton;
	}
	public Parede criaParede() {
		return new ParedeQuake();
	}

	public Porta criaPorta() {
		return new PortaQuake();
	}

	public Sala criaSala() {
		return new SalaQuake();
	}

}
