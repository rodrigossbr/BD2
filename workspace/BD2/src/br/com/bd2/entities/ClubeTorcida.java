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
@Table(name="ClubeTorcida")
public class ClubeTorcida {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private long idClubeTorcida;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idClube")
	private Clube clube;
	
	@OneToOne(cascade=CascadeType.ALL)
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
