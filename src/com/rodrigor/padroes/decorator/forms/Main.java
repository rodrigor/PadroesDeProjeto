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


package com.rodrigor.padroes.decorator.forms;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		// Criando o formulário
		Formulario form = new Formulario();
		form.addCampo(new Campo("nome","Nome",new ValidadorTexto(30)));
		form.addCampo(new Campo("email","E-mail", new ValidadorEmail()));
		form.addCampo(new Campo("idade","Idade",new ValidadorNumerico()));
		form.addCampo(new Campo("senha","Senha",new ValidadorSenha(6, 8)));
		
		// Definindo os valores dos campos
		form.setValor("nome","Rodrigo R.");
		form.setValor("email","rodrigor@rodrigor.com");
		form.setValor("idade","30");
		form.setValor("senha","senha123");
	}

}
