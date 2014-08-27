package br.com.bd2.entities;

public class ClassificacaoGeral {
	private int idClassificacaoGeral;
	private int idCampeonato;
	private int idClube;
	private String posicao;
	
	private Campeonato campeonato;
	private Clube clube;
	
	public ClassificacaoGeral() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdClassificacaoGeral() {
		return idClassificacaoGeral;
	}
	public void setIdClassificacaoGeral(int idClassificacaoGeral) {
		this.idClassificacaoGeral = idClassificacaoGeral;
	}
	public int getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	public int getIdClube() {
		return idClube;
	}
	public void setIdClube(int idClube) {
		this.idClube = idClube;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
}
