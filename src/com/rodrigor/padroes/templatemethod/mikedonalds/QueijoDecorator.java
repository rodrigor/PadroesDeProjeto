/**
 * Autor: Rodrigo Rebouças de Almeida
 * http://www.rodrigor.com
 * (cc)Creative Commons 2009
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


package com.rodrigor.padroes.templatemethod.mikedonalds;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class QueijoDecorator implements Receita {

	/**
	 * @param presuntoDecorator
	 */
	public QueijoDecorator(PresuntoDecorator presuntoDecorator) {
		// TODO Auto-generated constructor stub
	}


	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.templatemethod.mikedonalds.Receita#esquentar()
	 */
	public void esquentar() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.templatemethod.mikedonalds.Receita#montarSanduiche()
	 */
	public String montarSanduiche() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.templatemethod.mikedonalds.Receita#selecionarIngredientes()
	 */
	public String selecionarIngredientes() {
		// TODO Auto-generated method stub
		return null;
	}

}
