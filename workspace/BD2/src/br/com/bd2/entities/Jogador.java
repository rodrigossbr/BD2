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
@Table(name="Jogador")
public class Jogador {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_jogador")
	@SequenceGenerator(name="seq_jogador", sequenceName="seq_jogador")
	private Long idJogador;
	
	@Column(name="nome", nullable=false, length=100)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="idClube")
	private Clube clube;
	
	@ManyToOne
	@JoinColumn(name="idPosicao")
	private Posicao posicao;
	
	public Jogador() {
		// TODO Auto-generated constructor stub
	}
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public long getIdJogador() {
		return idJogador;
	}
	
	public void setIdJogador(long idJogador) {
		this.idJogador = idJogador;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
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
