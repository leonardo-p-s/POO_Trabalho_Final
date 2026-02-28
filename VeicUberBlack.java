
public class VeicUberBlack extends Veiculo {
	
	// Attributes	
	private boolean PossuiInteriorPrem;
	private boolean PossuiRodasLigaLev;
	private int CapacidadeMalas;
	
	private static float TarifaMinima = 6.00f;
	private static float CustoPorKm = 1.15f;
	
	// Constructors
	public VeicUberBlack(Motorista cond, String mar, String mod, int a, String p, String vn, String c, int cap, boolean ip, boolean rll, int cm) {
		super(cond, mar, mod, a, p, vn, c, cap);
		setPossuiInteriorPrem(ip);
		setPossuiRodasLigaLev(rll);
		setCapacidadeMalas(cm);
	}

	public boolean isPossuiInteriorPrem() {return PossuiInteriorPrem;}
	public void setPossuiInteriorPrem(boolean possuiInteriorPrem) {PossuiInteriorPrem = possuiInteriorPrem;}
	public boolean isPossuiRodasLigaLev() {return PossuiRodasLigaLev;}
	public void setPossuiRodasLigaLev(boolean possuiRodasLigaLev) {PossuiRodasLigaLev = possuiRodasLigaLev;}
	public int getCapacidadeMalas() {return CapacidadeMalas;}
	public void setCapacidadeMalas(int capacidadeMalas) {CapacidadeMalas = capacidadeMalas;}
	
	// Methods
	public float CalculaCustoViagem(float DistKm) {
		float CustoBasico = (DistKm * CustoPorKm) + TarifaMinima;
		CustoBasico = CustoBasico + (TarifaMinima * CapacidadeMalas);
		return CustoBasico;
	}
	public static float CalculaCustoViagemSolicitada(float DistKm) {
		return (DistKm * CustoPorKm) + TarifaMinima;
	}
}
