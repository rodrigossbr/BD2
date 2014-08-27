package br.com.bd2.entities;

import java.util.List;

public class Rodada {
	private int idRodada;
	private int idCampeonato;
	private int idArtilheiro;
	
	private Jogador artilheiro;
	private Campeonato campeonato;
	private List<Jogo> jogos;
	
	private int totalJogos;
	private int totalAmarelos;
	private int totalVermelhos;
	private int totalGols;
	
	public Rodada() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdRodada() {
		return idRodada;
	}
	public void setIdRodada(int idRodada) {
		this.idRodada = idRodada;
	}
	public int getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	public int getIdArtilheiro() {
		return idArtilheiro;
	}
	public void setIdArtilheiro(int idArtilheiro) {
		this.idArtilheiro = idArtilheiro;
	}
	public Jogador getArtilheiro() {
		return artilheiro;
	}
	public void setArtilheiro(Jogador artilheiro) {
		this.artilheiro = artilheiro;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public List<Jogo> getJogos() {
		return jogos;
	}
	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
	public int getTotalJogos() {
		return totalJogos;
	}
	public void setTotalJogos(int totalJogos) {
		this.totalJogos = totalJogos;
	}
	public int getTotalAmarelos() {
		return totalAmarelos;
	}
	public void setTotalAmarelos(int totalAmarelos) {
		this.totalAmarelos = totalAmarelos;
	}
	public int getTotalVermelhos() {
		return totalVermelhos;
	}
	public void setTotalVermelhos(int totalVermelhos) {
		this.totalVermelhos = totalVermelhos;
	}
	public int getTotalGols() {
		return totalGols;
	}
	public void setTotalGols(int totalGols) {
		this.totalGols = totalGols;
	}
}
