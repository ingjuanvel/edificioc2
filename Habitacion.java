package edificio;

public class Habitacion {
	private String numero;
	private Material[] paredes;
	private Material techo;
	private Material piso;
	private String[] adyacencia;
	
	Habitacion(Material[] paredes,Material techo, Material piso, String numero){
		this.paredes=paredes;
		this.piso=piso;
		this.techo=techo;
		this.numero=numero;
	}

	public void addAdyacencia(String[] adyacencia){
		this.adyacencia=adyacencia;
	}
	
	public void getAdyacencia() {
		if (adyacencia[0]!=null) {
			System.out.println("Es adyacente hacia el lado con la "+ adyacencia[0]);
		}
		if (adyacencia[1]!=null) {
			System.out.println("Es adyacente hacia arriba con la "+ adyacencia[1]);
		}
		if (adyacencia[2]!=null) {
			System.out.println("Es adyacente hacia abajo con la "+ adyacencia[2]);
		}
	}
	
	public void getMateriales() {
		System.out.println("Tiene 2 ventanas de vidrio cada una con un cancelamiento acustico de " +paredes[0].getCancelamiento());
		System.out.println("Tiene 1 puerta de madera con un cancelamiento acustico de " +paredes[3].getCancelamiento());
		System.out.println("Tiene 1 pared de ladrillo pintado con un cancelamiento acustico de " +paredes[2].getCancelamiento());
		System.out.println("Tiene 1 piso y 1 techo de hormigon revocado con un cancelamiento acustico de " + piso.getCancelamiento());
	}
	
	public String getNumero() {
		return numero;
	}
	
	public Material[] getParedes() {
		return paredes;
	}
 
	public Material getTecho() {
		return techo;
	}

	public Material getPiso() {
		return piso;
	}
	
}
