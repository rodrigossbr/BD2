package br.com.bd2.entities;

public class TecnicoClube {
	private int idTecnicoClube;
	private int idClube;
	private int idTecnico;
	
	private Clube clube;
	private Tecnico tecnico;
	
	public TecnicoClube() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdTecnicoClube() {
		return idTecnicoClube;
	}
	public void setIdTecnicoClube(int idTecnicoClube) {
		this.idTecnicoClube = idTecnicoClube;
	}
	public int getIdClube() {
		return idClube;
	}
	public void setIdClube(int idClube) {
		this.idClube = idClube;
	}
	public int getIdTecnico() {
		return idTecnico;
	}
	public void setIdTecnico(int idTecnico) {
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
