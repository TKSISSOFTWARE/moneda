package org.domain.moneda.entity;

// Generated 7/10/2015 05:14:39 PM by Hibernate Tools 3.2.4.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.validator.NotNull;

/**
 * AuditTransferencia generated by hbm2java
 */
@Entity
@Table(name = "audit_transferencia")
public class AuditTransferencia implements java.io.Serializable {

	private AuditTransferenciaId id;

	public AuditTransferencia() {
	}

	public AuditTransferencia(AuditTransferenciaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "consecutivo", column = @Column(name = "consecutivo", nullable = false)),
			@AttributeOverride(name = "preciobolivar", column = @Column(name = "preciobolivar", precision = 5)),
			@AttributeOverride(name = "tipobolivar", column = @Column(name = "tipobolivar", length = 3)),
			@AttributeOverride(name = "valorbolivar", column = @Column(name = "valorbolivar", precision = 12, scale = 0)),
			@AttributeOverride(name = "numcuenta", column = @Column(name = "numcuenta", length = 25)),
			@AttributeOverride(name = "numcuentapromotor", column = @Column(name = "numcuentapromotor", length = 25)),
			@AttributeOverride(name = "documentopromotor", column = @Column(name = "documentopromotor", length = 15)),
			@AttributeOverride(name = "preciocompra", column = @Column(name = "preciocompra", precision = 5)),
			@AttributeOverride(name = "precioasesor", column = @Column(name = "precioasesor", precision = 5)),
			@AttributeOverride(name = "usuariomod", column = @Column(name = "usuariomod", length = 20)),
			@AttributeOverride(name = "fechamod", column = @Column(name = "fechamod", length = 22)) })
	@NotNull
	public AuditTransferenciaId getId() {
		return this.id;
	}

	public void setId(AuditTransferenciaId id) {
		this.id = id;
	}

}