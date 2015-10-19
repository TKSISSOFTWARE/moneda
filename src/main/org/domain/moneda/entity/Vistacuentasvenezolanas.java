package org.domain.moneda.entity;

// Generated 11/11/2012 08:28:28 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Vistacuentasvenezolanas generated by hbm2java
 */
@Entity
@Table(name = "vistacuentasvenezolanas", schema = "public")
public class Vistacuentasvenezolanas implements java.io.Serializable {

	private VistacuentasvenezolanasId id;

	public Vistacuentasvenezolanas() {
	}

	public Vistacuentasvenezolanas(VistacuentasvenezolanasId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "nombrebanco", column = @Column(name = "nombrebanco", length = 50)),
			@AttributeOverride(name = "numcuenta", column = @Column(name = "numcuenta", length = 25)),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre", length = 100)),
			@AttributeOverride(name = "saldo", column = @Column(name = "saldo", precision = 131089, scale = 0)),
			@AttributeOverride(name = "movimientos", column = @Column(name = "movimientos", precision = 131089, scale = 0)),
			@AttributeOverride(name = "depositos", column = @Column(name = "depositos", precision = 131089, scale = 0)),
			@AttributeOverride(name = "transferencias", column = @Column(name = "transferencias", precision = 131089, scale = 0)),
			@AttributeOverride(name = "codbanco", column = @Column(name = "codbanco", length = 3)) })
	public VistacuentasvenezolanasId getId() {
		return this.id;
	}

	public void setId(VistacuentasvenezolanasId id) {
		this.id = id;
	}

}