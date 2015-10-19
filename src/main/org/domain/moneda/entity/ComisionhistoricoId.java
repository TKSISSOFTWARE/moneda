package org.domain.moneda.entity;

// Generated 23/12/2011 07:58:00 AM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * ComisionhistoricoId generated by hbm2java
 */
@Embeddable
public class ComisionhistoricoId implements java.io.Serializable {

	private String documento;
	private Date fechainicio;

	public ComisionhistoricoId() {
	}

	public ComisionhistoricoId(String documento, Date fechainicio) {
		this.documento = documento;
		this.fechainicio = fechainicio;
	}

	@Column(name = "documento", nullable = false, length = 15)
	@NotNull
	@Length(max = 15)
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@Column(name = "fechainicio", nullable = false, length = 29)
	@NotNull
	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ComisionhistoricoId))
			return false;
		ComisionhistoricoId castOther = (ComisionhistoricoId) other;

		return ((this.getDocumento() == castOther.getDocumento()) || (this
				.getDocumento() != null
				&& castOther.getDocumento() != null && this.getDocumento()
				.equals(castOther.getDocumento())))
				&& ((this.getFechainicio() == castOther.getFechainicio()) || (this
						.getFechainicio() != null
						&& castOther.getFechainicio() != null && this
						.getFechainicio().equals(castOther.getFechainicio())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDocumento() == null ? 0 : this.getDocumento().hashCode());
		result = 37
				* result
				+ (getFechainicio() == null ? 0 : this.getFechainicio()
						.hashCode());
		return result;
	}

}