package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Posicao")
public class Posicao {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_posicao")
	@SequenceGenerator(name="seq_posicao", sequenceName="seq_posicao")
	private Long idPosicao;
	
	@Column(name="nome")
	private String nome;
	
	public Posicao() {
		// TODO Auto-generated constructor stub
	}
	
	public Posicao(String nome) {
		this.nome = nome;
	}
	
	public long getIdPosicao() {
		return idPosicao;
	}
	public void setIdPosicao(long idPosicao) {
		this.idPosicao = idPosicao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
