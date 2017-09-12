
public class PrincipalRangers {

	public static void main(String[] args) {
		
		
		FabricaRanger FR, SR, AR,WR;
		
		AR = new AirRanger("Pedro ", "", " Verde ", "", "", "", 19);
		System.out.println(AR.datosRanger());
		
		SR = new StoneRanger("Irma ", "Gris", "", "", "", 40);
		System.out.println(SR.datosRanger());
		
		FR = new FireRanger("Loco Steve ","Rojo"," ","","","",90);
		System.out.println(FR.datosRanger());
		
		WR = new WaterRanger("Gabs", "Celeste", "","", "", 15);
		System.out.println(WR.datosRanger());
		
	}
	
}
