
public class AirRanger implements FabricaRanger {

	private String name, color;
	private String elementoPrimario; 
	private int Age;
	private String agigantarse;
	private String caminarLento;
	private String golpear;
	private String volar;
	
	
	
	public AirRanger(String name, String volar, String color, String agigantarse, String caminarLento, String golpear, int Age) {
		this.name = name;
		this.color = color;
		this.agigantarse = agigantarse;
		this.caminarLento = caminarLento;
		this.golpear = golpear;
		this.volar = volar;
		this.Age = Age;
		
	}
	
	public String datosRanger() {
		return "Soy: " + this.name + "Vuelo por lo m�s alto, " + "soy de color:  " + this.color 
				+ "me agrando , golpeo fuerte" + " y tengo : " + this.Age + " a�os";
	}


	public boolean apilar(FabricaRanger monstruo) {
		return true;
	}

	public boolean desapilar(FabricaRanger monstruo) {
		return true;
	}

	public boolean encolar(FabricaRanger monstruo) {
		return true;
	}

	public boolean desencolar(FabricaRanger monstruo) {
		return true;
	}

	public FabricaRanger fabricar(String elemento) {
		return null;
	}
	
	
}
