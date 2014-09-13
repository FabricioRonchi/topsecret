package org.catolicasc.beer.model;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Stateless
public class Beer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String descri��o;
	private String unidademedida;
	private String volume;
	private int quantidade;
	private float pre�o;
	
	public Beer(Long id, String nome, String descri��o, String unidademedida,
			String volume, int quantidade, float pre�o) {
		super();
		this.id = id;
		this.nome = nome;
		this.descri��o = descri��o;
		this.unidademedida = unidademedida;
		this.volume = volume;
		this.quantidade = quantidade;
		this.pre�o = pre�o;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Beer() {
		super();		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescri��o() {
		return descri��o;
	}
	public void setDescri��o(String descri��o) {
		this.descri��o = descri��o;
	}
	public String getUnidademedida() {
		return unidademedida;
	}
	public void setUnidademedida(String unidademedida) {
		this.unidademedida = unidademedida;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getPre�o() {
		return pre�o;
	}
	public void setPre�o(float pre�o) {
		this.pre�o = pre�o;
	}
	
	
}
