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
public class Televisao implements FonteDeImagem, FonteDeSom, EquipamentoDeExibicao, EquipamentoDeSom {

	private int volume;
	private int volumeMaximo;

	private boolean ligado;
	
	
	public Televisao(){
		volume = 0;
		volumeMaximo = 100;
		ligado = false;
	}
	
	public void ligar(){
		this.ligado = true;
	}
	
	public void desligar(){
		this.ligado = false;
	}
	
	public void setVolume(int volume){
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
	
	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.facade.hometheater.FonteDeImagem#gerarImagem()
	 */
	public void gerarImagem() {
		System.out.println("Imagem da Televisao");

	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.facade.hometheater.FonteDeSom#gerarSom()
	 */
	public void gerarSom() {
		System.out.println("Som da Televisão no volume"+volume );
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.facade.hometheater.EquipamentoDeExibicao#exibirImagem(com.rodrigor.padroes.facade.hometheater.FonteDeImagem)
	 */
	public void exibirImagem(FonteDeImagem fonte) {
		System.out.println("Exibindo imagem na Televisão");
		fonte.gerarImagem();
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.facade.hometheater.EquipamentoDeSom#emitirSom(com.rodrigor.padroes.facade.hometheater.FonteDeSom)
	 */
	public void emitirSom(FonteDeSom som) {
		System.out.println("Emitindo som na televisão");
		som.gerarSom();
		
	}

}
