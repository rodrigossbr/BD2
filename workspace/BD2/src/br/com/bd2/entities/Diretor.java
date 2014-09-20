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
@Table(name="Diretor")
public class Diretor {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_diretor")
	@SequenceGenerator(name="seq_diretor", sequenceName="seq_diretor")
	private Long idDiretor;
	
	@Column(name="nome", nullable=false, length=100)
	private String nome;
	
	@ManyToMany(mappedBy="diretores")
	private List<Clube> clubes;
	
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

	public List<Clube> getClubes() {
		return clubes;
	}

	public void setClubes(List<Clube> clubes) {
		this.clubes = clubes;
	}
}
