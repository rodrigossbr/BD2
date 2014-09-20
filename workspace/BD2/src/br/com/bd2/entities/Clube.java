package br.com.bd2.entities;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Clube")
public class Clube {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "seq_clube")
	@SequenceGenerator(name="seq_clube", sequenceName="seq_clube")
	private Long idClube;
	
	@Column(name="nome", nullable=false, length=50)
	private String nome;
	
	@OneToMany(mappedBy="clube")
	private List<Jogador> jogadores;
	
	@OneToMany(mappedBy="clube")
	private List<ClubeJogo> clubesJogo;
	
	@ManyToMany
    @JoinTable(name="ClubeDiretor", 
    	joinColumns={ @JoinColumn(name="idClube") }, 
    	inverseJoinColumns={ @JoinColumn(name="idDiretor") })
	private List<Diretor> diretores;
	
	@ManyToMany
    @JoinTable(name="ClubePatrocinador", 
    	joinColumns={ @JoinColumn(name="idClube") }, 
    	inverseJoinColumns={ @JoinColumn(name="idPatrocinador") })
	private List<Patrocinador> patrocinadores;
	
	@ManyToMany
    @JoinTable(name="ClubeTecnico", 
    	joinColumns={ @JoinColumn(name="idClube") }, 
    	inverseJoinColumns={ @JoinColumn(name="idTecnico") })
	private List<Tecnico> tecnicos;
	
	@ManyToMany
    @JoinTable(name="ClubeTorcida", 
    	joinColumns={ @JoinColumn(name="idClube") }, 
    	inverseJoinColumns={ @JoinColumn(name="idTorcidaOrganizada") })
	private List<TorcidaOrganizada> torcidaOrganizada;
		
	@OneToMany(mappedBy="clube")
	private List<ClassificacaoGeral> classificacaoGeral;
	
	@OneToMany(mappedBy="clube")		
	private List<ClassificacaoRodada> classificacaoRodada;
	
	public Clube() {
		// TODO Auto-generated constructor stub
	}
	
	public Clube(String nome) {
		this.nome = nome;
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
	
	public List<ClubeJogo> getClubesJogo() {
		return clubesJogo;
	}
	
	public void setClubesJogo(List<ClubeJogo> clubesJogo) {
		this.clubesJogo = clubesJogo;
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
	
	public List<ClassificacaoGeral> getClassificacaoGeral() {
		return classificacaoGeral;
	}
	
	public void setClassificacaoGeral(List<ClassificacaoGeral> classificacaoGeral) {
		this.classificacaoGeral = classificacaoGeral;
	}
	
	public List<ClassificacaoRodada> getClassificacaoRodada() {
		return classificacaoRodada;
	}
	
	public void setClassificacaoRodada(List<ClassificacaoRodada> classificacaoRodada) {
		this.classificacaoRodada = classificacaoRodada;
	}
	
	public void addJogador(Jogador jogador){
		this.jogadores.add(jogador);
	}
}
