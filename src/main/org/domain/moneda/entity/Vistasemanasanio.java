package org.domain.moneda.entity;

// Generated 27/04/2015 11:47:31 AM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Vistasemanasanio generated by hbm2java
 */
@Entity
@Table(name = "vistasemanasanio")
public class Vistasemanasanio implements java.io.Serializable {

	private VistasemanasanioId id;

	public Vistasemanasanio() {
	}

	public Vistasemanasanio(VistasemanasanioId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "numsemana", column = @Column(name = "numsemana")),
			@AttributeOverride(name = "fechaini", column = @Column(name = "fechaini", length = 13)),
			@AttributeOverride(name = "fechafin", column = @Column(name = "fechafin", length = 13)) })
	public VistasemanasanioId getId() {
		return this.id;
	}

	public void setId(VistasemanasanioId id) {
		this.id = id;
	}

}