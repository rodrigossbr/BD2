package br.com.bd2.entities;

import java.util.List;

public class Campeonato {
	private int idCampeonato;
	private String nome;
	private int ano;
	private int nroClubes;
	private List<ClassificacaoGeral> classificacaoGeral;
	private List<Rodada> rodadas;
	
	public Campeonato(){
		
	}
	
	public int getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getNroClubes() {
		return nroClubes;
	}
	public void setNroClubes(int nroClubes) {
		this.nroClubes = nroClubes;
	}
	public List<ClassificacaoGeral> getClassificacaoGeral() {
		return classificacaoGeral;
	}
	public void setClassificacaoGeral(List<ClassificacaoGeral> classificacaoGeral) {
		this.classificacaoGeral = classificacaoGeral;
	}
	public List<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(List<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
}
