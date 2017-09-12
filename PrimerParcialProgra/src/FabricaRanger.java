
public interface FabricaRanger {

	public String datosRanger();
		  
    public boolean apilar(FabricaRanger monstruo); //Monstruo
    public boolean desapilar(FabricaRanger monstruo);
    public boolean encolar(FabricaRanger monstruo);
    public boolean desencolar(FabricaRanger monstruo);
    public FabricaRanger fabricar(String elemento);
}
