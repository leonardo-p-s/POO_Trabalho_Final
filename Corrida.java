import java.io.Serializable;

public class Corrida implements Serializable{
	// Attributes
	private Usuario Solicitante;
	private String Origem;
	private String Destino;
	private String DataSolicit;
	private String HoraSolicit;
	private String CategoriaVeic;				// UberX, UberConfort, UberBlack
	
	private Veiculo veiculo;
	private Motorista motorista;				// Motorista associado ao veículo
	private String HoraChegadaMotOrigem;
	private String HoraFimCorrida;
	private String LocalFimCorrida;
	private int DuracaoViagem;					// em Minutos
	private float DistanciaPercorrida;			// em Km
	
	private float ValorTotalViagem;
	private float ValorExtra;					// Gorjeta
	private static float PorcentUberLand = 0.6f;
	private float ValorUberL;					// ValorTotalViagem * PorcentUberLand
	private float ValorMotorista;				// Restante do valor total + ValorExtra (gorjeta)
	
	private String StatusCorrida;				// Solicitada, Aceita, Iniciada, Finalizada
	private String StatusFinal;					// Cancelada antes do início, cancelada durante a viagem ou realizada
	private String CanceladoPor;				// Motorista ou Cliente
	private String FormaPagamento;				// Cartao, PIX, Dinheiro,...
	
	// Constructors
	public Corrida(Usuario s, String or, String dest, String c, String d, String h) {
		setSolicitante(s);
		//setVeiculo(v);	// A corrida é criada no momento da solicitacao pelo usuario. 
							//O veículo só é definido quando a corrida é aceita pelo motorista
		setOrigem(or);
		setDestino(dest);
		setCategoriaVeic(c);
		setDataSolicit(d);
		setHoraSolicit(h);
		setStatusCorrida("Solicitada");
		setValorTotalViagem(DistPercorrida(or, dest));			// Valor inicial, baseado na distancia Prevista/Esperada
	}
	
	// Getters and Setters
	public Usuario getSolicitante() {return Solicitante;}
	public void setSolicitante(Usuario solicitante) {Solicitante = solicitante;}
	public String getOrigem() {return Origem;}
	public void setOrigem(String origem) {Origem = origem;}
	public String getDestino() {return Destino;}
	public void setDestino(String destino) {Destino = destino;}
	public String getCategoriaVeic() {return CategoriaVeic;}
	public void setCategoriaVeic(String categoriaVeic) {CategoriaVeic = categoriaVeic;}
	public String getDataSolicit() {return DataSolicit;}
	public void setDataSolicit(String dataSolicit) {DataSolicit = dataSolicit;}
	public String getHoraSolicit() {return HoraSolicit;}
	public void setHoraSolicit(String horaSolicit) {HoraSolicit = horaSolicit;}
	public String getHoraChegadaMotOrigem() {return HoraChegadaMotOrigem;}
	public void setHoraChegadaMotOrigem(String horaChegadaMotOrigem) {HoraChegadaMotOrigem = horaChegadaMotOrigem;}
	public String getHoraFimCorrida() {return HoraFimCorrida;}
	public void setHoraFimCorrida(String horaFimCorrida) {HoraFimCorrida = horaFimCorrida;}	
	public int getDuracaoViagem() {return DuracaoViagem;}
	public void setDuracaoViagem(int duracaoViagem) {DuracaoViagem = duracaoViagem;}
	public float getDistanciaPercorrida() {return DistanciaPercorrida;}
	public void setDistanciaPercorrida(float distanciaPercorrida) {DistanciaPercorrida = distanciaPercorrida;}
	public float getValorTotalViagem() {return ValorTotalViagem;}
	public void setValorTotalViagem(float DistKm) {
		if(veiculo != null)
			ValorTotalViagem = veiculo.CalculaCustoViagem(DistKm);
		else if (CategoriaVeic == "UberX")
			ValorTotalViagem = VeicUberX.CalculaCustoViagemSolicitada(DistKm);
		else if (CategoriaVeic == "UberConfort")
			ValorTotalViagem = VeicUberConfort.CalculaCustoViagemSolicitada(DistKm);
		else
			ValorTotalViagem = VeicUberBlack.CalculaCustoViagemSolicitada(DistKm);
		}
	public float getValorExtra() {return ValorExtra;}
	public void setValorExtra(float valorExtra) {ValorExtra = valorExtra;}
	public static float getPorcentUberLand() {return PorcentUberLand;}
	public static void setPorcentUberLand(float porcentUberLand) {PorcentUberLand = porcentUberLand;}
	public float getValorUberL() {return ValorUberL;}
	public void setValorUberL() {
		ValorUberL = ValorTotalViagem * PorcentUberLand;}
	public float getValorMotorista() {return ValorMotorista;}
	public void setValorMotorista() {
		ValorMotorista = (ValorTotalViagem * (1 - PorcentUberLand)) + ValorExtra;}
	public String getStatusFinal() {return StatusFinal;}
	public void setStatusFinal(String statusFinal) {StatusFinal = statusFinal;}
	public String getFormaPagamento() {return FormaPagamento;}
	public void setFormaPagamento(String formaPagamento) {FormaPagamento = formaPagamento;}
	public String getLocalFimCorrida() {return LocalFimCorrida;}
	public void setLocalFimCorrida(String localFimCorrida) {LocalFimCorrida = localFimCorrida;}
	public String getCanceladoPor() {return CanceladoPor;}
	public void setCanceladoPor(String canceladoPor) {CanceladoPor = canceladoPor;}
	public Veiculo getVeiculo() {return veiculo;}
	public void setVeiculo(Veiculo veiculo) {this.veiculo = veiculo;}
	public Motorista getMotorista() {return motorista;}
	public void setMotorista(Motorista motorista) {this.motorista = motorista;}
	public String getStatusCorrida() {return StatusCorrida;}
	public void setStatusCorrida(String statusCorrida) {StatusCorrida = statusCorrida;}


