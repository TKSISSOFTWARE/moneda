package org.domain.moneda.entity;

// Generated 27/04/2015 11:47:31 AM by Hibernate Tools 3.2.4.GA

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.validator.Length;

/**
 * VistasaldomiercolesId generated by hbm2java
 */
@Embeddable
public class VistasaldomiercolesId implements java.io.Serializable {

	private String docupromo;
	private String nombrepromo;
	private String asesora;
	private BigDecimal saldoCliente;

	public VistasaldomiercolesId() {
	}

	public VistasaldomiercolesId(String docupromo, String nombrepromo,
			String asesora, BigDecimal saldoCliente) {
		this.docupromo = docupromo;
		this.nombrepromo = nombrepromo;
		this.asesora = asesora;
		this.saldoCliente = saldoCliente;
	}

	@Column(name = "docupromo", length = 15)
	@Length(max = 15)
	public String getDocupromo() {
		return this.docupromo;
	}

	public void setDocupromo(String docupromo) {
		this.docupromo = docupromo;
	}

	@Column(name = "nombrepromo")
	public String getNombrepromo() {
		return this.nombrepromo;
	}

	public void setNombrepromo(String nombrepromo) {
		this.nombrepromo = nombrepromo;
	}

	@Column(name = "asesora")
	public String getAsesora() {
		return this.asesora;
	}

	public void setAsesora(String asesora) {
		this.asesora = asesora;
	}

	@Column(name = "saldo_cliente", precision = 131089, scale = 0)
	public BigDecimal getSaldoCliente() {
		return this.saldoCliente;
	}

	public void setSaldoCliente(BigDecimal saldoCliente) {
		this.saldoCliente = saldoCliente;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VistasaldomiercolesId))
			return false;
		VistasaldomiercolesId castOther = (VistasaldomiercolesId) other;

		return ((this.getDocupromo() == castOther.getDocupromo()) || (this
				.getDocupromo() != null
				&& castOther.getDocupromo() != null && this.getDocupromo()
				.equals(castOther.getDocupromo())))
				&& ((this.getNombrepromo() == castOther.getNombrepromo()) || (this
						.getNombrepromo() != null
						&& castOther.getNombrepromo() != null && this
						.getNombrepromo().equals(castOther.getNombrepromo())))
				&& ((this.getAsesora() == castOther.getAsesora()) || (this
						.getAsesora() != null
						&& castOther.getAsesora() != null && this.getAsesora()
						.equals(castOther.getAsesora())))
				&& ((this.getSaldoCliente() == castOther.getSaldoCliente()) || (this
						.getSaldoCliente() != null
						&& castOther.getSaldoCliente() != null && this
						.getSaldoCliente().equals(castOther.getSaldoCliente())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getDocupromo() == null ? 0 : this.getDocupromo().hashCode());
		result = 37
				* result
				+ (getNombrepromo() == null ? 0 : this.getNombrepromo()
						.hashCode());
		result = 37 * result
				+ (getAsesora() == null ? 0 : this.getAsesora().hashCode());
		result = 37
				* result
				+ (getSaldoCliente() == null ? 0 : this.getSaldoCliente()
						.hashCode());
		return result;
	}

}