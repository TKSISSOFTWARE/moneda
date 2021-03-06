package org.domain.moneda.entity;

// Generated Oct 7, 2012 11:19:21 PM by Hibernate Tools 3.2.4.GA

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
 * Promotorcomisiontx generated by hbm2java
 */
@Entity
@Table(name = "promotorcomisiontx", schema = "public")
public class Promotorcomisiontx implements java.io.Serializable {

	private PromotorcomisiontxId id;
	private Promotor promotor;
	private Pais pais;
	private Date fechafin;
	private BigDecimal porcentaje;

	public Promotorcomisiontx() {
	}

	public Promotorcomisiontx(PromotorcomisiontxId id, Promotor promotor,
			Pais pais) {
		this.id = id;
		this.promotor = promotor;
		this.pais = pais;
	}

	public Promotorcomisiontx(PromotorcomisiontxId id, Promotor promotor,
			Pais pais, Date fechafin, BigDecimal porcentaje) {
		this.id = id;
		this.promotor = promotor;
		this.pais = pais;
		this.fechafin = fechafin;
		this.porcentaje = porcentaje;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "codpais", column = @Column(name = "codpais", nullable = false, length = 5)),
			@AttributeOverride(name = "fechainicio", column = @Column(name = "fechainicio", nullable = false, length = 13)),
			@AttributeOverride(name = "documento", column = @Column(name = "documento", nullable = false, length = 15)) })
	@NotNull
	public PromotorcomisiontxId getId() {
		return this.id;
	}

	public void setId(PromotorcomisiontxId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "documento", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Promotor getPromotor() {
		return this.promotor;
	}

	public void setPromotor(Promotor promotor) {
		this.promotor = promotor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codpais", nullable = false, insertable = false, updatable = false)
	@NotNull
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechafin", length = 13)
	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}

	@Column(name = "porcentaje", precision = 4)
	public BigDecimal getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(BigDecimal porcentaje) {
		this.porcentaje = porcentaje;
	}

}
