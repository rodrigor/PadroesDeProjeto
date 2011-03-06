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
public class Campo {
	
	
	private String id;
	private String label;
	private String valor;
	
	private Validador validador;

	/**
	 * @param string
	 * @param string2
	 * @param validadorTexto
	 */
	public Campo(String id, String label, Validador validador) {
		this.id = id;
		this.label = label;
		this.validador = validador;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param valor the valor to set
	 * @throws ValorInvalidoException 
	 */
	public void setValor(String valor){
		this.valor = valor;
	}

	/**
	 * @return the valor
	 */
	public String getValor() {
		return valor;
	}
	
	public boolean validar(){
		return validador.validarString(this.valor);
	}

}
