package br.com.bd2.entities;

public class ClubeTorcida {

	private int idClubeTorcida;
	private int idClube;
	private int idTorcidaOrganizada;
	
	private Clube clube;
	private TorcidaOrganizada torcidaOrganizada;
	
	public ClubeTorcida() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdClubeTorcida() {
		return idClubeTorcida;
	}
	public void setIdClubeTorcida(int idClubeTorcida) {
		this.idClubeTorcida = idClubeTorcida;
	}
	public int getIdClube() {
		return idClube;
	}
	public void setIdClube(int idClube) {
		this.idClube = idClube;
	}
	public int getIdTorcidaOrganizada() {
		return idTorcidaOrganizada;
	}
	public void setIdTorcidaOrganizada(int idTorcidaOrganizada) {
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
