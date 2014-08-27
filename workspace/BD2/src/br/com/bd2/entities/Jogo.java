package br.com.bd2.entities;

public class Jogo {
	private int idJogo;
	private int idCampeonato;
	private int idRodada;
	private int idClubeJogo1;
	private int idClubeJogo2;
	
	private ClubeJogo clubeJogo1;
	private ClubeJogo clubeJogo2;
	
	public Jogo() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdJogo() {
		return idJogo;
	}
	public void setIdJogo(int idJogo) {
		this.idJogo = idJogo;
	}
	public int getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	public int getIdRodada() {
		return idRodada;
	}
	public void setIdRodada(int idRodada) {
		this.idRodada = idRodada;
	}
	public int getIdClubeJogo1() {
		return idClubeJogo1;
	}
	public void setIdClubeJogo1(int idClubeJogo1) {
		this.idClubeJogo1 = idClubeJogo1;
	}
	public int getIdClubeJogo2() {
		return idClubeJogo2;
	}
	public void setIdClubeJogo2(int idClubeJogo2) {
		this.idClubeJogo2 = idClubeJogo2;
	}
	public ClubeJogo getClubeJogo1() {
		return clubeJogo1;
	}
	public void setClubeJogo1(ClubeJogo clubeJogo1) {
		this.clubeJogo1 = clubeJogo1;
	}
	public ClubeJogo getClubeJogo2() {
		return clubeJogo2;
	}
	public void setClubeJogo2(ClubeJogo clubeJogo2) {
		this.clubeJogo2 = clubeJogo2;
	}
}
