package br.com.bd2.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import br.com.bd2.entities.*;

public class MainDB4Objects {

	public static void main(String[] args) {
		
//		Objetos comuns
		
		Posicao posGoleiro = new Posicao("Goleiro");
		Posicao posZagueiro = new Posicao("Zagueiro");
		Posicao posLateral = new Posicao("Lateral");
		Posicao posVolante = new Posicao("Volante");
		Posicao posMeia = new Posicao("Meia");
		Posicao posAtacante = new Posicao("Atacante");
		
		Patrocinador patNike = new Patrocinador("Nike");
		Patrocinador patTopper = new Patrocinador("Topper");
		
//		Grêmio
		
		Diretor dirKoff = new Diretor("Koff");
		Tecnico tecFelipao = new Tecnico("Felipão");
		TorcidaOrganizada torcGeral = new TorcidaOrganizada("Geral");
		
		ArrayList<Jogador> jogadoresGremio = new ArrayList<Jogador>();
		
		Jogador jogMarceloGrohe = new Jogador("Marcelo Grohe");
		jogMarceloGrohe.setPosicao(posGoleiro);
		
		jogadoresGremio.add(jogMarceloGrohe);
		
		Clube clubeGremio = new Clube("Grêmio");
		clubeGremio.addTecnico(tecFelipao);
		clubeGremio.addPatrocinador(patTopper);
		clubeGremio.addTorcidaOrganizada(torcGeral);
		clubeGremio.addDiretor(dirKoff);
		clubeGremio.setJogadores(jogadoresGremio);
		
//		Inter
		
		Diretor dirLuigi = new Diretor("Luigi");
		Tecnico tecAbelao = new Tecnico("Abelão");
		TorcidaOrganizada torcMacacada = new TorcidaOrganizada("Macacada");
		
		ArrayList<Jogador> jogadoresInter = new ArrayList<Jogador>();
		
		Jogador jogDida = new Jogador("Dida");
		jogDida.setPosicao(posGoleiro);
		
		jogadoresInter.add(jogDida);
		
		Clube clubeInter = new Clube("Internacional");
		clubeInter.addTecnico(tecAbelao);
		clubeInter.addPatrocinador(patNike);
		clubeInter.addTorcidaOrganizada(torcMacacada);
		clubeInter.addDiretor(dirLuigi);
		clubeInter.setJogadores(jogadoresInter);
		
//		Campeonato
		
		Campeonato campBrasileiro = new Campeonato("Brasileirão");
		ArrayList<Rodada> rodadas = new ArrayList<Rodada>();
		
//		Rodada 1
		
		Rodada rodada1 = new Rodada();
		
		Jogo jogoGreInt = new Jogo();
		ClubeJogo clbJogoGreInt1 = new ClubeJogo();
		clbJogoGreInt1.setClube(clubeGremio);
		ClubeJogo clbJogoGreInt2 = new ClubeJogo();
		clbJogoGreInt2.setClube(clubeInter);
		jogoGreInt.addJogoClube(clbJogoGreInt1);
		jogoGreInt.addJogoClube(clbJogoGreInt2);
		rodada1.addJogo(jogoGreInt);
		
		rodadas.add(rodada1);
		
//		Rodada 2
		
		Rodada rodada2 = new Rodada();
		
		Jogo jogoIntGre = new Jogo();
		ClubeJogo clbJogoIntGre1 = new ClubeJogo();
		clbJogoIntGre1.setClube(clubeGremio);
		ClubeJogo clbJogoIntGre2 = new ClubeJogo();
		clbJogoIntGre2.setClube(clubeInter);
		jogoIntGre.addJogoClube(clbJogoIntGre1);
		jogoIntGre.addJogoClube(clbJogoIntGre2);
		rodada2.addJogo(jogoIntGre);
		
		rodadas.add(rodada2);
		
		ClassificacaoRodada clfRodada1Gre = new ClassificacaoRodada();
		clfRodada1Gre.setRodada(rodada1);
		clfRodada1Gre.setClube(clubeGremio);
		
		ClassificacaoRodada clfRodada1Int = new ClassificacaoRodada();
		clfRodada1Int.setRodada(rodada1);
		clfRodada1Int.setClube(clubeInter);
		
		campBrasileiro.setRodadas(rodadas);
		
		ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "BD2OO");
		try {
		    db.store(campBrasileiro);
		    
		    ObjectSet<?> resultado = db.queryByExample(Campeonato.class);
		    imprimirResultado(resultado);
		} finally {
		    db.close();
		}
	}
	
	public static void imprimirResultado(List<?> result){
	    System.out.println(result.size());
	    for (Object o : result) {
	        System.out.println(o);
	    }
	}
}
