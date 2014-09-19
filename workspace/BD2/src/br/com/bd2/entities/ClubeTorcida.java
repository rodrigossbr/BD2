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
@Table(name="ClubeTorcida", uniqueConstraints=@UniqueConstraint(name="AkClubeTorcida", columnNames={"idClube", "idTorcidaOrganizada"}))
public class ClubeTorcida {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_clubeTorcida")
	@SequenceGenerator(name="seq_clubeTorcida", sequenceName="seq_clubeTorcida")
	private Long idClubeTorcida;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idClube")
	private Clube clube;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idtorcidaOrganizada")
	private TorcidaOrganizada torcidaOrganizada;
	
	public ClubeTorcida() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdClubeTorcida() {
		return idClubeTorcida;
	}
	
	public void setIdClubeTorcida(long idClubeTorcida) {
		this.idClubeTorcida = idClubeTorcida;
	}
	
	public Clube getClube() {
		return clube;
	}
	
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	
	public TorcidaOrganizada getTorcidaOrganizada() {
		return torcidaOrganizada;
	}
	
	public void setTorcidaOrganizada(TorcidaOrganizada torcidaOrganizada) {
		this.torcidaOrganizada = torcidaOrganizada;
	}
}
