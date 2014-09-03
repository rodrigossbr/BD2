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
	@GeneratedValue(strategy = SEQUENCE, generator = "s_classificacaoGeral")
	@SequenceGenerator(name="s_classificacaoGeral", sequenceName="s_classificacaoGeral")
	private long idClassificacaoGeral;
	
	@Column(name="idCampeonato", nullable=false)
	@JoinColumn(table="Campeonato", name="idCampeonato")
	private long idCampeonato;
	
	@Column(name="idClube", nullable=false)
	@JoinColumn(table="Clube", name="idClube")
	private long idClube;
	
	@Column(name="nroClubes", nullable=false, length=20)
	private String posicao;
	
	@ManyToOne
	@JoinColumn(name="Campeonato")
	private Campeonato campeonato;
	
	@ManyToOne
	@JoinColumn(name="Clube")
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
	public long getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(long idCampeonato) {
		this.idCampeonato = idCampeonato;
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
