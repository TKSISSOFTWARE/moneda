package org.domain.moneda.entity;

// Generated 23/12/2011 07:58:00 AM by Hibernate Tools 3.2.4.GA

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.domain.moneda.entity.Asesor;
import org.domain.moneda.entity.Personal;
import org.domain.moneda.entity.Tarjeta;
import org.domain.moneda.entity.Tasabolivarnegociado;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotNull;

/**
 * Promotor generated by hbm2java
 */
@Entity
@Table(name = "promotor", schema = "public")
public class Promotor implements java.io.Serializable {

	private String documento;
	private Personal personal;
	private Asesor asesor;
	private Arrastrador arrastrador;
	private BigDecimal comisionviajero;
	private BigDecimal comisionarrastrador;
	private Set<Tasabolivarnegociado> tasabolivarnegociados = new HashSet<Tasabolivarnegociado>(
			0);
	private Set<Tarjeta> tarjetas = new HashSet<Tarjeta>(0);
	private Set<Cuentapromotor> cuentapromotors = new HashSet<Cuentapromotor>(0);
	private Set<Envios> envioses = new HashSet<Envios>(0);
	private Set<Promotorfranquicia> promotorfranquicias = new HashSet<Promotorfranquicia>(
			0);
	private Set<Promotorcomisiontx> promotorcomisiontxes = new HashSet<Promotorcomisiontx>(
			0);
	private Set<Promotortasa> promotortasas = new HashSet<Promotortasa>(0);
	private Set<Activacion> activacions = new HashSet<Activacion>(0);
	private Boolean tac;

	public Promotor() {
	}

	public Promotor(Personal personal) {
		this.personal = personal;
	}

	public Promotor(Personal personal, Asesor asesor, Arrastrador arrastrador,
			BigDecimal comisionviajero, BigDecimal comisionarrastrador,
			Set<Tasabolivarnegociado> tasabolivarnegociados,
			Set<Promotorcomisiontx> promotorcomisiontxes,
			Set<Tarjeta> tarjetas, Set<Cuentapromotor> cuentapromotors,
			Set<Envios> envioses, Set<Promotorfranquicia> promotorfranquicias,
			Set<Promotortasa> promotortasas, Set<Activacion> activacions, Boolean tac) {
		this.personal = personal;
		this.asesor = asesor;
		this.arrastrador = arrastrador;
		this.comisionviajero = comisionviajero;
		this.comisionarrastrador = comisionarrastrador;
		this.tasabolivarnegociados = tasabolivarnegociados;
		this.cuentapromotors = cuentapromotors;
		this.promotorcomisiontxes = promotorcomisiontxes;
		this.tarjetas = tarjetas;
		this.envioses = envioses;
		this.promotorfranquicias = promotorfranquicias;
		this.promotortasas = promotortasas;
		this.activacions = activacions;
		this.tac = tac;
	}

	//@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "personal"))
	@Id
	//@GeneratedValue(generator = "generator")
	@Column(name = "documento", unique = true, nullable = false, length = 15)
	@Length(max = 15)
	public String getDocumento() {
		return this.documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@NotNull
	//@Length(max = 15)
	public Personal getPersonal() {
		return this.personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "asesor")
	public Asesor getAsesor() {
		return this.asesor;
	}

	public void setAsesor(Asesor asesor) {
		this.asesor = asesor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "arrastrador")
	public Arrastrador getArrastrador() {
		return this.arrastrador;
	}

	public void setArrastrador(Arrastrador arrastrador) {
		this.arrastrador = arrastrador;
	}

	@Column(name = "comisionviajero", precision = 5, scale = 3)
	public BigDecimal getComisionviajero() {
		return this.comisionviajero;
	}

	public void setComisionviajero(BigDecimal comisionviajero) {
		this.comisionviajero = comisionviajero;
	}

	@Column(name = "comisionarrastrador", precision = 5, scale = 3)
	public BigDecimal getComisionarrastrador() {
		return this.comisionarrastrador;
	}

	public void setComisionarrastrador(BigDecimal comisionarrastrador) {
		this.comisionarrastrador = comisionarrastrador;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotor")
	public Set<Promotorcomisiontx> getPromotorcomisiontxes() {
		return this.promotorcomisiontxes;
	}

	public void setPromotorcomisiontxes(
			Set<Promotorcomisiontx> promotorcomisiontxes) {
		this.promotorcomisiontxes = promotorcomisiontxes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotor")
	public Set<Tasabolivarnegociado> getTasabolivarnegociados() {
		return this.tasabolivarnegociados;
	}

	public void setTasabolivarnegociados(
			Set<Tasabolivarnegociado> tasabolivarnegociados) {
		this.tasabolivarnegociados = tasabolivarnegociados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotor")
	public Set<Tarjeta> getTarjetas() {
		return this.tarjetas;
	}

	public void setTarjetas(Set<Tarjeta> tarjetas) {
		this.tarjetas = tarjetas;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotor")
	public Set<Envios> getEnvioses() {
		return this.envioses;
	}

	public void setEnvioses(Set<Envios> envioses) {
		this.envioses = envioses;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotor")
	public Set<Cuentapromotor> getCuentapromotors() {
		return this.cuentapromotors;
	}

	public void setCuentapromotors(Set<Cuentapromotor> cuentapromotors) {
		this.cuentapromotors = cuentapromotors;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotor")
	public Set<Promotorfranquicia> getPromotorfranquicias() {
		return this.promotorfranquicias;
	}

	public void setPromotorfranquicias(
			Set<Promotorfranquicia> promotorfranquicias) {
		this.promotorfranquicias = promotorfranquicias;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotor")
	public Set<Promotortasa> getPromotortasas() {
		return this.promotortasas;
	}

	public void setPromotortasas(Set<Promotortasa> promotortasas) {
		this.promotortasas = promotortasas;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotor")
	public Set<Activacion> getActivacions() {
		return this.activacions;
	}

	public void setActivacions(Set<Activacion> activacions) {
		this.activacions = activacions;
	}
	
	@Column(name = "tac")
	public Boolean getTac() {
		return tac;
	}

	public void setTac(Boolean tac) {
		this.tac = tac;
	}
	
	
	

}