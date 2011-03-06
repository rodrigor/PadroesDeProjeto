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

public class HomeTheaterFacade {
	private DVDPlayer dvdplayer;
	private Televisao tv;
	private HomeTheater homet;
	private Projetor projetor;
	
	public HomeTheaterFacade(){		
		dvdplayer = new DVDPlayer();
		tv = new Televisao();
		homet = new HomeTheater();
		projetor = new Projetor();
	}
	
	public void ligarSistema(DVD dvd){
		dvdplayer.setOutput(projetor, homet);
		tv.desligar();
		dvdplayer.ligar();
		projetor.ligar();
		homet.ligarCaixasDeSom();
		homet.setVolume(90);
		dvdplayer.inserirDVD(dvd);
	}
	
	public void desligarSistema(){
		dvdplayer.ejetarDVD();
		dvdplayer.setOutput(tv, tv);
		dvdplayer.desligar();
		projetor.desligar();
		homet.setVolume(0);
		homet.desligarCaixasDeSom();
	}
	
	public void aumentarVolume(){
		homet.aumentarVolume();
	}
	
	public void diminuirVolume(){
		homet.diminuirVolume();
	}
	
	public void play(){
		dvdplayer.play();
	}
	
	public void pause(){
		dvdplayer.pause();
	}
	
	public void stop(){
		dvdplayer.stop();
	}

}
