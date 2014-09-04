package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_jogo")
	@SequenceGenerator(name="seq_jogo", sequenceName="seq_jogo")
	private long idJogo;
	
	@Column(name="idCampeonato")
	private long idCampeonato;
	
	@Column(name="idRodada")
	private long idRodada;
	
	@Column(name="idClubeJogo")
	private long idClubeJogo1;
	
	@Column(name="idClubeJogo")
	private long idClubeJogo2;
	
	@OneToOne
	@JoinTable(name="ClubeJogo")
	private ClubeJogo clubeJogo1;
	
	@OneToOne
	@JoinTable(name="ClubeJogo")
	private ClubeJogo clubeJogo2;
	
	public Jogo() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdJogo() {
		return idJogo;
	}
	public void setIdJogo(long idJogo) {
		this.idJogo = idJogo;
	}
	public long getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(long idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	public long getIdRodada() {
		return idRodada;
	}
	public void setIdRodada(long idRodada) {
		this.idRodada = idRodada;
	}
	public long getIdClubeJogo1() {
		return idClubeJogo1;
	}
	public void setIdClubeJogo1(long idClubeJogo1) {
		this.idClubeJogo1 = idClubeJogo1;
	}
	public long getIdClubeJogo2() {
		return idClubeJogo2;
	}
	public void setIdClubeJogo2(long idClubeJogo2) {
		this.idClubeJogo2 = idClubeJogo2;
	}
	public ClubeJogo getClubeJogo1() {
		return clubeJogo1;
	}
	public void setClubeJogo1(ClubeJogo clubeJogo1) {
		this.clubeJogo1 = clubeJogo1;
	}
	public ClubeJogo getClubeJogo2() {
		return clubeJogo2;
	}
	public void setClubeJogo2(ClubeJogo clubeJogo2) {
		this.clubeJogo2 = clubeJogo2;
	}
}
