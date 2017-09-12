
public class FireRanger implements FabricaRanger {
	
	private String name, color;
	private String elementoPrimario; 
	private int Age;
	private String agigantarse;
	private String caminarLento;
	private String golpear;
	private String quemar;
	
		
	public FireRanger(String name, String color, String quemar, String agigantarse, String caminarLento, String golpear, int Age) {
		this.name = name;
		this.color = color;
		this.quemar = quemar;
		this.agigantarse = agigantarse;
		this.caminarLento = caminarLento;
		this.golpear = golpear;
		this.Age = Age;
		
	}
	
	public String datosRanger() {
		return "Soy: " + this.name + "Me gusta quemar a todo lo que se me atraviese en mi camino, " + "soy de color:  " + this.color 
				+ "me agrando , golpeo fuerte" + " y tengo: " + this.Age + " años";
	}


	public boolean apilar(FabricaRanger monstruo) {
		return false;
	}

	public boolean desapilar(FabricaRanger monstruo) {
		return false;
	}

	public boolean encolar(FabricaRanger monstruo) {
		return false;
	}

	public boolean desencolar(FabricaRanger monstruo) {
		return false;
	}

	public FabricaRanger fabricar(String elemento) {
		return null;
	}
	


}
