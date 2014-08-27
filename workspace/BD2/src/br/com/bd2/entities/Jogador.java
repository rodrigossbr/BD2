package br.com.bd2.entities;

public class Jogador {
	private int idJogador;
	private int idClube;
	private String nome;
	private int idPosicao;
	
	private Clube clube;
	private Posicao posicao;
	
	public Jogador() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdJogador() {
		return idJogador;
	}
	public void setIdJogador(int idJogador) {
		this.idJogador = idJogador;
	}
	public int getIdClube() {
		return idClube;
	}
	public void setIdClube(int idClube) {
		this.idClube = idClube;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdPosicao() {
		return idPosicao;
	}
	public void setIdPosicao(int idPosicao) {
		this.idPosicao = idPosicao;
	}
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	public Posicao getPosicao() {
		return posicao;
	}
	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
}
