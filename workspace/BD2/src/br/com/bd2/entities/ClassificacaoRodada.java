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
	@GeneratedValue(strategy = SEQUENCE, generator = "s_classificacaoRodada")
	@SequenceGenerator(name="s_classificacaoRodada", sequenceName="s_classificacaoRodada")
	private long idClassificacaoRodada;
	
	@Column(name="idRodada", nullable=false)
	@JoinColumn(table="Rodada", name="idRodada")
	private long idRodada;
	
	@Column(name="idClube", nullable=false)
	@JoinColumn(table="Clube", name="idClube")
	private long idClube;
	
	@Column(name="posicao", nullable=false, length=50)
	private String posicao;
	
	@ManyToOne
	@JoinColumn(name="Rodada")
	private Rodada rodada;
	
	@ManyToOne
	@JoinColumn(name="Clube")
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
	public long getIdRodada() {
		return idRodada;
	}
	public void setIdRodada(long idRodada) {
		this.idRodada = idRodada;
	}
	public long getIdClube() {
		return idClube;
	}
	public void setIdClube(long idClube) {
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
