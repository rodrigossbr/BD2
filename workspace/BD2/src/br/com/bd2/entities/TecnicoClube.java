package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TecnicoClube")
public class TecnicoClube {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_tecnicoClube")
	@SequenceGenerator(name="seq_tecnicoClube", sequenceName="seq_tecnicoClube")
	private long idTecnicoClube;
	
	@Column(name="idClube")
	private long idClube;
	
	@Column(name="idTecnico")
	private long idTecnico;
	
	@ManyToOne
	@JoinTable(name="Clube")
	private Clube clube;
	
	@ManyToOne
	@JoinTable(name="Tecnico")
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
	public long getIdClube() {
		return idClube;
	}
	public void setIdClube(long idClube) {
		this.idClube = idClube;
	}
	public long getIdTecnico() {
		return idTecnico;
	}
	public void setIdTecnico(long idTecnico) {
		this.idTecnico = idTecnico;
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
