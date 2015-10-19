package org.domain.moneda.entity;

// Generated 30/10/2013 10:52:03 AM by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * CneId generated by hbm2java
 */
@Embeddable
public class CneId implements java.io.Serializable {

	private String nacionalidad;
	private String cedula;
	private String primerApellido;
	private String segundoApellido;
	private String primerNombre;
	private String segundoNombre;
	private String estado;
	private String codCentro;

	public CneId() {
	}

	public CneId(String cedula) {
		this.cedula = cedula;
	}

	public CneId(String nacionalidad, String cedula, String primerApellido,
			String segundoApellido, String primerNombre, String segundoNombre,
			String estado, String codCentro) {
		this.nacionalidad = nacionalidad;
		this.cedula = cedula;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.estado = estado;
		this.codCentro = codCentro;
	}

	@Column(name = "nacionalidad", length = 2)
	@Length(max = 2)
	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Column(name = "cedula", nullable = false, length = 15)
	@NotNull
	@Length(max = 15)
	public String getCedula() {
		return this.cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	@Column(name = "primer_apellido", length = 50)
	@Length(max = 50)
	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	@Column(name = "segundo_apellido", length = 50)
	@Length(max = 50)
	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	@Column(name = "primer_nombre", length = 50)
	@Length(max = 50)
	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	@Column(name = "segundo_nombre", length = 50)
	@Length(max = 50)
	public String getSegundoNombre() {
		return this.segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	@Column(name = "estado", length = 20)
	@Length(max = 20)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name = "cod_centro", length = 12)
	@Length(max = 12)
	public String getCodCentro() {
		return this.codCentro;
	}

	public void setCodCentro(String codCentro) {
		this.codCentro = codCentro;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CneId))
			return false;
		CneId castOther = (CneId) other;

		return ((this.getNacionalidad() == castOther.getNacionalidad()) || (this
				.getNacionalidad() != null
				&& castOther.getNacionalidad() != null && this
				.getNacionalidad().equals(castOther.getNacionalidad())))
				&& ((this.getCedula() == castOther.getCedula()) || (this
						.getCedula() != null
						&& castOther.getCedula() != null && this.getCedula()
						.equals(castOther.getCedula())))
				&& ((this.getPrimerApellido() == castOther.getPrimerApellido()) || (this
						.getPrimerApellido() != null
						&& castOther.getPrimerApellido() != null && this
						.getPrimerApellido().equals(
								castOther.getPrimerApellido())))
				&& ((this.getSegundoApellido() == castOther
						.getSegundoApellido()) || (this.getSegundoApellido() != null
						&& castOther.getSegundoApellido() != null && this
						.getSegundoApellido().equals(
								castOther.getSegundoApellido())))
				&& ((this.getPrimerNombre() == castOther.getPrimerNombre()) || (this
						.getPrimerNombre() != null
						&& castOther.getPrimerNombre() != null && this
						.getPrimerNombre().equals(castOther.getPrimerNombre())))
				&& ((this.getSegundoNombre() == castOther.getSegundoNombre()) || (this
						.getSegundoNombre() != null
						&& castOther.getSegundoNombre() != null && this
						.getSegundoNombre()
						.equals(castOther.getSegundoNombre())))
				&& ((this.getEstado() == castOther.getEstado()) || (this
						.getEstado() != null
						&& castOther.getEstado() != null && this.getEstado()
						.equals(castOther.getEstado())))
				&& ((this.getCodCentro() == castOther.getCodCentro()) || (this
						.getCodCentro() != null
						&& castOther.getCodCentro() != null && this
						.getCodCentro().equals(castOther.getCodCentro())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getNacionalidad() == null ? 0 : this.getNacionalidad()
						.hashCode());
		result = 37 * result
				+ (getCedula() == null ? 0 : this.getCedula().hashCode());
		result = 37
				* result
				+ (getPrimerApellido() == null ? 0 : this.getPrimerApellido()
						.hashCode());
		result = 37
				* result
				+ (getSegundoApellido() == null ? 0 : this.getSegundoApellido()
						.hashCode());
		result = 37
				* result
				+ (getPrimerNombre() == null ? 0 : this.getPrimerNombre()
						.hashCode());
		result = 37
				* result
				+ (getSegundoNombre() == null ? 0 : this.getSegundoNombre()
						.hashCode());
		result = 37 * result
				+ (getEstado() == null ? 0 : this.getEstado().hashCode());
		result = 37 * result
				+ (getCodCentro() == null ? 0 : this.getCodCentro().hashCode());
		return result;
	}

}