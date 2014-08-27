package br.com.bd2.entities;

import java.util.List;

public class Clube {
	private int idClube;
	private String nome;
	
	private List<Jogador> jogadores;
	private List<Jogo> jogos;
	private List<Diretor> diretores;
	private List<Patrocinador> patrocinadores;
	private List<Tecnico> tecnicos;
	private List<TorcidaOrganizada> torcidaOrganizada;
		
	private ClassificacaoGeral classificacaoGeral;
	private ClassificacaoRodada classificacaoRodada;
	
	public Clube() {
		// TODO Auto-generated constructor stub
	}
	
	public int getIdClube() {
		return idClube;
	}
	public void setIdClube(int idClube) {
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
