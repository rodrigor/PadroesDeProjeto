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


package com.rodrigor.padroes.templatemethod.mikedonalds;

import com.rodrigor.padroes.composite.rede.OperacaoInvalidaException;


/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class PresuntoDecorator extends ReceitaSanduicheDecorator {

	/**
	 * @param receita
	 */
	public PresuntoDecorator(ReceitaSanduiche receita) {
		super(receita);
		// TODO Auto-generated constructor stub
	}
	
	public void esquentar() {
		filho.esquentar();
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.templatemethod.mikedonalds.Receita#montarSanduiche()
	 */
	public String montarSanduiche() {
		return "[Presunto"+filho.montarSanduiche()+"]";
	}

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.templatemethod.mikedonalds.Receita#selecionarIngredientes()
	 */
	public String selecionarIngredientes() {
		return "presunto, "+ filho.selecionarIngredientes();
	}

}
