package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Campeonato")
public class Campeonato {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_campeonato")
	@SequenceGenerator(name="seq_campeonato", sequenceName="seq_campeonato")
	private long idCampeonato;
	
	@Column(name="nome", nullable=false, length=50)
	private String nome;
	
	@Column(name="ano", nullable=false)
	private int ano;
	
	@Column(name="nroClubes", nullable=false)
	private int nroClubes;
	
	@OneToMany(mappedBy="campeonato")
	private List<ClassificacaoGeral> classificacaoGeral;
	
	@OneToMany(mappedBy="campeonato")
	private List<Rodada> rodadas;
	
	public Campeonato(){
		
	}
	
	public Campeonato(String nome){
		this.nome = nome;
	}
	
	public long getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(long idCampeonato) {
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
