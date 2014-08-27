package br.com.bd2.entities;

public class ClubeDiretor {
	private int idClubeDiretor;
	private int idDiretor;
	private int idClube;
	
	private Diretor diretor;
	private Clube clube;
	
	public ClubeDiretor() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdClubeDiretor() {
		return idClubeDiretor;
	}
	public void setIdClubeDiretor(int idClubeDiretor) {
		this.idClubeDiretor = idClubeDiretor;
	}
	public int getIdDiretor() {
		return idDiretor;
	}
	public void setIdDiretor(int idDiretor) {
		this.idDiretor = idDiretor;
	}
	public int getIdClube() {
		return idClube;
	}
	public void setIdClube(int idClube) {
		this.idClube = idClube;
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
