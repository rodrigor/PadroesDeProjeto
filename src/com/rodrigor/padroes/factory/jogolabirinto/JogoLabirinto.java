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

package com.rodrigor.padroes.factory.jogolabirinto;

public class JogoLabirinto {

	public Sala montaLabirinto(LabirintoFactory factory) {

		Sala s1 = montaSala(factory);
		Sala s2 = montaSala(factory);

		Parede paredeComum = factory.criaParede();
		paredeComum.setPorta(factory.criaPorta());

		s1.setParede(Sala.LESTE, paredeComum);
		s2.setParede(Sala.OESTE, paredeComum);

		return s1;

	}

	private Sala montaSala(LabirintoFactory factory) {
		Sala s = factory.criaSala();
		s.addParede(factory.criaParede());
		s.addParede(factory.criaParede());
		s.addParede(factory.criaParede());
		s.addParede(factory.criaParede());
		return s;

	}

}
