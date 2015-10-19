package org.domain.moneda.entity;

// Generated 28/03/2013 11:43:43 PM by Hibernate Tools 3.2.4.GA

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * ActivagestorId generated by hbm2java
 */
@Embeddable
public class ActivagestorId implements java.io.Serializable {

	private int consecutivo;
	private String documento;
	private Date fecha;

	public ActivagestorId() {
	}

	public ActivagestorId(int consecutivo, String documento, Date fecha) {
		this.consecutivo = consecutivo;
		this.documento = documento;
		this.fecha = fecha;
	}

	@Column(name = "consecutivo", nullable = false)
	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
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
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha", nullable = false, length = 15)
	@NotNull
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ActivagestorId))
			return false;
		ActivagestorId castOther = (ActivagestorId) other;

		return (this.getConsecutivo() == castOther.getConsecutivo())
				&& ((this.getDocumento() == castOther.getDocumento()) || (this
						.getDocumento() != null
						&& castOther.getDocumento() != null && this
						.getDocumento().equals(castOther.getDocumento())))
				&& ((this.getFecha() == castOther.getFecha()) || (this
						.getFecha() != null
						&& castOther.getFecha() != null && this.getFecha()
						.equals(castOther.getFecha())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getConsecutivo();
		result = 37 * result
				+ (getDocumento() == null ? 0 : this.getDocumento().hashCode());
		result = 37 * result
				+ (getFecha() == null ? 0 : this.getFecha().hashCode());
		return result;
	}

}