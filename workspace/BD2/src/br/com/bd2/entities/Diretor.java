package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Diretor")
public class Diretor {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_diretor")
	@SequenceGenerator(name="seq_diretor", sequenceName="seq_diretor")
	private long idDiretor;
	
	@Column(name="nome", nullable=false, length=100)
	private String nome;
	
	public Diretor() {
		// TODO Auto-generated constructor stub
	}
	
	public Diretor(String nome) {
		this.nome = nome;
	}
	
	public long getIdDiretor() {
		return idDiretor;
	}
	public void setIdDiretor(long idDiretor) {
		this.idDiretor = idDiretor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
