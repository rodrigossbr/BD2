package br.com.bd2.entities;

public class ClassificacaoRodada {
	private int idClassificacaoRodada;
	private int idRodada;
	private int idClube;
	private String posicao;
	
	private Rodada rodada;
	private Clube clube;
	
	public ClassificacaoRodada() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdClassificacaoRodada() {
		return idClassificacaoRodada;
	}
	public void setIdClassificacaoRodada(int idClassificacaoRodada) {
		this.idClassificacaoRodada = idClassificacaoRodada;
	}
	public int getIdRodada() {
		return idRodada;
	}
	public void setIdRodada(int idRodada) {
		this.idRodada = idRodada;
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
	public Rodada getRodada() {
		return rodada;
	}
	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
}
