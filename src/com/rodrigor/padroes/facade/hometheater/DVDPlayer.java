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

package com.rodrigor.padroes.facade.hometheater;

public class DVDPlayer implements FonteDeSom, FonteDeImagem{
	
	private boolean ligado;
	private DVD dvd;
	

	private EquipamentoDeExibicao video;

	private EquipamentoDeSom audio;
	
	
	public DVDPlayer(){
		ligado = false;
	}
	
	public void inserirDVD(DVD dvd){
		this.dvd = dvd;
	}

	public void ligar() {
		ligado = true;
		
	}
	
	public void desligar(){
		ligado = false;
	}

	public boolean ligado() {
		return ligado;
	}

	
	public void play(){
		this.video.exibirImagem(this);
		this.audio.emitirSom(this);
	}
	
	public void pause(){
		System.out.println("DVD Player PAUSE");
	}
	
	public void stop(){
		System.out.println("DVD Player STOP");		
	}
	
	public void ejetarDVD(){
		this.dvd = null;
	}

	public void setOutput(EquipamentoDeExibicao video, EquipamentoDeSom audio){
		this.video = video;
		this.audio = audio;
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.facade.hometheater.FonteDeSom#gerarSom()
	 */
	public void gerarSom() {
		System.out.println("Som do filme: "+this.dvd.getTitulo());
		
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.facade.hometheater.FonteDeImagem#gerarImagem()
	 */
	public void gerarImagem() {
		System.out.println("Imagem do filme: "+this.dvd.getTitulo());		
	}
	

}
