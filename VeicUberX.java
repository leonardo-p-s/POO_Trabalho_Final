
public class VeicUberX extends Veiculo {
	// Attributes
	private boolean PossuiAC;
	private boolean PossuiConfBasico;
	
	private static float TarifaMinima;
	private static float CustoPorKm;
	
	// Constructors
	public VeicUberX(Motorista condut, String marca, String mod, int a, String p, String vn, String c, int cap, boolean ac, boolean cb) {
		super(condut, marca, mod, a, p, vn, c, cap);
		setPossuiAC(ac);
		setPossuiConfBasico(cb);
	}
	
	public boolean isPossuiAC() {return PossuiAC;}
	public void setPossuiAC(boolean possuiAC) {PossuiAC = possuiAC;}
	public boolean isPossuiConfBasico() {return PossuiConfBasico;}
	public void setPossuiConfBasico(boolean possuiConfBasico) {PossuiConfBasico = possuiConfBasico;}
	
	// Methods
	public float CalculaCustoViagem(float DistKm) {
		float CustoBasico = (DistKm * CustoPorKm) + TarifaMinima;
		if(PossuiAC || PossuiConfBasico)
			CustoBasico = CustoBasico + TarifaMinima;
		return CustoBasico;
	}
}
