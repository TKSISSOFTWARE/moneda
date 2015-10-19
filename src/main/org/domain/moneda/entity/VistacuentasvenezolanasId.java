package org.domain.moneda.entity;

// Generated 11/11/2012 08:28:28 PM by Hibernate Tools 3.2.4.GA

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.validator.Length;

/**
 * VistacuentasvenezolanasId generated by hbm2java
 */
@Embeddable
public class VistacuentasvenezolanasId implements java.io.Serializable {

	private String nombrebanco;
	private String numcuenta;
	private String nombre;
	private BigDecimal saldo;
	private BigDecimal movimientos;
	private BigDecimal depositos;
	private BigDecimal transferencias;
	private String codbanco;

	public VistacuentasvenezolanasId() {
	}

	public VistacuentasvenezolanasId(String nombrebanco, String numcuenta,
			String nombre, BigDecimal saldo, BigDecimal movimientos,
			BigDecimal depositos, BigDecimal transferencias, String codbanco) {
		this.nombrebanco = nombrebanco;
		this.numcuenta = numcuenta;
		this.nombre = nombre;
		this.saldo = saldo;
		this.movimientos = movimientos;
		this.depositos = depositos;
		this.transferencias = transferencias;
		this.codbanco = codbanco;
	}

	@Column(name = "nombrebanco", length = 50)
	@Length(max = 50)
	public String getNombrebanco() {
		return this.nombrebanco;
	}

	public void setNombrebanco(String nombrebanco) {
		this.nombrebanco = nombrebanco;
	}

	@Column(name = "numcuenta", length = 25)
	@Length(max = 25)
	public String getNumcuenta() {
		return this.numcuenta;
	}

	public void setNumcuenta(String numcuenta) {
		this.numcuenta = numcuenta;
	}

	@Column(name = "nombre", length = 100)
	@Length(max = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "saldo", precision = 131089, scale = 0)
	public BigDecimal getSaldo() {
		return this.saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Column(name = "movimientos", precision = 131089, scale = 0)
	public BigDecimal getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(BigDecimal movimientos) {
		this.movimientos = movimientos;
	}

	@Column(name = "depositos", precision = 131089, scale = 0)
	public BigDecimal getDepositos() {
		return this.depositos;
	}

	public void setDepositos(BigDecimal depositos) {
		this.depositos = depositos;
	}

	@Column(name = "transferencias", precision = 131089, scale = 0)
	public BigDecimal getTransferencias() {
		return this.transferencias;
	}

	public void setTransferencias(BigDecimal transferencias) {
		this.transferencias = transferencias;
	}

	@Column(name = "codbanco", length = 3)
	@Length(max = 3)
	public String getCodbanco() {
		return this.codbanco;
	}

	public void setCodbanco(String codbanco) {
		this.codbanco = codbanco;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VistacuentasvenezolanasId))
			return false;
		VistacuentasvenezolanasId castOther = (VistacuentasvenezolanasId) other;

		return ((this.getNombrebanco() == castOther.getNombrebanco()) || (this
				.getNombrebanco() != null
				&& castOther.getNombrebanco() != null && this.getNombrebanco()
				.equals(castOther.getNombrebanco())))
				&& ((this.getNumcuenta() == castOther.getNumcuenta()) || (this
						.getNumcuenta() != null
						&& castOther.getNumcuenta() != null && this
						.getNumcuenta().equals(castOther.getNumcuenta())))
				&& ((this.getNombre() == castOther.getNombre()) || (this
						.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre()
						.equals(castOther.getNombre())))
				&& ((this.getSaldo() == castOther.getSaldo()) || (this
						.getSaldo() != null
						&& castOther.getSaldo() != null && this.getSaldo()
						.equals(castOther.getSaldo())))
				&& ((this.getMovimientos() == castOther.getMovimientos()) || (this
						.getMovimientos() != null
						&& castOther.getMovimientos() != null && this
						.getMovimientos().equals(castOther.getMovimientos())))
				&& ((this.getDepositos() == castOther.getDepositos()) || (this
						.getDepositos() != null
						&& castOther.getDepositos() != null && this
						.getDepositos().equals(castOther.getDepositos())))
				&& ((this.getTransferencias() == castOther.getTransferencias()) || (this
						.getTransferencias() != null
						&& castOther.getTransferencias() != null && this
						.getTransferencias().equals(
								castOther.getTransferencias())))
				&& ((this.getCodbanco() == castOther.getCodbanco()) || (this
						.getCodbanco() != null
						&& castOther.getCodbanco() != null && this
						.getCodbanco().equals(castOther.getCodbanco())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getNombrebanco() == null ? 0 : this.getNombrebanco()
						.hashCode());
		result = 37 * result
				+ (getNumcuenta() == null ? 0 : this.getNumcuenta().hashCode());
		result = 37 * result
				+ (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result
				+ (getSaldo() == null ? 0 : this.getSaldo().hashCode());
		result = 37
				* result
				+ (getMovimientos() == null ? 0 : this.getMovimientos()
						.hashCode());
		result = 37 * result
				+ (getDepositos() == null ? 0 : this.getDepositos().hashCode());
		result = 37
				* result
				+ (getTransferencias() == null ? 0 : this.getTransferencias()
						.hashCode());
		result = 37 * result
				+ (getCodbanco() == null ? 0 : this.getCodbanco().hashCode());
		return result;
	}

}