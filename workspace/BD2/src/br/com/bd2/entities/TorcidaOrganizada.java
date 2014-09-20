package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TorcidaOrganizada")
public class TorcidaOrganizada {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_torcidaOrganizada")
	@SequenceGenerator(name="seq_torcidaOrganizada", sequenceName="seq_torcidaOrganizada")
	private Long idTorcidaOrganizada;
	
	@Column(name="nome")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="idClube")
	private Clube clube;
	
	public TorcidaOrganizada() {
		// TODO Auto-generated constructor stub
	}
	
	public TorcidaOrganizada(String nome) {
		this.nome = nome;
	}
	
	public long getIdTorcidaOrganizada() {
		return idTorcidaOrganizada;
	}
	public void setIdTorcidaOrganizada(long idTorcidaOrganizada) {
		this.idTorcidaOrganizada = idTorcidaOrganizada;
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
