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
package com.rodrigor.padroes.strategy.formulario;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class ValidadorNumerico implements Validador {

	/* (non-Javadoc)
	 * @see com.rodrigor.padroes.strategy.formulario.Validador#validarString(java.lang.String)
	 */
	public boolean validarString(String str) {
		try{
			Integer.parseInt(str);
		}catch(NumberFormatException e){
			return false;
		}
		return true;
	}

}
