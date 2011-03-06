package com.rodrigor.padroes.mvc.enquete.controller;

/*
 * Historico:
 *    24/03/2003: rodrigor - Cria��o da classe
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rodrigor.padroes.mvc.enquete.model.EnqueteSimples;

/**
 * Controlador da Interface "TelaVotacao". Esta classe recebe os
 * eventos gerados pela interface e repassa para o modelo do negócio,
 * alterando o estado da enquete.
 *
 * @see enquete.view.TelaVotacao
 *
 * @author <a href="mailto:rodrigor@rodrigor.com">Rodrigo Rebouças de Almeida</a>
 * @since 24/03/2003
 **/
public class TelaVotacaoCtrl implements ActionListener{

	private EnqueteSimples enquete;

	public TelaVotacaoCtrl(EnqueteSimples enquete){
		this.enquete = enquete;
	}

	/**
	 * Evento lançado pelo clique nos botoes da TelaVotacao
	 * @see java.awt.event.ActionListener#actionPerformed(ActionEvent)
	 */
	public void actionPerformed(ActionEvent event) {
		enquete.votar(event.getActionCommand());
	}

}
