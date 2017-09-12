
/**
 *
 * @author Ana Godínez
 */
public class StoneRanger implements FabricaRanger {
	
	
	private String name, color;
	private String elementoPrimario; 
	private int Age;
	private String agigantarse;
	private String caminarLento;
	private String golpear;
	
	
	
	
	public StoneRanger(String name, String color, String agigantarse, String caminarLento, String golpear, int Age) {
		this.name = name;
		this.color = color;
		this.agigantarse = agigantarse;
		this.caminarLento = caminarLento;
		this.golpear = golpear;
		this.Age = Age;
		
	}
	
	public String datosRanger() {
		return "Soy: " + this.name + "Me gusta caminar enmedio de las plantas, " + "soy de color:  " + this.color 
				+ "me agrando , golpeo fuerte" + " y tengo : " + this.Age + " años";
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
