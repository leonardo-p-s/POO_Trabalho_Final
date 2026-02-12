
public class Veiculo {
	// Attributes
	private Motorista Condutor;
	private String Marca;
	private String Modelo;
	private int Ano;
	private String Placa;
	private String VIN;				// Número de chassi (vehicle id. number)
	private String Cor;
	private int CapacidPass;		// Capacidade de Passageiros
	private boolean Ativo;
	private String Status;			// Status para Viagens: Disponível/NãoDisponível/EmViagem/FinalizandoViagem
	
	private String Categoria;		// UberX / UberComfort / UberBlack
	// Como eh definida a categoria do veículo? Depende do modelo? Definido pelo usuario no cadastro?

	// Constructors
	public Veiculo(Motorista condut, String marca, String mod, int a, String p, String vn, String c, int cap) {
		setCondutor(condut);
		setMarca(marca);
		setModelo(mod);
		setAno(a);
		setPlaca(p);
		setVIN(vn);
		setCor(c);
		setCapacidPass(cap);
		setAtivo(false);					// Todo veiculo está inativo no momento do cadastro
		Condutor.AdicionaVeiculo(this);		// Veículo adicionado a lista de veículos do motorista
	}
	
	// Getters and Setters
	public Motorista getCondutor() {return Condutor;}
	public void setCondutor(Motorista condut) {Condutor = condut;}
	public String getMarca() {return Marca;}
	public void setMarca(String marca) {Marca = marca;}
	public String getModelo() {return Modelo;}
	public void setModelo(String modelo) {Modelo = modelo;}
	public int getAno() {return Ano;}
	public void setAno(int ano) {Ano = ano;}
	public String getPlaca() {return Placa;}
	public void setPlaca(String placa) {Placa = placa;}
	public String getVIN() {return VIN;}
	public void setVIN(String vIN) {VIN = vIN;}
	public String getCor() {return Cor;}
	public void setCor(String cor) {Cor = cor;}
	public int getCapacidPass() {return CapacidPass;}
	public void setCapacidPass(int capacidPass) {CapacidPass = capacidPass;}
	public boolean isAtivo() {return Ativo;}
	public void setAtivo(boolean ativo) {Ativo = ativo;}
	public String getStatus() {return Status;}
	public void setStatus(String status) {Status = status;}
	public String getCategoria() {return Categoria;}
	public void setCategoria(String categoria) {Categoria = categoria;}
	
	// Methods
	public void Ativa() {
		setAtivo(true);
		Condutor.Ativa();				// O motorista é ativado quando um de seus veículos é ativado
		}
	public void Desativa() {setAtivo(false);}
	public float CalculaCustoViagem(float DistKm) {return 0f;}
}
	// Requisito Extra 1: 	todo motorista e todo veículo estão desativados no momento do cadastro. 
	// 						Quando um de seus veículos é ativado no sistema pela UberLand, o motorista é ativado atomaticamente.
