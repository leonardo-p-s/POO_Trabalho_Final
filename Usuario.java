import javax.swing.JOptionPane;

public class Usuario {
	// Attributes
	private String Login;
	private String Nome;
	private String NroCelular;
	private String CPF;
	private String email;
	private String DataNasc;
	private String Sexo;
	private String FormaPagPref;
	
	private int NroCorridas = 0;
	private int NroCorridasAval;				// Nro de notas de avaliação recebidas de motoristas
	private float NotaMediaAval;
	
	private static int VipTH;					// X: Nro de viagens p/ se tornar ClienteVIP
	
	// Constructors
	public Usuario() {};
	public Usuario(String n, String cpf) {
		setNome(n);
		setCPF(cpf);
	}
	public Usuario(String n, String cel, String cpf, String email, String dn, String sex, String fp) {
		setNome(n);
		setNroCelular(cel);
		setCPF(cpf);
		setEmail(email);
		setDataNasc(dn);
		setSexo(sex);
		setFormaPagPref(fp);
	}
	
	// Getters
	public String getLogin() {return Login;}
	public String getNome() {return Nome;}
	public String getNroCelular() {return NroCelular;}
	public String getCPF() {return CPF;}
	public String getEmail() {return email;}
	public String getDataNasc() {return DataNasc;}
	public String getSexo() {return Sexo;}
	public String getFormaPagPref() {return FormaPagPref;}
	public int getNroCorridas() {return NroCorridas;}
	public float getNotaMediaAval() {return NotaMediaAval;}
	public static int getVipTH() {return VipTH;}
	public int getNroCorridasAval() {return NroCorridasAval;}

	// Setters
	public void setLogin(String login) {Login = login;}
	public void setNome(String nome) { 
		if((nome.length() > 1) && (nome.matches("^[\\p{L} ]+$")))
			Nome = nome;}
	public void setNroCelular(String nroCelular) {NroCelular = nroCelular;}
	public void setCPF(String cpf) {
		if (ValidaCPF.isCPF(cpf))
			CPF = cpf;
		else 
        	JOptionPane.showMessageDialog(null,  "CPF inválido!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
	public void setEmail(String email) {this.email = email;}
	public void setDataNasc(String dataNasc) {DataNasc = dataNasc;}
	public void setSexo(String sexo) {Sexo = sexo;}
	public void setFormaPagPref(String formaPagPref) {FormaPagPref = formaPagPref;}
	public void setNroCorridas(int nroCorridas) {NroCorridas = nroCorridas;}
	public void setNotaMediaAval(float notaMediaAval) {NotaMediaAval = notaMediaAval;}
	public static void setVipTH(int x) {VipTH = x;}
	public void setNroCorridasAval(int nroCorridasAval) {NroCorridasAval = nroCorridasAval;}
	
	// Methods
	public void AdicionaCorrida() {
		setNroCorridas(NroCorridas += 1);
	}
	public void AdicionaAval(int Nota) {
		float NotaTotal = NroCorridasAval * NotaMediaAval;
		setNroCorridasAval(NroCorridasAval += 1);
		NotaTotal += Nota;
		setNotaMediaAval(NotaTotal / NroCorridasAval);		// Atualiza nota média
	}

}
