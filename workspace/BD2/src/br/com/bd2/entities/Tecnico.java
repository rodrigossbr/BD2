package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Tecnico")
public class Tecnico {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_tecnico")
	@SequenceGenerator(name="seq_tecnico", sequenceName="seq_tecnico")
	private long idTecnico;
	
	@Column(name="nome")
	private String nome;
	
	public Tecnico() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdTecnico() {
		return idTecnico;
	}
	public void setIdTecnico(long idTecnico) {
		this.idTecnico = idTecnico;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
