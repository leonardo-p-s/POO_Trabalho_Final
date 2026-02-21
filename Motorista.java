
import java.util.List;

import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Motorista {
	// Attributes
	private String Login;
	private String Nome;
	private String NomeSocial;
	private String CPF;
	private String CNH;
	private String Endereco;
	private String DataNasc;
	private boolean Ativo;
	private List<Veiculo> Veiculos;
	
	
	private int NroCorridas;
	private int NroCorridasAval;				// Nro de notas de avaliação recebidas de clientes
	private float NotaMediaAval;
	
	// Constructors
	public Motorista(String n, String ns, String cpf, String cnh, String end, String dn) {
		setNome(n);
		setNomeSocial(ns);
		setCPF(cpf);
		setCNH(cnh);
		setEndereco(end);
		setDataNasc(dn);
		setAtivo(false);				// Todo motorista está inativo no momento do cadastro
		Veiculos = new ArrayList<>();	
	}
	
	// Getters and Setters
	public String getLogin() {return Login;}
	public void setLogin(String login) {Login = login;}
	public String getNome() {return Nome;}
	public void setNome(String nome) { 
		if((nome.length() > 1) && (nome.matches("^[\\p{L} ]+$")))
			Nome = nome;}
	public String getNomeSocial() { return NomeSocial;}
	public void setNomeSocial(String nomeSocial) { NomeSocial = nomeSocial;}
	public String getCPF() { return CPF;}
	public void setCPF(String cpf) {
        if (ValidaCPF.isCPF(cpf) == true)
        	CPF = cpf;
        else 
        	JOptionPane.showMessageDialog(null,  "CPF inválido!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
	public String getCNH() {return CNH;}
	public void setCNH(String cNH) {CNH = cNH;}
	public String getEndereco() {return Endereco;}
	public void setEndereco(String endereco) {Endereco = endereco;}
	public String getDataNasc() {return DataNasc;}
	public void setDataNasc(String dataNasc) {DataNasc = dataNasc;}
	public boolean isAtivo() {return Ativo;}
	public void setAtivo(boolean ativo) {Ativo = ativo;}
	public int getNroCorridas() {return NroCorridas;}
	public void setNroCorridas(int nroCorridas) {NroCorridas = nroCorridas;}
	public float getNotaMediaAval() {return NotaMediaAval;}
	public void setNotaMediaAval(float notaMediaAval) {NotaMediaAval = notaMediaAval;}
	public List<Veiculo> getVeiculos() {return Veiculos;}
	//public void setVeiculos(List<Veiculo> veiculos) {Veiculos = veiculos;}
	public int getNroCorridasAval() {return NroCorridasAval;}
	public void setNroCorridasAval(int nroCorridasAval) {NroCorridasAval = nroCorridasAval;}


	// Methods
	public void Ativa() {setAtivo(true);}
	public void Desativa() {
		setAtivo(false);
		for(Veiculo v : Veiculos)			// Quando um motorista é desativado, todos os seus veículos são desativados.
			v.Desativa();
		}
	public void AdicionaVeiculo(Veiculo v) {Veiculos.add(v);}
	public void RemoveVeiculo(Veiculo v) {Veiculos.remove(v);}
	
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
