package aplica.upn.edu.app.model;

import java.util.Date;

public class Empleado {

@Override
	public String toString() {
		return "Empleado [id=" + id + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", cargo=" + cargo
				+ ", telefono=" + telefono + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", estado="
				+ estado + ", imagen=" + imagen + ", getId()=" + getId() + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getCargo()=" + getCargo() + ", getTelefono()=" + getTelefono()
				+ ", getFechaInicio()=" + getFechaInicio() + ", getFechaFin()=" + getFechaFin() + ", getEstado()="
				+ getEstado() + ", getImagen()=" + getImagen() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
private int id;
private String Nombre;
private String Apellido;
private String cargo;
private int telefono;
private Date fechaInicio;
private Date fechaFin;
private String estado;
private String imagen;
}
