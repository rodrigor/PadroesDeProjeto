package com.rodrigor.padroes.mvc.enquete.model;
/*
 * Historico:
 *    24/03/2003: rodrigor - Cria��o da classe
 */

import java.util.EventListener;

/**
 * Interface Listener para receber eventos da EnqueteSimples.
 * Toda classe interessada em processar os eventos lançados pela Enquete
 * deve implementar esta interface e se cadastrar no objeto EnqueteSimples
 * usando o método addEnqueteListener().<br>
 * O metodo novoVoto() sera chamado quando um novo voto for contabilizado na Enquete.
 * O método novaOpcao() será chamado quando uma nova opção for adicionada na Enquete.
 *
 * @author <a href="mailto:rodrigor@rodrigor.com">Rodrigo Rebouças de Almeida</a>
 * @since 24/03/2003
 **/
public interface EnqueteListener extends EventListener {


	/**
	 * Infocado quando um novo voto é contabilizado na Enquete.
	 * @param event Evento gerado pela Enquete.
	 */
	public void novoVoto(EnqueteEvent event);

	/**
	 * Invocado quando uma nova opção é adicionada à Enquete.
	 * @param event Evento gerado pela Enquete.
	 */
	public void novaOpcao(EnqueteEvent event);
}
