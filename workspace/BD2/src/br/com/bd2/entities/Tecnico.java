package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Tecnico")
public class Tecnico {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_tecnico")
	@SequenceGenerator(name="seq_tecnico", sequenceName="seq_tecnico")
	private Long idTecnico;
	
	@Column(name="nome")
	private String nome;
	
	@ManyToMany(mappedBy="tecnicos")
	private List<Clube> clubes;
	
	public Tecnico() {
		// TODO Auto-generated constructor stub
	}
	
	public Tecnico(String nome) {
		this.nome = nome;
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

	public List<Clube> getClubes() {
		return clubes;
	}

	public void setClubes(List<Clube> clubes) {
		this.clubes = clubes;
	}
}
