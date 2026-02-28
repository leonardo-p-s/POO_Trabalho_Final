import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class DadosCorrida {

    private static ArrayList<Corrida> vetorCorridas;

    public static void inicializaCorridas() {
        if (vetorCorridas == null) { // caso o vetor de corridas ainda não exista...
            vetorCorridas = new ArrayList<Corrida>(); // inicializamos um vetor para começar os cadastros das
                                                      // corridas...
        }
    }

    public static void cadastraCorrida(Corrida c) {
        vetorCorridas.add(c);
        salvarArquivoCorridas();
        System.out.println("Corrida adicionada com sucesso!"); // exibimos uma mensagem dizendo que o processo de
                                                               // adicionar deu certo!
    }

    public Corrida buscarCorrida(Usuario u) {

        for (int i = 0; i < vetorCorridas.size(); i++) { // percorremos o vetor de corridas do início ao fim...
            Corrida c = vetorCorridas.get(i); // para cada execução do comando de laço, uma corrida diferente será
                                              // testada, e "identificamos" a corrida pelo seu índice no vetor

            if (u.equals(c.getSolicitante())) { // se o usuário procurado pertencer a corrida...
                return c; // retornamos os dados da corrida
            }
        }

        return null; // caso não encontrarmos a corrida desejada, simplesmente retornamos nulo.
    }

    public Corrida criarCorrida(String origem, String destino, String CatVeic, Usuario solicitante) {
        String dataAtual = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String horaAtual = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));

        Corrida novaCorrida = new Corrida(solicitante, origem, destino, CatVeic, dataAtual, horaAtual);

        vetorCorridas.add(novaCorrida);
        salvarArquivoCorridas();

        System.out.println("Corrida solicitada com sucesso!");
        return novaCorrida;
    }

    public void excluirCorrida(Motorista m) {
        for (int i = 0; i < vetorCorridas.size(); i++) { // percorremos o vetor de corridas do início ao fim...
            Corrida c = vetorCorridas.get(i); // a cada execução do comando de laço, uma nova corrida que está
                                              // cadastrada no vetor será utilizada para que os testes acontecam...

            if (m.equals(c.getMotorista())) { // se o id do motorista pertencer a alguma das corridas cadastradas...
                vetorCorridas.remove(c); // removemos a corrida do vetor de corridas...
                salvarArquivoCorridas();
                System.out.println("Corrida removida com sucesso!"); // mensagem que informa que o processo deu certo
                break; // e então, solicitamos para que o comando de laço se encerre, já que
                       // encontramos a corrida desejada e já a removemos do array...
            }
        }

        System.out.println("Corrida não encontrada!"); // caso contrário, e nenhuma corrida possui o id inserido,
                                                       // exibimos uma mensagem de erro, dizendo que a corrida não foi
                                                       // encontrada.
    }

    public void listarCorridas() {
        for (int i = 0; i < vetorCorridas.size(); i++) { // percorremos o vetor de corridas, do início ao fim...
            Corrida c = vetorCorridas.get(i); // a cada execução do comando de laço, uma nova corrida terá seus dados
                                              // cadastrados exibidos
            c.toString(); // em seguida, exibimos todos os dados que estão cadastrados da corrida da vez!
        }

        // OBS: esse processo acontecerá com todas as corridas presentes no array, até
        // ele acabar com aquelas que estão cadastradas
    }
    
    public static Corrida corridaEmAndamentoUsuario() {
        Usuario u = (Usuario) Sessao.getInstancia().getUser();
        for (Corrida c : vetorCorridas) {
            if (u.getLogin().equals(c.getSolicitante().getLogin()) && !"Finalizada".equals(c.getStatusCorrida())) {
                return c;
            }
        }
        return null;
    }

    
    public static String dadosCorridaEmAndamentoUsuario() {
    	Usuario u = (Usuario) Sessao.getInstancia().getUser();
    	for (Corrida c : vetorCorridas) {
    		if (u.equals(c.getSolicitante())) {
    			if (!c.getStatusCorrida().equals("Finalizada")) {
    				String or = c.getOrigem();
					String dest = c.getDestino();
					String status = c.getStatusCorrida();
					if(status.equals("Aceita"))
						status = status + "<br><b> >>> ATENÇãO:</b> Seu motorista está a caminho!<br>Dirija-se ao local de origem.";
					String mot = "Aguarde!";
					String veic = "Aguarde!";
					String valor = String.format("R$ %.2f (Valor previsto)", c.getValorTotalViagem());
					if(!status.equals("Solicitada")) {
						mot = c.getMotorista().getNomeSocial();
						veic = c.getVeiculo().getMarca() + "-"+c.getVeiculo().getModelo() +" Placa: " + c.getVeiculo().getPlaca();
						valor = String.format("R$ %.2f", c.getValorTotalViagem());
					}
	    				return("<html><b>Origem:</b> "	+ or +
	    						"<br><b>Destino:</b> "	+ dest +
	    						"<br><b>Nome Motorista:</b> "	+mot+
	    						"<br><b>Veículo:</b> "	+ veic+
	    						"<br><b>Valor Total:</b> "	+ valor +
	    						"<br><b>Status:</b> "	+status+
	    						" </html>");
    				}
    			}
    		}
    	return "";
    }
    
    public static Corrida corridaEmAndamentoMotorista() {
    	Motorista m = (Motorista) Sessao.getInstancia().getUser();
    	for (Corrida c : vetorCorridas) 
    		if(!"Solicitada".equals(c.getStatusCorrida()))
    			if (!"Finalizada".equals(c.getStatusCorrida()))
    				if (m.getLogin().equals(c.getMotorista().getLogin())) 
    					return c;
    	return null;
    }

    
    public static String dadosCorridaEmAndamentoMotorista() {
    	Corrida c = corridaEmAndamentoMotorista();
    	if(c != null) {
			String or = c.getOrigem();
			String dest = c.getDestino();
			String status = c.getStatusCorrida();
			if(status.equals("Aceita"))
				status = status + "<br><b> >>> ATENÇãO:</b> O(a) passageiro(a) está aguardando!<br>Dirija-se ao local de origem.";
			String solic = c.getSolicitante().getNome();
			String veic = c.getVeiculo().getMarca() + "-"+c.getVeiculo().getModelo();
			String valor = String.format("R$ %.2f ", c.getValorTotalViagem());
			return("<html><b>Origem:</b> "	+ or +
					"<br><b>Destino:</b> "	+ dest +
					"<br><b>Nome Passageiro:</b> "	+solic+
					"<br><b>Veículo:</b> "	+ veic+
					"<br><b>Valor Total:</b> "	+ valor +
					"<br><b>Status:</b> "	+status+
					" </html>");
    	}
    	return "";
    }
    
    public static Corrida corridaDiponivel() {
    	//Motorista u = (Motorista) Sessao.getInstancia().getUser();
    	
    	for (Corrida c : vetorCorridas) {
    		if(c.getStatusCorrida().equals("Solicitada")) 
	    		return c;
    	}
    	return null;
    }
    	

    public static void salvarArquivoCorridas() {
        Persist.gravar(vetorCorridas, "corridas.dat");
    }

    public static void recuperarArquivoCorridas() {
        Object obj = Persist.recuperar("corridas.dat");

        if (obj != null) {
            vetorCorridas = (ArrayList<Corrida>) obj;
        }
    }
}
