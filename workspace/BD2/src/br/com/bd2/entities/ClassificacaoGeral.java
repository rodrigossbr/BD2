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
@Table(name="ClassificacaoGeral")
public class ClassificacaoGeral {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_classificacaoGeral")
	@SequenceGenerator(name="seq_classificacaoGeral", sequenceName="seq_classificacaoGeral")
	private long idClassificacaoGeral;
	
	@Column(name="posicao", nullable=false)
	private int posicao;
	
	@ManyToOne
	@JoinColumn(name="idCampeonato")
	private Campeonato campeonato;
	
	@ManyToOne
	@JoinColumn(name="idClube")
	private Clube clube;
	
	public ClassificacaoGeral() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdClassificacaoGeral() {
		return idClassificacaoGeral;
	}
	public void setIdClassificacaoGeral(long idClassificacaoGeral) {
		this.idClassificacaoGeral = idClassificacaoGeral;
	}
	
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
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
