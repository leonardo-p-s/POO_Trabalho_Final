import java.util.ArrayList;


public class DadosCorrida {
    
    private ArrayList<Corrida> vetorCorridas;

    public void inicializaCorridas(){
        if(vetorCorridas == null) { // caso o vetor de corridas ainda não exista...
            vetorCorridas = new ArrayList<Corrida>(); // inicializamos um vetor para começar os cadastros das corridas...
        }
    }

    public void cadastraCorrida (Corrida c){
        vetorCorridas.add(c);
        System.out.println("Corrida adicionada com sucesso!"); // exibimos uma mensagem dizendo que o processo de adicionar deu certo!
    }

    public Corrida buscarCorrida (String id){

        for(int i = 0; i < vetorCorridas.size(); i++){ // percorremos o vetor de corridas do início ao fim...
            Corrida c = vetorCorridas.get(i); // para cada execução do comando de laço, uma corrida diferente será testada, e "identificamos" a corrida pelo seu índice no vetor

            if(id.equals(c.getId())){ // se o id procurado pertencer a alguma corrida cadastrada...
                return c; // retornamos os dados da corrida desejada
            }
        }

        return null; // caso não encontrarmos a corrida desejada, simplesmente retornamos nulo.
    }

    public void excluirCorrida (Motorista m)
    ){
        for(int i = 0; i < vetorCorridas.size(); i++){ // percorremos o vetor de corridas do início ao fim...
            Corrida c = vetorCorridas.get(i); // a cada execução do comando de laço, uma nova corrida que está cadastrada no vetor será utilizada para que os testes acontecam...

            if(m.equals(c.getMotorista())){ // se o id do motorista pertencer a alguma das corridas cadastradas...
                vetorCorridas.remove(c); // removemos a corrida do vetor de corridas...
                System.out.println("Corrida removida com sucesso!"); // mensagem que informa que o processo deu certo
                break; // e então, solicitamos para que o comando de laço se encerre, já que encontramos a corrida desejada e já a removemos do array...
            }
        }

        System.out.println("Corrida não encontrada!"); // caso contrário, e nenhuma corrida possui o id inserido, exibimos uma mensagem de erro, dizendo que a corrida não foi encontrada.
    }

    public void listarCorridas(){
        for (int i = 0; i < vetorCorridas.size(); i++){ // percorremos o vetor de corridas, do início ao fim...
            Corrida c = vetorCorridas.get(i); // a cada execução do comando de laço, uma nova corrida terá seus dados cadastrados exibidos
            c.toString(); // em seguida, exibimos todos os dados que estão cadastrados da corrida da vez!
        }

        //OBS: esse processo acontecerá com todas as corridas presentes no array, até ele acabar com aquelas que estão cadastradas
    }

    public void salvarArquivoCorridas(){
        Persist.gravar(vetorCorridas, "corridas.dat");
    }

    public void recuperarArquivoCorridas(){
        Object obj = Persist.recuperar("corridas.dat");

        if (obj != null) {
            vetorCorridas = (ArrayList<Corrida>) obj;
        }
    }

    

}


       