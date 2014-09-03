package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Clube")
public class Clube {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_clube")
	@SequenceGenerator(name="seq_clube", sequenceName="seq_clube")
	private long idClube;
	
	@Column(name="nome", nullable=false, length=50)
	private String nome;
	
	@OneToMany(mappedBy="Jogador")
	private List<Jogador> jogadores;
	
	@OneToMany(mappedBy="Jogo")
	private List<Jogo> jogos;
	
	@OneToMany(mappedBy="Diretor")
	private List<Diretor> diretores;
	
	@OneToMany(mappedBy="Patrocinador")
	private List<Patrocinador> patrocinadores;
	
	@OneToMany(mappedBy="Tecnico")
	private List<Tecnico> tecnicos;
	
	@OneToMany(mappedBy="TorcidaOrganizada")
	private List<TorcidaOrganizada> torcidaOrganizada;
		
	@ManyToOne
	@JoinColumn(name="ClassificacaoGeral")
	private ClassificacaoGeral classificacaoGeral;
	
	@ManyToOne
	@JoinColumn(name="ClassificacaoRodada")		
	private ClassificacaoRodada classificacaoRodada;
	
	public Clube() {
		// TODO Auto-generated constructor stub
	}
	
	public long getIdClube() {
		return idClube;
	}
	public void setIdClube(long idClube) {
		this.idClube = idClube;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	public List<Jogo> getJogos() {
		return jogos;
	}
	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
	public List<Diretor> getDiretores() {
		return diretores;
	}
	public void setDiretores(List<Diretor> diretores) {
		this.diretores = diretores;
	}
	public List<Patrocinador> getPatrocinadores() {
		return patrocinadores;
	}
	public void setPatrocinadores(List<Patrocinador> patrocinadores) {
		this.patrocinadores = patrocinadores;
	}
	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}
	public void setTecnicos(List<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}
	public List<TorcidaOrganizada> getTorcidaOrganizada() {
		return torcidaOrganizada;
	}
	public void setTorcidaOrganizada(List<TorcidaOrganizada> torcidaOrganizada) {
		this.torcidaOrganizada = torcidaOrganizada;
	}
	public ClassificacaoGeral getClassificacaoGeral() {
		return classificacaoGeral;
	}
	public void setClassificacaoGeral(ClassificacaoGeral classificacaoGeral) {
		this.classificacaoGeral = classificacaoGeral;
	}
	public ClassificacaoRodada getClassificacaoRodada() {
		return classificacaoRodada;
	}
	public void setClassificacaoRodada(ClassificacaoRodada classificacaoRodada) {
		this.classificacaoRodada = classificacaoRodada;
	}
}
