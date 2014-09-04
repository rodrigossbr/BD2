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
@Table(name="ClubeTorcida")
public class ClubeTorcida {

	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "s_clubeTorcida")
	@SequenceGenerator(name="s_clubeTorcida", sequenceName="s_clubeTorcida")
	private long idClubeTorcida;
	
	@Column(name="idClube", nullable=false)
	private long idClube;
	
	@Column(name="idTorcidaOrganizada", nullable=false)
	private long idTorcidaOrganizada;
	
	@ManyToOne
	@JoinTable(name="Clube")
	private Clube clube;
	
	@ManyToOne
	@JoinTable(name="TorcidaOrganizada")
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
	public long getIdClube() {
		return idClube;
	}
	public void setIdClube(long idClube) {
		this.idClube = idClube;
	}
	public long getIdTorcidaOrganizada() {
		return idTorcidaOrganizada;
	}
	public void setIdTorcidaOrganizada(long idTorcidaOrganizada) {
		this.idTorcidaOrganizada = idTorcidaOrganizada;
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
