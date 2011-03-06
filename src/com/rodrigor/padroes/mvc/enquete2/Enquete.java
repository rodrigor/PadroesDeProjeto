package com.rodrigor.padroes.mvc.enquete2;

import java.applet.Applet;

/**
 * Esta classe executa um sisteminha de Enquete para contabilizar
 * os votos �s op��es cadastradas. Este sisteminha n�o foi implementado
 * usando MVC.
 *
 * @author <a href="mailto:rodrigor@dsc.ufcg.edu.br">Rodrigo Rebou�as de Almeida</a>
 * @since 24/03/2003
 **/
public class Enquete extends Applet{

	public static void main(String[] args) {
		Enquete e = new Enquete();
		e.start();
	}


	/**
	 * Inicia o Applet.
	 *
	 * @see java.applet.Applet#start()
	 */
	public void start() {
		super.start();
		// Interface que altera o estado do modelo
		TelaVotacao votacao = new TelaVotacao();
		votacao.setLocation(5,5);

	}

}
