package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ClubeDiretor" )
public class ClubeDiretor {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_clubeDiretor")
	@SequenceGenerator(name="seq_clubeDiretor", sequenceName="seq_clubeDiretor")
	private Long idClubeDiretor;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idDiretor")
	private Diretor diretor;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idCLube")
	private Clube clube;
	
	public ClubeDiretor() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdClubeDiretor() {
		return idClubeDiretor;
	}
	
	public void setIdClubeDiretor(long idClubeDiretor) {
		this.idClubeDiretor = idClubeDiretor;
	}
	
	public Diretor getDiretor() {
		return diretor;
	}
	
	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}
	
	public Clube getClube() {
		return clube;
	}
	
	public void setClube(Clube clube) {
		this.clube = clube;
	}
}
