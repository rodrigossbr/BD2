package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Jogo")
public class Jogo {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_jogo")
	@SequenceGenerator(name="seq_jogo", sequenceName="seq_jogo")
	private long idJogo;
	
	@OneToMany(mappedBy="jogo")
	private List<ClubeJogo> jogosClube;
	
	@ManyToOne
	@JoinColumn(name="idRodada")
	private Rodada rodada;
	
	public Jogo() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdJogo() {
		return idJogo;
	}
	
	public void setIdJogo(long idJogo) {
		this.idJogo = idJogo;
	}
	
	public Rodada getRodada() {
		return rodada;
	}
	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}
	
	public List<ClubeJogo> getJogosClube() {
		return jogosClube;
	}

	public void setJogosClube(List<ClubeJogo> jogosClube) {
		this.jogosClube = jogosClube;
	}
}
