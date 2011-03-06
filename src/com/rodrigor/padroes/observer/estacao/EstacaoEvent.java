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


package com.rodrigor.padroes.observer.estacao;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class EstacaoEvent {
	
	private EstacaoMeteorologica fonte;
	private int temperatura;

	/**
	 * @param estacaoMeteorologica
	 * @param temperatura
	 */
	public EstacaoEvent(EstacaoMeteorologica estacaoMeteorologica,
			int temperatura) {
		this.fonte = estacaoMeteorologica;
		this.temperatura = temperatura;
	}

	/**
	 * @return the fonte
	 */
	public EstacaoMeteorologica getFonte() {
		return fonte;
	}

	/**
	 * @param fonte the fonte to set
	 */
	public void setFonte(EstacaoMeteorologica fonte) {
		this.fonte = fonte;
	}

	/**
	 * @return the temperatura
	 */
	public int getTemperatura() {
		return temperatura;
	}

	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	

}
