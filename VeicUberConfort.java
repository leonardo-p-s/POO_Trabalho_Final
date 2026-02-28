
public class VeicUberConfort extends Veiculo {
	// Attributes
	private boolean PossuiEspacoExtra;
	private boolean PossuiBancRecl;
	private boolean PossuiACDualZone;
	
	private static float TarifaMinima = 5.0f;
	private static float CustoPorKm = 0.95f;
	
	// Constructors
	public VeicUberConfort(Motorista condut, String marca, String mod, int a, String p, String vn, String c, int cap, boolean ee, boolean br, boolean acdz) {
		super(condut, marca, mod, a, p, vn, c, cap);
		setPossuiEspacoExtra(ee);
		setPossuiBancRecl(br);
		setPossuiACDualZone(acdz);
		
	}
	// Getters and Setters
	public boolean isPossuiEspacoExtra() {return PossuiEspacoExtra;}
	public void setPossuiEspacoExtra(boolean possuiEspacoExtra) {PossuiEspacoExtra = possuiEspacoExtra;}
	public boolean isPossuiBancRecl() {return PossuiBancRecl;}
	public void setPossuiBancRecl(boolean possuiBancRecl) {PossuiBancRecl = possuiBancRecl;}
	public boolean isPossuiACDualZone() {return PossuiACDualZone;}
	public void setPossuiACDualZone(boolean possuiACDualZone) {PossuiACDualZone = possuiACDualZone;}
	
	// Methods
	public float CalculaCustoViagem(float DistKm) {
		float CustoBasico = (DistKm * CustoPorKm) + TarifaMinima;
		if(PossuiACDualZone || PossuiEspacoExtra)
			CustoBasico = CustoBasico + (2 * TarifaMinima);
		return CustoBasico;
	}
	public static float CalculaCustoViagemSolicitada(float DistKm) {
		return (DistKm * CustoPorKm) + TarifaMinima;
	}
}
