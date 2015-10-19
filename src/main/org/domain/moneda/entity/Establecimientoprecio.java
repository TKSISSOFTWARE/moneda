package org.domain.moneda.entity;

// Generated 27/04/2015 11:47:31 AM by Hibernate Tools 3.2.4.GA

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.NotNull;

/**
 * Establecimientoprecio generated by hbm2java
 */
@Entity
@Table(name = "establecimientoprecio")
public class Establecimientoprecio implements java.io.Serializable {

	private EstablecimientoprecioId id;
	private Establecimiento establecimiento;
	private Date fechafin;
	private BigDecimal dolaroficina;
	private BigDecimal porcentajeoficina;

	public Establecimientoprecio() {
	}

	public Establecimientoprecio(EstablecimientoprecioId id,
			Establecimiento establecimiento) {
		this.id = id;
		this.establecimiento = establecimiento;
	}

	public Establecimientoprecio(EstablecimientoprecioId id,
			Establecimiento establecimiento, Date fechafin,
			BigDecimal dolaroficina, BigDecimal porcentajeoficina) {
		this.id = id;
		this.establecimiento = establecimiento;
		this.fechafin = fechafin;
		this.dolaroficina = dolaroficina;
		this.porcentajeoficina = porcentajeoficina;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "codigounico", column = @Column(name = "codigounico", nullable = false, length = 8)),
			@AttributeOverride(name = "fechainicio", column = @Column(name = "fechainicio", nullable = false, length = 22)) })
	@NotNull
	public EstablecimientoprecioId getId() {
		return this.id;
	}

	public void setId(EstablecimientoprecioId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigounico", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Establecimiento getEstablecimiento() {
		return this.establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechafin", length = 29)
	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	@Column(name = "dolaroficina", precision = 6)
	public BigDecimal getDolaroficina() {
		return this.dolaroficina;
	}

	public void setDolaroficina(BigDecimal dolaroficina) {
		this.dolaroficina = dolaroficina;
	}

	@Column(name = "porcentajeoficina", precision = 5, scale = 3)
	public BigDecimal getPorcentajeoficina() {
		return this.porcentajeoficina;
	}

	public void setPorcentajeoficina(BigDecimal porcentajeoficina) {
		this.porcentajeoficina = porcentajeoficina;
	}

}