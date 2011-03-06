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


package com.rodrigor.padroes.factory.gerenciadorjanelas;

import com.rodrigor.padroes.factory.gerenciadorjanelas.linux.JanelaLinuxFactory;
import com.rodrigor.padroes.factory.gerenciadorjanelas.win.JanelaWindowsFactory;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class GerenciadorDeJanelas {
	
	public Janela criarJanela(JanelaFactory factory){
		Janela janela = factory.criarJanela();
		janela.add(factory.criarBarraDeTitulo());
		BarraMenu menu = factory.criarBarraMenu();
		menu.add(factory.criarItemMenu("Arquivo"));
		menu.add(factory.criarItemMenu("Editar"));
		janela.add(menu);
		return janela;
	}
	
	public static void main(String[] args) {
		
		GerenciadorDeJanelas gerente = new GerenciadorDeJanelas();
		Janela principalWindows = gerente.criarJanela(new JanelaWindowsFactory());
		Janela principalLinux = gerente.criarJanela(new JanelaLinuxFactory());
		
		
	}

}
