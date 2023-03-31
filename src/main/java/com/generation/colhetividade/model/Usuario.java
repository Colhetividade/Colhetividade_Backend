package com.generation.colhetividade.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
	
	@Schema(example = "email@email.com")
	@NotNull(message="Usuário é obrigatorio")
	@Size(min = 3, max = 255, message="Digite no minimo 3 caracteres e no maximo 255 caracteres")
	@Email(message = "O Atributo Usuário deve ser um email válido!")
	private String usuario;
	
	@NotBlank(message="senha é obrigatorio")
	@Size(min = 3, message="Digite no minimo 3 caracteres e no maximo 255 caracteres")
	private String senha;
	
	private String foto;
	
	@NotNull
	@Size(max = 20, message="Máximo de 20 caracteres :o")
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

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
}
