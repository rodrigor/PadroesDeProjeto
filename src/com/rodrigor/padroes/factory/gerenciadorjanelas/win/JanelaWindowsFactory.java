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


package com.rodrigor.padroes.factory.gerenciadorjanelas.win;

import com.rodrigor.padroes.factory.gerenciadorjanelas.BarraMenu;
import com.rodrigor.padroes.factory.gerenciadorjanelas.BarraTitulo;
import com.rodrigor.padroes.factory.gerenciadorjanelas.ItemMenu;
import com.rodrigor.padroes.factory.gerenciadorjanelas.Janela;
import com.rodrigor.padroes.factory.gerenciadorjanelas.JanelaFactory;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class JanelaWindowsFactory implements JanelaFactory {

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.factory.gerenciadorjanelas.JanelaFactory#criarBarraDeTitulo()
	 */
	public BarraTitulo criarBarraDeTitulo() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.factory.gerenciadorjanelas.JanelaFactory#criarBarraMenu()
	 */
	public BarraMenu criarBarraMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.factory.gerenciadorjanelas.JanelaFactory#criarItemMenu(java.lang.String)
	 */
	public ItemMenu criarItemMenu(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.factory.gerenciadorjanelas.JanelaFactory#criarJanela()
	 */
	public Janela criarJanela() {
		// TODO Auto-generated method stub
		return null;
	}

}
