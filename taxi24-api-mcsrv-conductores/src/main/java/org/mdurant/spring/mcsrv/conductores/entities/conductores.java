package org.mdurant.spring.mcsrv.conductores.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="conductores")
public class Conductores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", unique = true, nullable = false, length = 20)
	private String nombre;
	
	@Column(name = "apellido", unique = true, nullable = false, length = 20)
	private String apellido;
	
	@Column(name = "email", unique = true, nullable = false, length = 100)
	private String email;
	
	@Column(name = "codigo_ci", unique = true, nullable = false, length = 20)
	private String ci_code;
	
	@Column(name ="disponible", unique = false)
	private Boolean disponible;
	
	@Column(name ="radio3km", unique = false)
	private Boolean radio3km;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCi_code() {
		return ci_code;
	}

	public void setCi_code(String ci_code) {
		this.ci_code = ci_code;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponoble(Boolean disponible) {
		this.disponible = disponible;
	}

	public Boolean getRadio3km() {
		return radio3km;
	}

	public void setRadio3km(Boolean radio3km) {
		this.radio3km = radio3km;
	}
	
	

}
