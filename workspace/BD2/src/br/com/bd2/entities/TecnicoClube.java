package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="TecnicoClube", uniqueConstraints=@UniqueConstraint(name="AkClubeTecnico", columnNames={"idClube", "idTecnico"}))
public class TecnicoClube {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_tecnicoClube")
	@SequenceGenerator(name="seq_tecnicoClube", sequenceName="seq_tecnicoClube")
	private Long idTecnicoClube;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idClube")
	private Clube clube;
	
	@ManyToOne(cascade=CascadeType.ALL)
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
