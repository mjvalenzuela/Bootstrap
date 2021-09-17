package modelo;

public class Cliente {
	private String nombre;
	private String documento;
	private String telefono;
	private String direccion;
	private String email;
	
	public Cliente(String pNombre, String pDocumento, String pTelefono,
			String pDireccion, String pEmail) {
		nombre = pNombre;
		documento = pDocumento;
		telefono = pTelefono;
		direccion = pDireccion;
		email = pEmail;
	}
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public String obtenerDocumento() {
		return documento;
	}
	
	public String obtenerTelefono() {
		return telefono;
	}
	
	public String obtenerDireccion() {
		return direccion;
	}
	
	public String obtenerEmail() {
		return email;
	}
}