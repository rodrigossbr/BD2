package br.com.bd2.main;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.bd2.entities.*;

public class MainHibernate {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("BD2");
		EntityManager em = emf.createEntityManager();
		
		Posicao posicao1 = new Posicao("Posicao 1");
		Posicao posicao2 = new Posicao("Posicao 2");
		Posicao posicao3 = new Posicao("Posicao 3");
		Posicao posicao4 = new Posicao("Posicao 4");
		
		em.getTransaction().begin();
		em.persist(posicao1);
		em.persist(posicao2);
		em.persist(posicao3);
		em.persist(posicao4);
		em.getTransaction().commit();
		
		Clube clube1 = new Clube("Clube 1");
		
		ArrayList<Clube> clubes = new ArrayList<Clube>();
		clubes.add(clube1);
		
		ArrayList<Tecnico> tecnicos = new ArrayList<Tecnico>();
		Tecnico tecnico1 = new Tecnico("Tecnico 1");
		tecnicos.add(tecnico1);
		clube1.setTecnicos(tecnicos);
		
		ArrayList<Diretor> diretores = new ArrayList<Diretor>();
		Diretor diretor1 = new Diretor("Diretor 1");
		diretor1.setClubes(clubes);
		diretores.add(diretor1);
		clube1.setDiretores(diretores);
		
		ArrayList<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();
		Patrocinador patrocinador1 = new Patrocinador("Patrocinador 1");
		patrocinador1.setClubes(clubes);
		patrocinadores.add(patrocinador1);
		clube1.setPatrocinadores(patrocinadores);
		
		ArrayList<TorcidaOrganizada> torcidas = new ArrayList<TorcidaOrganizada>();
		TorcidaOrganizada torcida1 = new TorcidaOrganizada("Torcida 1");
		torcida1.setClube(clube1);
		torcidas.add(torcida1);
		clube1.setTorcidaOrganizada(torcidas);

		ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
		Jogador jogador1 = new Jogador("Jogador 1");
		jogador1.setPosicao(posicao1);
		jogador1.setClube(clube1);
		jogadores.add(jogador1);
		Jogador jogador2 = new Jogador("Jogador 2");
		jogador2.setPosicao(posicao2);
		jogador2.setClube(clube1);
		jogadores.add(jogador2);
		Jogador jogador3 = new Jogador("Jogador 3");
		jogador3.setPosicao(posicao3);
		jogador3.setClube(clube1);
		jogadores.add(jogador3);
		Jogador jogador4 = new Jogador("Jogador 4");
		jogador4.setPosicao(posicao4);
		jogador4.setClube(clube1);
		jogadores.add(jogador4);
		clube1.setJogadores(jogadores);
		
		Jogo jogo1 = new Jogo();
		
		ArrayList<ClubeJogo> clubeJogos = new ArrayList<ClubeJogo>();
		ClubeJogo clubeJogo1 = new ClubeJogo();
		clubeJogo1.setClube(clube1);
		clubeJogo1.setGols(6);
		clubeJogo1.setPontos(40);
		clubeJogo1.setCartaoVermelho(0);
		clubeJogo1.setCartaoAmarelo(2);
		clubeJogo1.setJogo(jogo1);
		clubeJogos.add(clubeJogo1);
		clube1.setClubesJogo(clubeJogos);
		
		Campeonato campeonato = new Campeonato("Campeonato 1");
		campeonato.setAno(2014);
		campeonato.setNroClubes(2);
		
		ClassificacaoGeral classificacaoGeral = new ClassificacaoGeral();
		classificacaoGeral.setCampeonato(campeonato);
		classificacaoGeral.setClube(clube1);
		classificacaoGeral.setPosicao(1);
		
		ClassificacaoRodada classificacaoRodada = new ClassificacaoRodada();
		classificacaoRodada.setClube(clube1);
		classificacaoRodada.setPosicao(1);
		
		ArrayList<Rodada> rodadas = new ArrayList<Rodada>();
		Rodada rodada1 = new Rodada();
		rodada1.setArtilheiro(jogador1);
		
		ArrayList<Jogo> jogos = new ArrayList<Jogo>();
		jogos.add(jogo1);
		rodada1.setJogos(jogos);
		rodada1.setCampeonato(campeonato);
		rodadas.add(rodada1);
		
		classificacaoRodada.setRodada(rodada1);
		campeonato.setRodadas(rodadas);
		
		/*
		em.getTransaction().begin();
		em.persist(tecnico1);
		em.persist(patrocinador1);
		em.persist(diretor1);
		em.persist(torcida1);
		em.persist(jogador1);
		em.persist(jogador2);
		em.persist(jogador3);
		em.persist(jogador4);
		em.persist(clubeJogo1);
		em.persist(campeonato);
		em.persist(classificacaoGeral);
		em.persist(classificacaoRodada);
		em.persist(rodada1);
		em.persist(jogo1);
		em.persist(clube1);
		em.getTransaction().commit(); */
	}
}
