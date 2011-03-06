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

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Rodrigo Rebouças de Almeida
 *
 */
public class Formulario {
	
	
	private List<Campo> campos;
	private Map<String,Campo> camposht;
	
	
	public Formulario(){
		this.campos = new LinkedList<Campo>();
		this.camposht = new HashMap<String,Campo>();
	}

	/**
	 * @param campo
	 */
	public void addCampo(Campo campo) {
		campos.add(campo);
		camposht.put(campo.getId(),campo);
	}

	/**
	 */
	public void setValor(String id, String valor) {
		camposht.get(id).setValor(valor);
		
	}
	
	public boolean validar(){
		for(Campo campo: campos){
			if(!campo.validar()) return false;
		}
		return true;
	}

}
