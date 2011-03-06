package com.rodrigor.padroes.mvc.enquete2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.List;


/**
 * Tela para cadastro de votos.
 *
 * @author <a href="mailto:rodrigor@dsc.ufcg.edu.br">Rodrigo Rebou�as de Almeida</a>
 * @since 24/03/2003
 **/
public class TelaVotacao extends Frame implements ActionListener{

	private TelaResultado telaResult;
	private TelaResultadoPercentual telaResultPerc;

	private Map opcoes;
	private List listaOpcoes; // para obter as op��es em ordem

	public TelaVotacao(){
		super("Tela de Vota��o - Enquete");

		telaResult = new TelaResultado(this);
		telaResult.setLocation(120,5);

		telaResultPerc = new TelaResultadoPercentual(this);
		telaResultPerc.setLocation(250,5);


		listaOpcoes = new Vector();
		this.opcoes = new HashMap();

		this.adicionaOpcao("Op��o 1");
		this.adicionaOpcao("Op��o 2");
		this.adicionaOpcao("Op��o 3");
		this.adicionaOpcao("Op��o 4");
		criarBotoes();

		telaResult.inicializar(listaOpcoes.iterator());
		telaResultPerc.inicializar(listaOpcoes.iterator());


		this.setSize(100,120);
		this.setLayout(new GridLayout(0,1)); // Grid com qualquer numero
											  // de linhas e uma coluna
	    this.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent e) {
	        	e.getWindow().hide();
	        	System.exit(0);
	        }
	    });
		this.show();
		telaResult.show();
		telaResultPerc.show();
	}

	private void adicionaOpcao(String opcao){
		listaOpcoes.add(opcao);
		this.opcoes.put(opcao,new Integer(0));
	}

	public void criarBotoes() {
		Iterator it = listaOpcoes.iterator();
		String opcao;
		Button botao;
		while(it.hasNext()){
			opcao = (String)it.next();
			botao = new Button(opcao);
			botao.setActionCommand(opcao);
			botao.addActionListener(this);
			this.add(botao);
		}
	}

	/**
	 * Executado ao clicar nos bot�es
	 */
	public void actionPerformed(ActionEvent event) {
		String opcao = event.getActionCommand();
		this.votar(opcao); // incrementando o voto

		// Atualizando a tela de resultados absolutos
		telaResult.novoVoto(opcao,getVotos(opcao));

		// Atualizando a tela de resultados percentuais
		telaResultPerc.novoVoto(opcao,getVotos(opcao),getTotalVotos());
	}

	/**
	 * Incrementa o voto da op��o entrada
	 */
	public void votar(String opcao){
		int votoAtual = ((Integer)this.opcoes.get(opcao)).intValue();
		this.opcoes.put(opcao,new Integer(++votoAtual));
	}

	/**
	 * Retorna a soma dos votos de todas as op��es da enquete
	 * @return int soma dos votos de todas as op��es da enquete
	 */
	public int getTotalVotos(){
		Iterator votos = this.opcoes.values().iterator();
		int total = 0;
		while(votos.hasNext()){
			total+= ((Integer)votos.next()).intValue();
		}
		return total;
	}

	/**
	 * Retorna a quantidade de votos de uma op��o individual
	 */
	public int getVotos(String opcao){
		return ((Integer)this.opcoes.get(opcao)).intValue();
	}

}
