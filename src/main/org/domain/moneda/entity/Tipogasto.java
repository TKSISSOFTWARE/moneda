package org.domain.moneda.entity;

// Generated 9/03/2012 07:06:26 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Tipogasto generated by hbm2java
 */
@Entity
@Table(name = "tipogasto", schema = "public")
public class Tipogasto implements java.io.Serializable {

	private String codtipogasto;
	private String descripcion;
	private String tipo;

	public Tipogasto() {
	}

	public Tipogasto(String codtipogasto) {
		this.codtipogasto = codtipogasto;
	}

	public Tipogasto(String codtipogasto, String descripcion, String tipo) {
		this.codtipogasto = codtipogasto;
		this.descripcion = descripcion;
		this.tipo =tipo;
	}

	@Id
	@Column(name = "codtipogasto", unique = true, nullable = false, length = 2)
	@NotNull
	@Length(max = 2)
	public String getCodtipogasto() {
		return this.codtipogasto;
	}

	public void setCodtipogasto(String codtipogasto) {
		this.codtipogasto = codtipogasto;
	}

	@Column(name = "descripcion", length = 50)
	@Length(max = 50)
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Column(name = "tipo", length = 1)
	@Length(max = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
