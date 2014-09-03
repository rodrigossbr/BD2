package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Rodada")
public class Rodada {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_rodada")
	@SequenceGenerator(name="seq_rodada", sequenceName="seq_rodada")
	private long idRodada;
	
	@Column(name="idCampeonato")
	@JoinColumn(table="Campeonato", name="idCampeonato")
	private long idCampeonato;
	
	@Column(name="idArtilheiro")
	@JoinColumn(table="Artilheiro", name="idArtilheiro")
	private long idArtilheiro;
	
	@ManyToOne
	@JoinTable(name="Jogador")
	private Jogador artilheiro;
	
	@ManyToOne
	@JoinTable(name="Campeonato")
	private Campeonato campeonato;
	
	@OneToMany(mappedBy="Jogo")
	private List<Jogo> jogos;
	
	private long totalJogos;
	private long totalAmarelos;
	private long totalVermelhos;
	private long totalGols;
	
	public Rodada() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdRodada() {
		return idRodada;
	}
	public void setIdRodada(long idRodada) {
		this.idRodada = idRodada;
	}
	public long getIdCampeonato() {
		return idCampeonato;
	}
	public void setIdCampeonato(long idCampeonato) {
		this.idCampeonato = idCampeonato;
	}
	public long getIdArtilheiro() {
		return idArtilheiro;
	}
	public void setIdArtilheiro(long idArtilheiro) {
		this.idArtilheiro = idArtilheiro;
	}
	public Jogador getArtilheiro() {
		return artilheiro;
	}
	public void setArtilheiro(Jogador artilheiro) {
		this.artilheiro = artilheiro;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public List<Jogo> getJogos() {
		return jogos;
	}
	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
	public long getTotalJogos() {
		return totalJogos;
	}
	public void setTotalJogos(long totalJogos) {
		this.totalJogos = totalJogos;
	}
	public long getTotalAmarelos() {
		return totalAmarelos;
	}
	public void setTotalAmarelos(long totalAmarelos) {
		this.totalAmarelos = totalAmarelos;
	}
	public long getTotalVermelhos() {
		return totalVermelhos;
	}
	public void setTotalVermelhos(long totalVermelhos) {
		this.totalVermelhos = totalVermelhos;
	}
	public long getTotalGols() {
		return totalGols;
	}
	public void setTotalGols(long totalGols) {
		this.totalGols = totalGols;
	}
}
