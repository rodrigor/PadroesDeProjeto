package com.rodrigor.padroes.mvc.enquete.model;

/*
 * Historico:
 *    24/03/2003: rodrigor - Cria��o da classe
 *    26/03/2003: rodrigor - Cria��o do construtor que recebe uma opcao e um source
 *                           Cria��o do m�todo getEnqueteSimples()
 *                           Cria��o do m�todo getOpcao();
 *    31/03/2003: rodrigor - Criado o m�todo getVotos();
 * 							 Excluido o m�todo getEnqueteSimples();
 */


import java.util.EventObject;


/**
 * Evento gerado pelo modelo da aplicação (classe EnqueteSimples).
 *
 * @author <a href="mailto:rodrigor@rodrigor.com">Rodrigo Rebouças de Almeida</a>
 * @since 24/03/2003
 **/
public class EnqueteEvent extends EventObject {

	private String opcao = null;
	private int votos = 0;

	public EnqueteEvent(EnqueteSimples source){
		super(source);
	}
	public EnqueteEvent(EnqueteSimples source,String opcao){
		this(source);
		this.opcao = opcao;
	}

	/**
	 * Retorna a opção associada ao evento gerado.
	 * A opção pode ser uma nova opção adicionada à EnqueteSimples
	 * ou a opção escolhida para adicionar um novo voto.
	 * @return String opção
	 */
	public String getOpcao() {
		return opcao;
	}

	/**
	 * Retorna o numero de votos da opcao
	 * @return int votos
	 */
	public int getVotos() {
		return ((EnqueteSimples)this.source).getVotos(opcao);
	}

	/**
	 * Retorna o total de votos da enquete
	 * @return int
	 */
	public int getTotalVotos() {
		return ((EnqueteSimples)this.source).getTotalVotos();
	}

}
