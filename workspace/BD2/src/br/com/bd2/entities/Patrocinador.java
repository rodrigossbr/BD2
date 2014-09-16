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
@Table(name="Patrocinador")
public class Patrocinador {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_patrocinador")
	@SequenceGenerator(name="seq_patrocinador", sequenceName="seq_patrocinador")
	private long idPatrocinador;
	
	@Column(name="nome")
	private String nome;
	
	@ManyToOne
	@JoinTable(name="Clube")
	private Clube clube;
	
	public Patrocinador() {
		// TODO Auto-generated constructor stub
	}
	
	public Patrocinador(String nome) {
		this.nome = nome;
	}
	
	public long getIdPatrocinador() {
		return idPatrocinador;
	}
	
	public void setIdPatrocinador(long idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Clube getClube() {
		return clube;
	}

	public void setClube(Clube clube) {
		this.clube = clube;
	}
}
