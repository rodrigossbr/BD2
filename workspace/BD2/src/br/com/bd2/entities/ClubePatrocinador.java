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
@Table(name="ClubePatrocinador")
public class ClubePatrocinador {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_clubePatrocinador")
	@SequenceGenerator(name="seq_clubePatrocinador", sequenceName="seq_clubePatrocinador")
	private long idClubePatrocinador;
	
	@Column(name="idClube", nullable=false)
	private long idClube;
	
	@Column(name="idPatrocinador", nullable=false)
	private long idPatrocinador;
	
	@ManyToOne
	@JoinTable(name="Clube")
	private Clube clube;
	
	@ManyToOne
	@JoinTable(name="Patrocinador")
	private Patrocinador patrocinador;
	
	public ClubePatrocinador() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdClubePatrocinador() {
		return idClubePatrocinador;
	}
	public void setIdClubePatrocinador(long idClubePatrocinador) {
		this.idClubePatrocinador = idClubePatrocinador;
	}
	public long getIdClube() {
		return idClube;
	}
	public void setIdClube(long idClube) {
		this.idClube = idClube;
	}
	public long getIdPatrocinador() {
		return idPatrocinador;
	}
	public void setIdPatrocinador(long idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	public Patrocinador getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(Patrocinador patrocinador) {
		this.patrocinador = patrocinador;
	}
}
