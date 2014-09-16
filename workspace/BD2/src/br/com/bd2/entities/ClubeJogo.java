package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ClubeJogo")
public class ClubeJogo {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_clubeJogo")
	@SequenceGenerator(name="seq_clubeJogo", sequenceName="seq_clubeJogo")
	private long idClubeJogo;
	
	@Column(name="gols", nullable=true)
	private int gols;
	
	@Column(name="pontos", nullable=true)
	private int pontos;
	
	@Column(name="cartaoAmarelo", nullable=true)
	private int cartaoAmarelo;
	
	@Column(name="cartaoVermelho", nullable=true)
	private int cartaoVermelho;
	
	@ManyToOne
	@JoinColumn(name="idClube")
	private Clube clube;
	
	@ManyToOne
	@JoinColumn(name="idJogo")
	private Jogo jogo;
	
	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public ClubeJogo() {
		// TODO Auto-generated constructor stub
	}

	public long getIdClubeJogo() {
		return idClubeJogo;
	}

	public void setIdClubeJogo(long idClubeJogo) {
		this.idClubeJogo = idClubeJogo;
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
