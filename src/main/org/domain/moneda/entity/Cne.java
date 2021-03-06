package org.domain.moneda.entity;

// Generated 30/10/2013 10:52:03 AM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.NotNull;

/**
 * Cne generated by hbm2java
 */
@Entity
@Table(name = "cne")
public class Cne implements java.io.Serializable {

	private CneId id;

	public Cne() {
	}

	public Cne(CneId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "nacionalidad", column = @Column(name = "nacionalidad", length = 2)),
			@AttributeOverride(name = "cedula", column = @Column(name = "cedula", nullable = false, length = 15)),
			@AttributeOverride(name = "primerApellido", column = @Column(name = "primer_apellido", length = 50)),
			@AttributeOverride(name = "segundoApellido", column = @Column(name = "segundo_apellido", length = 50)),
			@AttributeOverride(name = "primerNombre", column = @Column(name = "primer_nombre", length = 50)),
			@AttributeOverride(name = "segundoNombre", column = @Column(name = "segundo_nombre", length = 50)),
			@AttributeOverride(name = "estado", column = @Column(name = "estado", length = 20)),
			@AttributeOverride(name = "codCentro", column = @Column(name = "cod_centro", length = 12)) })
	@NotNull
	public CneId getId() {
		return this.id;
	}

	public void setId(CneId id) {
		this.id = id;
	}

}
