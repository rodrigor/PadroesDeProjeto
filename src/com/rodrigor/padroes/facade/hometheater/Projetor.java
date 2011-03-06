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
public class Projetor implements EquipamentoDeExibicao {
	
	private boolean ligado;
	
	public Projetor(){
		this.ligado = false;
	}

	public void ligar(){
		this.ligado = true;
	}
	
	public void desligar(){
		this.ligado = false;
	}
	
	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.facade.hometheater.EquipamentoDeExibicao#exibirImagem(com.rodrigor.padroes.facade.hometheater.FonteDeImagem)
	 */
	public void exibirImagem(FonteDeImagem fonte) {
		System.out.println("Projetor exibindo imagem:");
		fonte.gerarImagem();

	}

}
