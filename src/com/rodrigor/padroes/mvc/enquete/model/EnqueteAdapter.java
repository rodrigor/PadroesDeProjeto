package com.rodrigor.padroes.mvc.enquete.model;
/*
 * Historico:
 *    24/03/2003: rodrigor - Cria��o da classe
 */


/**
 * Provê uma implementação padrão para a interface EnqueteListener.
 *
 * @author <a href="mailto:rodrigor@rodrigor.com">Rodrigo Rebouças de Almeida</a>
 * @since 24/03/2003
 **/
public class EnqueteAdapter implements EnqueteListener {

	/**
	 * @see enquete.model.EnqueteListener#novaOpcao(EnqueteEvent)
	 */
	public void novaOpcao(EnqueteEvent event) {
	}

	/**
	 * @see enquete.model.EnqueteListener#novoVoto(EnqueteEvent)
	 */
	public void novoVoto(EnqueteEvent event) {
	}

}
