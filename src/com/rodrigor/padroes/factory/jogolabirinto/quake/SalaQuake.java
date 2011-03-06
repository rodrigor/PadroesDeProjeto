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

package com.rodrigor.padroes.factory.jogolabirinto.quake;

import com.rodrigor.padroes.factory.jogolabirinto.Parede;
import com.rodrigor.padroes.factory.jogolabirinto.Sala;

public class SalaQuake implements Sala {
	
	private ParedeQuake[] paredes;
	private static final int QUANTIDADE_PAREDES = 4;
	private int paredeAtual;
	
	public SalaQuake() {
		paredes = new ParedeQuake[QUANTIDADE_PAREDES];
		paredeAtual = NORTE;
	}

	public void addParede(Parede parede) {
		paredes[paredeAtual++] = (ParedeQuake)parede;
		if(paredeAtual == QUANTIDADE_PAREDES) paredeAtual = NORTE;
	}
	
	public void setParede(int posicao, Parede parede){
		if(posicao < 0 || posicao >= QUANTIDADE_PAREDES) throw new RuntimeException("Posi��o Inv�lida!");
		paredes[posicao] = (ParedeQuake)parede;
	}
	

}
