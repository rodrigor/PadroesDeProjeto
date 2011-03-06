/**
 * Autor: Rodrigo Rebouças de Almeida
 * http://www.rodrigor.com
 * (cc)Creative Commons 2010
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


package com.rodrigor.padroes.facade.hometheater;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class HomeTheater implements EquipamentoDeSom {
	
	private boolean ligado;
	private int volume;
	private int volumeMaximo;
	
	public HomeTheater(){
		this.ligado = false;
		this.volume = 0;
		this.volumeMaximo = 100;
	}
	
	public void ligarCaixasDeSom(){
		this.ligado = true;
	}
	
	public void desligarCaixasDeSom(){
		this.ligado = false;
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.facade.hometheater.EquipamentoDeSom#emitirSom(com.rodrigor.padroes.facade.hometheater.FonteDeSom)
	 */
	public void emitirSom(FonteDeSom som) {
		System.out.println("Emitindo som a partir do Home Theater. Volume: "+this.volume);
		som.gerarSom();

	}

	/**
	 * @param volume
	 */
	public void setVolume(int volume) {
		this.volume = volume;
		
	}

	public int getVolumeMaximo(){
		return this.volumeMaximo;
		
	}
	
	public int getVolume(){
		return this.volume;
	}
	
	public void aumentarVolume(){
		if(volume != volumeMaximo)	volume++;
	}
	
	public void diminuirVolume(){
		if(volume > 0)	volume--;
	}
}
