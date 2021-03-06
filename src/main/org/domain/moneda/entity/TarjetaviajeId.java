package org.domain.moneda.entity;

// Generated 30/12/2011 03:58:33 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * TarjetaviajeId generated by hbm2java
 */
@Embeddable
public class TarjetaviajeId implements java.io.Serializable {

	private String numerotarjeta;
	private int consecutivoviaje;

	public TarjetaviajeId() {
	}

	public TarjetaviajeId(String numerotarjeta, int consecutivoviaje) {
		this.numerotarjeta = numerotarjeta;
		this.consecutivoviaje = consecutivoviaje;
	}

	@Column(name = "numerotarjeta", nullable = false, length = 16)
	@NotNull
	@Length(max = 16)
	public String getNumerotarjeta() {
		return this.numerotarjeta;
	}

	public void setNumerotarjeta(String numerotarjeta) {
		this.numerotarjeta = numerotarjeta;
	}

	@Column(name = "consecutivoviaje", nullable = false)
	public int getConsecutivoviaje() {
		return this.consecutivoviaje;
	}

	public void setConsecutivoviaje(int consecutivoviaje) {
		this.consecutivoviaje = consecutivoviaje;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TarjetaviajeId))
			return false;
		TarjetaviajeId castOther = (TarjetaviajeId) other;

		return ((this.getNumerotarjeta() == castOther.getNumerotarjeta()) || (this
				.getNumerotarjeta() != null
				&& castOther.getNumerotarjeta() != null && this
				.getNumerotarjeta().equals(castOther.getNumerotarjeta())))
				&& (this.getConsecutivoviaje() == castOther
						.getConsecutivoviaje());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getNumerotarjeta() == null ? 0 : this.getNumerotarjeta()
						.hashCode());
		result = 37 * result + this.getConsecutivoviaje();
		return result;
	}

}
