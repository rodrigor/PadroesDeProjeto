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

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class ReceitaFactory {

	
	private static ReceitaFactory singleton;
	
	private ReceitaFactory(){};
	/**
	 * @return
	 */
	public static ReceitaFactory getInstance() {
		if(singleton == null){
			synchronized (ReceitaFactory.class) {
				if(singleton == null){
					synchronized (ReceitaFactory.class) {
						singleton = new ReceitaFactory();
					}
				}
			}
			
		}
		return singleton;
	}
	/**
	 * @param string
	 * @return
	 */
	public Receita criaReceita(String nome) {
		if(nome.equals("misto")){
			return new QueijoDecorator(new PresuntoDecorator(new PaoCaixa()));
		}
		throw new RuntimeException("Não existe sanduiche com o nome "+nome);
	}
	

}
