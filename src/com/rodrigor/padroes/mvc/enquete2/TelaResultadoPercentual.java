package com.rodrigor.padroes.mvc.enquete2;


import java.awt.*;
import java.util.*;


/**
 * Janela que exibe o resultado percentual da vota��o on-line.
 * Esta tela � atualizada a cada novo voto a uma op��o da enquete.
 *
 * @author <a href="mailto:rodrigor@dsc.ufcg.edu.br">Rodrigo Rebou�as de Almeida</a>
 * @since 24/03/2003
 */
public class TelaResultadoPercentual extends Window{

	private Map labels = new HashMap();

	public TelaResultadoPercentual(Frame parent){
		super(parent);
		this.setSize(180,120);
		this.setLayout(new GridLayout(0,2)); // Grid com qualquer numero
											  // de linhas e uma coluna
		this.add(new Label("Percentual"));
		this.add(new Label());
	}


	/**
	 * Recebe a lista de opcoes inicial
	 */
	public void inicializar(Iterator opcoes) {
		String opcao;

		Label label;
		Label votos;
		while(opcoes.hasNext()){
			opcao = (String)opcoes.next();
			if(!labels.containsKey(opcao)){
				label = new Label(opcao+" - ");
				votos = new Label(""+0+"%");
				labels.put(opcao,votos);
				this.add(label);
				this.add(votos);
			}
		}
	}

	public void novoVoto(String opcao, int nvotos, int total) {
		Label votos;
		votos = (Label)labels.get(opcao);
		votos.setText(""+(nvotos*100/total)+" %");
	}

}
