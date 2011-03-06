package com.rodrigor.padroes.mvc.enquete.view;


import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collection;

import com.rodrigor.padroes.mvc.enquete.model.EnqueteEvent;
import com.rodrigor.padroes.mvc.enquete.model.EnqueteListener;

/**
 * Esta janela é usada para efetivar o voto em alguma das opções disponíveis
 * na enquete.
 *
 * @author <a href="mailto:rodrigor@rodrigor.com">Rodrigo Rebouças de Almeida</a>
 * @since 24/03/2003
 **/
public class TelaVotacao extends Frame implements EnqueteListener{


	private Collection <String>botoes = new ArrayList();

	private ActionListener controller;

	public TelaVotacao(ActionListener controller){
		super("Tela de Votação - Enquete");
		this.setSize(100,120);
		this.setLayout(new GridLayout(0,1)); // Grid com qualquer numero
											  // de linhas e uma coluna
		this.controller = controller;
	    this.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	        	e.getWindow().hide();
	        	System.exit(0);
	        }
	    });
	}

	/**
	 * @see enquete.model.EnqueteListener#novaOpcao(EnqueteEvent)
	 */
	public void novaOpcao(EnqueteEvent event) {
		String opcao = event.getOpcao();
		Button botao;

		if(!botoes.contains(opcao)){
			botoes.add(opcao);
			botao = new Button(opcao);
			botao.setActionCommand(opcao);
			botao.addActionListener(controller);
			this.add(botao);
		}
	}

	/**
	 * @see enquete.model.EnqueteListener#novoVoto(EnqueteEvent)
	 */
	public void novoVoto(EnqueteEvent event) {
		// Nothing to do
	}

}
