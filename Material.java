package edificio;

public class Material {

	private double cancelamiento;
	private String nombre;
	
	
	public Material(double cancelamiento, String nombre) {
		this.cancelamiento = cancelamiento;
		this.nombre = nombre;
	}
	
	public double getCancelamiento() {
		return cancelamiento;
	}
	public String getNombre() {
		return nombre;
	}
}
