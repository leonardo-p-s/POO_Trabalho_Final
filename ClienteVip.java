
public class ClienteVip extends Usuario{
	// Attributes
	private float PorcDesconto;
	
	// Constructors
	public ClienteVip(String l, String n, String cel, String cpf, String email, String dn, String sex, String fp, int nc) {
		super(l, n, cel, cpf, email, dn, sex, fp);
		super.setNroCorridas(nc);
		setPorcDesconto(nc);
	}

	public float getPorcDesconto() {return PorcDesconto;}

	public void setPorcDesconto(int nroCorridas) {
		if(nroCorridas > super.getVipTH() && nroCorridas < 1.2 * super.getVipTH())
			PorcDesconto = 0.05f;
		if(nroCorridas >= 1.2 * super.getVipTH() && nroCorridas < 1.5 * super.getVipTH())
			PorcDesconto = 0.075f;
		if(nroCorridas >= 1.5 * super.getVipTH())
			PorcDesconto = 0.1f;
	}
}
