package com.generation.colhetividade.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@NotBlank(message="nome é obrigatorio")
	@Size(min = 3, max = 255, message="Digite no minimo 3 caracteres e no maximo 255 caracteres")
	private String nome;
	
	@NotBlank(message="usuario é obrigatorio")
	@Size(min = 3, max = 255, message="Digite no minimo 3 caracteres e no maximo 255 caracteres")
	private String usuario;
	
	@NotBlank(message="senha é obrigatorio")
	@Size(min = 3, max = 255, message="Digite no minimo 3 caracteres e no maximo 255 caracteres")
	private String senha;
	
	
	private String foto;
	
	@NotBlank
	@Size(min = 3, max = 100, message="Digite no minimo 3 caracteres e no maximo 100 caracteres")
	private String tipoUsuario;

	@OneToMany(mappedBy="usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produto;
	
	//getters and setters
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
	
	

}
