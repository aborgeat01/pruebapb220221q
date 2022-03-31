package zzz;

public class Persona {
 
	private String nombre;
	private String apellido;
	public String getApellido() {
		return apellido.toLowerCase();
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
