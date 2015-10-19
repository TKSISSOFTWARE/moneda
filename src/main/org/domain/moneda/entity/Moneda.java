package org.domain.moneda.entity;

// Generated 7/10/2015 05:14:39 PM by Hibernate Tools 3.2.4.GA

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Moneda generated by hbm2java
 */
@Entity
@Table(name = "moneda")
public class Moneda implements java.io.Serializable {

	private String codigomoneda;
	private String nombreMoneda;
	private Set<Paridadmoneda> paridadmonedasForCodmonedadestino = new HashSet<Paridadmoneda>(
			0);
	private Set<Paridadmoneda> paridadmonedasForCodmonedaorigen = new HashSet<Paridadmoneda>(
			0);
	private Set<Paridadmoneda> paridadmonedasForCodmonedadestino_1 = new HashSet<Paridadmoneda>(
			0);
	private Set<Paridadmoneda> paridadmonedasForCodmonedaorigen_1 = new HashSet<Paridadmoneda>(
			0);

	public Moneda() {
	}

	public Moneda(String codigomoneda) {
		this.codigomoneda = codigomoneda;
	}

	public Moneda(String codigomoneda, String nombreMoneda,
			Set<Paridadmoneda> paridadmonedasForCodmonedadestino,
			Set<Paridadmoneda> paridadmonedasForCodmonedaorigen,
			Set<Paridadmoneda> paridadmonedasForCodmonedadestino_1,
			Set<Paridadmoneda> paridadmonedasForCodmonedaorigen_1) {
		this.codigomoneda = codigomoneda;
		this.nombreMoneda = nombreMoneda;
		this.paridadmonedasForCodmonedadestino = paridadmonedasForCodmonedadestino;
		this.paridadmonedasForCodmonedaorigen = paridadmonedasForCodmonedaorigen;
		this.paridadmonedasForCodmonedadestino_1 = paridadmonedasForCodmonedadestino_1;
		this.paridadmonedasForCodmonedaorigen_1 = paridadmonedasForCodmonedaorigen_1;
	}

	@Id
	@Column(name = "codigomoneda", unique = true, nullable = false, length = 5)
	@NotNull
	@Length(max = 5)
	public String getCodigomoneda() {
		return this.codigomoneda;
	}

	public void setCodigomoneda(String codigomoneda) {
		this.codigomoneda = codigomoneda;
	}

	@Column(name = "nombre_moneda", length = 60)
	@Length(max = 60)
	public String getNombreMoneda() {
		return this.nombreMoneda;
	}

	public void setNombreMoneda(String nombreMoneda) {
		this.nombreMoneda = nombreMoneda;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "monedaByCodmonedadestino")
	public Set<Paridadmoneda> getParidadmonedasForCodmonedadestino() {
		return this.paridadmonedasForCodmonedadestino;
	}

	public void setParidadmonedasForCodmonedadestino(
			Set<Paridadmoneda> paridadmonedasForCodmonedadestino) {
		this.paridadmonedasForCodmonedadestino = paridadmonedasForCodmonedadestino;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "monedaByCodmonedaorigen")
	public Set<Paridadmoneda> getParidadmonedasForCodmonedaorigen() {
		return this.paridadmonedasForCodmonedaorigen;
	}

	public void setParidadmonedasForCodmonedaorigen(
			Set<Paridadmoneda> paridadmonedasForCodmonedaorigen) {
		this.paridadmonedasForCodmonedaorigen = paridadmonedasForCodmonedaorigen;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "monedaByCodmonedadestino")
	public Set<Paridadmoneda> getParidadmonedasForCodmonedadestino_1() {
		return this.paridadmonedasForCodmonedadestino_1;
	}

	public void setParidadmonedasForCodmonedadestino_1(
			Set<Paridadmoneda> paridadmonedasForCodmonedadestino_1) {
		this.paridadmonedasForCodmonedadestino_1 = paridadmonedasForCodmonedadestino_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "monedaByCodmonedaorigen")
	public Set<Paridadmoneda> getParidadmonedasForCodmonedaorigen_1() {
		return this.paridadmonedasForCodmonedaorigen_1;
	}

	public void setParidadmonedasForCodmonedaorigen_1(
			Set<Paridadmoneda> paridadmonedasForCodmonedaorigen_1) {
		this.paridadmonedasForCodmonedaorigen_1 = paridadmonedasForCodmonedaorigen_1;
	}

}