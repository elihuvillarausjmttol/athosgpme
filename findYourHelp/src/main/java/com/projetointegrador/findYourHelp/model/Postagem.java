package com.projetointegrador.findYourHelp.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "postagem")
public class Postagem {
	// create table postagem
	// criando tabela postagem

	//criando atributo IdPostagem
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPostagem;

	//criando atributo descriçãoPostagem
	@NotNull
	@Size(min = 5, max = 255)
	private String descricaoPostagem;

	//criando atributo UrlImagemPostagem
	@NotNull
	@Size(min = 5, max = 255)
	@URL(message = "URL é inválida")
	private String urlImagemPostagem;

	//criando atributo TituloPostagem
	@NotNull
	@Size(min = 5, max = 50)
	private String tituloPostagem;

	//criando atributo TipoAjudaPostagem
	@NotNull
	@Size(min = 5, max = 50)
	private String tipoAjudaPostagem;

	//criando atributo DataPostagem
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPostagem = new java.sql.Date(System.currentTimeMillis());

	//relacionando a tabela tema à postagem (chave estrangeira)
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	//relacionando a tabela usuario à postagem (chave estrangeira)
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;

	// getters and setters
	public long getIdPostagem() {
		return idPostagem;
	}

	public void setIdPostagem(long idPostagem) {
		this.idPostagem = idPostagem;
	}

	public String getDescricaoPostagem() {
		return descricaoPostagem;
	}

	public void setDescricaoPostagem(String descricaoPostagem) {
		this.descricaoPostagem = descricaoPostagem;
	}

	public String getUrlImagemPostagem() {
		return urlImagemPostagem;
	}

	public void setUrlImagemPostagem(String urlImagemPostagem) {
		this.urlImagemPostagem = urlImagemPostagem;
	}

	public String getTituloPostagem() {
		return tituloPostagem;
	}

	public void setTituloPostagem(String tituloPostagem) {
		this.tituloPostagem = tituloPostagem;
	}

	public Date getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(Date dataPostagem) {
		this.dataPostagem = dataPostagem;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public String getTipoAjudaPostagem() {
		return tipoAjudaPostagem;
	}

	public void setTipoAjudaPostagem(String tipoAjudaPostagem) {
		this.tipoAjudaPostagem = tipoAjudaPostagem;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