	// Methods
	public void CancelarCorrida(String CancPor, String LocalAtual, String hora) {
		if(StatusCorrida.equals("Iniciada")) {
			setStatusFinal("Cancelada durante a viagem");
			setValorTotalViagem(DistPercorrida(Origem, LocalAtual));
		}
		else {
			setStatusFinal("Cancelada antes do início");
			ValorTotalViagem = 0.0f;
		}
		setStatusCorrida("Finalizada");
		setCanceladoPor(CancPor);
		setLocalFimCorrida(LocalAtual);
		setHoraFimCorrida(hora);
		DadosCorrida.salvarArquivoCorridas();
		System.out.println("Corrida cancelada");
  	}
	public void AceitarCorrida(Veiculo veic) {
		setStatusCorrida("Aceita");
		setVeiculo(veic);
		setMotorista(veic.getCondutor());
		DadosCorrida.salvarArquivoCorridas();
	}
	public float DistPercorrida(String Origem, String LocalFim) {
		// ... Calculo distancia percorrida
		return 10.5f;
	}
	
	public void IniciarCorrida(String hora) {
		setStatusCorrida("Iniciada");
		setHoraChegadaMotOrigem(hora);
		DadosCorrida.salvarArquivoCorridas();
	}

	public void ConcluirCorrida(String LocalAtual, String hora) {
		if(StatusCorrida.equals("Iniciada")) {
			setStatusFinal("Realizada");
			setStatusCorrida("Finalizada");
		}
		setLocalFimCorrida(LocalAtual);
		setHoraFimCorrida(hora);
		Solicitante.AdicionaCorrida();
		motorista.AdicionaCorrida();
		setValorTotalViagem(DistPercorrida(Origem, LocalFimCorrida));
		setValorUberL();
		setValorMotorista();
		DadosCorrida.salvarArquivoCorridas();
		// 
	}
	public void RegistraValorExtra(float extra) {
		setValorExtra(extra);
		setValorMotorista();
	}
	public void RegistraAvalMotorista(int nota) {
		motorista.AdicionaAval(nota);
	}
	public void RegistraAvalPassageiro(int nota) {
		Solicitante.AdicionaAval(nota);
	}

	@Override
	public String toString() {
		return "Corrida [Solicitante=" + Solicitante + ", Origem=" + Origem + ", Destino=" + Destino + ", DataSolicit="
				+ DataSolicit + ", HoraSolicit=" + HoraSolicit + ", veiculo=" + veiculo + ", motorista=" + motorista
				+ ", HoraChegadaMotOrigem=" + HoraChegadaMotOrigem + ", HoraFimCorrida=" + HoraFimCorrida
				+ ", LocalFimCorrida=" + LocalFimCorrida + ", DuracaoViagem=" + DuracaoViagem + ", DistanciaPercorrida="
				+ DistanciaPercorrida + ", ValorTotalViagem=" + ValorTotalViagem + ", ValorExtra=" + ValorExtra
				+ ", ValorUberL=" + ValorUberL + ", ValorMotorista=" + ValorMotorista + ", StatusCorrida="
				+ StatusCorrida + ", StatusFinal=" + StatusFinal + ", CanceladoPor=" + CanceladoPor
				+ ", FormaPagamento=" + FormaPagamento + "]";
	}

}
