package org.domain.moneda.entity;

// Generated 9/06/2015 03:23:02 PM by Hibernate Tools 3.2.4.GA

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.Length;

/**
 * Tasadolarpromotorparametro generated by hbm2java
 */
@Entity
@Table(name = "tasadolarpromotorparametro")
public class Tasadolarpromotorparametro implements java.io.Serializable {

	private int consecutivo;
	private Promotor promotor;
	private Franquicia franquicia;
	private Pais pais;
	private Establecimiento establecimiento;
	private Banco banco;
	private String tipocupo;
	private BigDecimal tasadolar;
	private Date fechainicio;
	private Date fechafin;
	private Date fechamod;
	private String usuariomod;

	public Tasadolarpromotorparametro() {
	}

	public Tasadolarpromotorparametro(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	public Tasadolarpromotorparametro(int consecutivo, Promotor promotor,
			Franquicia franquicia, Pais pais, Establecimiento establecimiento,
			Banco banco, String tipocupo, BigDecimal tasadolar,
			Date fechainicio, Date fechafin, Date fechamod, String usuariomod) {
		this.consecutivo = consecutivo;
		this.promotor = promotor;
		this.franquicia = franquicia;
		this.pais = pais;
		this.establecimiento = establecimiento;
		this.banco = banco;
		this.tipocupo = tipocupo;
		this.tasadolar = tasadolar;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.fechamod=fechamod;
		this.usuariomod=usuariomod;
	}

	@Id
	@Column(name = "consecutivo", unique = true, nullable = false)
	public int getConsecutivo() {
		return this.consecutivo;
	}

	public void setConsecutivo(int consecutivo) {
		this.consecutivo = consecutivo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "documento")
	public Promotor getPromotor() {
		return this.promotor;
	}

	public void setPromotor(Promotor promotor) {
		this.promotor = promotor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codfranquicia")
	public Franquicia getFranquicia() {
		return this.franquicia;
	}

	public void setFranquicia(Franquicia franquicia) {
		this.franquicia = franquicia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codpais")
	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigounico")
	public Establecimiento getEstablecimiento() {
		return this.establecimiento;
	}

	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codbanco")
	public Banco getBanco() {
		return this.banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Column(name = "tipocupo", length = 1)
	@Length(max = 1)
	public String getTipocupo() {
		return this.tipocupo;
	}

	public void setTipocupo(String tipocupo) {
		this.tipocupo = tipocupo;
	}

	@Column(name = "tasadolar", precision = 6)
	public BigDecimal getTasadolar() {
		return this.tasadolar;
	}

	public void setTasadolar(BigDecimal tasadolar) {
		this.tasadolar = tasadolar;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechainicio", length = 29)
	public Date getFechainicio() {
		return this.fechainicio;
	}

	public void setFechainicio(Date fechainicio) {
		this.fechainicio = fechainicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechafin", length = 29)
	public Date getFechafin() {
		return this.fechafin;
	}

	public void setFechafin(Date fechafin) {
		this.fechafin = fechafin;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechamod", length = 29)
	public Date getFechamod() {
		return fechamod;
	}

	public void setFechamod(Date fechamod) {
		this.fechamod = fechamod;
	}

	@Column(name = "usuariomod", length = 20)
	@Length(max = 20)
	public String getUsuariomod() {
		return usuariomod;
	}

	public void setUsuariomod(String usuariomod) {
		this.usuariomod = usuariomod;
	}

}
