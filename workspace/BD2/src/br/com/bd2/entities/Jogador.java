package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Jogador")
public class Jogador {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_jogador")
	@SequenceGenerator(name="seq_diretor", sequenceName="seq_jogador")
	private long idJogador;
	
	@Column(name="idClube")
	@JoinColumn(table="Clube", name="idClube")
	private long idClube;
	
	@Column(name="nome", nullable=false, length=100)
	private String nome;
	
	@Column(name="idPosicao")
	@JoinColumn(table="Posicao", name="idPosicao")
	private long idPosicao;
	
	@ManyToOne
	@JoinTable(name="Clube")
	private Clube clube;
	
	@ManyToOne
	@JoinTable(name="Posicao")
	private Posicao posicao;
	
	public Jogador() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdJogador() {
		return idJogador;
	}
	public void setIdJogador(long idJogador) {
		this.idJogador = idJogador;
	}
	public long getIdClube() {
		return idClube;
	}
	public void setIdClube(long idClube) {
		this.idClube = idClube;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getIdPosicao() {
		return idPosicao;
	}
	public void setIdPosicao(long idPosicao) {
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
