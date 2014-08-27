package br.com.bd2.entities;

public class ClubePatrocinador {
	private int idClubePatrocinador;
	private int idClube;
	private int idPatrocinador;
	
	private Clube clube;
	private Patrocinador patrocinador;
	
	public ClubePatrocinador() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdClubePatrocinador() {
		return idClubePatrocinador;
	}
	public void setIdClubePatrocinador(int idClubePatrocinador) {
		this.idClubePatrocinador = idClubePatrocinador;
	}
	public int getIdClube() {
		return idClube;
	}
	public void setIdClube(int idClube) {
		this.idClube = idClube;
	}
	public int getIdPatrocinador() {
		return idPatrocinador;
	}
	public void setIdPatrocinador(int idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	public Patrocinador getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(Patrocinador patrocinador) {
		this.patrocinador = patrocinador;
	}
}
