package br.com.bd2.entities;

public class ClubeJogo {
	private int idClubeJogo;
	private int idClube;
	private int gols;
	private int pontos;
	private int cartaoAmarelo;
	private int cartaoVermelho;
	
	private Clube clube;
	
	public ClubeJogo() {
		// TODO Auto-generated constructor stub
	}

	public int getIdClubeJogo() {
		return idClubeJogo;
	}

	public void setIdClubeJogo(int idClubeJogo) {
		this.idClubeJogo = idClubeJogo;
	}

	public int getIdClube() {
		return idClube;
	}

	public void setIdClube(int idClube) {
		this.idClube = idClube;
	}

	public int getGols() {
		return gols;
	}

	public void setGols(int gols) {
		this.gols = gols;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getCartaoAmarelo() {
		return cartaoAmarelo;
	}

	public void setCartaoAmarelo(int cartaoAmarelo) {
		this.cartaoAmarelo = cartaoAmarelo;
	}

	public int getCartaoVermelho() {
		return cartaoVermelho;
	}

	public void setCartaoVermelho(int cartaoVermelho) {
		this.cartaoVermelho = cartaoVermelho;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}
}
