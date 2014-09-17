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
@Table(name="TecnicoClube")
public class TecnicoClube {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private long idTecnicoClube;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idClube")
	private Clube clube;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idTecnico")
	private Tecnico tecnico;
	
	public TecnicoClube() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdTecnicoClube() {
		return idTecnicoClube;
	}
	
	public void setIdTecnicoClube(long idTecnicoClube) {
		this.idTecnicoClube = idTecnicoClube;
	}
	
	public Clube getClube() {
		return clube;
	}
	
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	
	public Tecnico getTecnico() {
		return tecnico;
	}
	
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
}
