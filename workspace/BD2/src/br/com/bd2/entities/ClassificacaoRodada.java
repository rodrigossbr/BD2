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
@Table(name="ClassificacaoRodada")
public class ClassificacaoRodada {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_classificacaoRodada")
	@SequenceGenerator(name="seq_classificacaoRodada", sequenceName="seq_classificacaoRodada")
	private long idClassificacaoRodada;
	
	@Column(name="posicao", nullable=false)
	private int posicao;
	
	@ManyToOne
	@JoinColumn(name="idRodada")
	private Rodada rodada;
	
	@ManyToOne
	@JoinColumn(name="idClube")
	private Clube clube;
	
	public ClassificacaoRodada() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdClassificacaoRodada() {
		return idClassificacaoRodada;
	}
	
	public void setIdClassificacaoRodada(long idClassificacaoRodada) {
		this.idClassificacaoRodada = idClassificacaoRodada;
	}

	public int getPosicao() {
		return posicao;
	}
	
	public void setPosicao(int posicao) {
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
