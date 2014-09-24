package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.*;

@Entity
@Table(name="ClubeDiretor", uniqueConstraints=@UniqueConstraint(name="AkClubeDiretor", columnNames={"idDiretor", "idClube"}))
public class ClubeDiretor {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_clubeDiretor")
	@SequenceGenerator(name="seq_clubeDiretor", sequenceName="seq_clubeDiretor")
	private Long idClubeDiretor;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idDiretor")
	private Diretor diretor;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idClube")
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
