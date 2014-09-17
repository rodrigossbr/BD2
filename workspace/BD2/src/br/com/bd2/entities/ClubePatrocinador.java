package br.com.bd2.entities;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ClubePatrocinador")
public class ClubePatrocinador {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private long idClubePatrocinador;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idClube")
	private Clube clube;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idPatrocinador")
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
