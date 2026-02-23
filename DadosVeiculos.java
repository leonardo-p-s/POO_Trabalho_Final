import java.util.ArrayList;

public class DadosVeiculos {
    private ArrayList<Veiculo> vetorVeiculos;

    public void inicializarVetorVeiculos(){
        if(vetorVeiculos == null){ // se o vetor de veículos ainda não exisitir...
            vetorVeiculos = new ArrayList<Veiculo>(); // inicializamos o vetor de veículos, para que possamos começar o processo de cadastro de cada um dos veículos...
        }
    }

    public void cadastrarVeiculo (Veiculo v){
        vetorVeiculos.add(v); // adicionamos o veículp no vetor que foi criado e inicializado anteriormente...
        System.out.println("Veículo adicionado com sucesso!"); // exibimos uma mensagem dizendo que o processo de adicionar deu certo!
    }

    public Veiculo buscarVeiculo (String placa){
        for(int i = 0; i < vetorVeiculos.size(); i++){ // percorremos todo o vetor de veículos, do início ao fim...
            Veiculo v = vetorVeiculos.get(i); // a cada execução do comando de laço, um novo veículo é utilizado para passar pelo teste de igualdade de placa

            if(placa == v.getPlaca()){ // se a placa passada por parâmetro pertencer a algum veículo cadastrado...
                return v; // retornamos os dados pertencentes a esse veículo
            }
        }

        return null; // caso nenhum veículo possua a placa, simplesmente retornamos null.
    }

    public void listarVeiculos(){
        for(int i = 0; i < vetorVeiculos.size(); i++){ // percorremos o vetor de veículos do início ao fim
            Veiculo v = vetorVeiculos.get(i); // para cada execução do comando de laço, um novo veículo terá seus dados exibidos...
            v.toString(); // exibimos todos os dados do veículo cadastrado no vetor
        }

        //OBS: esse processo acontecerá com todos os veículos presentes no array, até ele acabar com aqueles que estão cadastrados
    }

    public void excluirVeiculo (String placa) {
        for (int i = 0; i < vetorVeiculos.size(); i++) { // percorremos todo o vetor de veículos, do início ao fim...
            Veiculo v = vetorVeiculos.get(i); // a cada execução do comando de laço, um veículo diferente é usado para que os testes sejam feitos...

            if (placa == v.getPlaca()) { // caso a placa pertença a algum dos véiculos cadastrados...
                vetorVeiculos.remove(v); // removemos esse veículo do vetor de veículos.
                System.out.println("Veículo de palca: " + v.getPlaca() + " removido com sucesso!"); // mensagem que informa que o processo deu certo
                break; // e então, solicitamos que o comando de laço seja interrompido, já que encontramos o motorista desejado e já removemos o motorista do array...
            }
        }

        System.out.println("Veículo não encontrado!"); // caso contrário, exibimos uma mensagem de erro dizendo que o veículo que se deseja excluir do vetor,, não está presente nele...
    }

    public void salvarArquivoVeiculos(){
        Persist.gravar(vetorVeiculos, "veiculos.dat");
    }

    public void recuperarArquivoVeiculos(){
        Object obj = Persist.recuperar("veiculos.dat");

        if (obj != null) {
            vetorVeiculos = (ArrayList<Veiculo>) obj;
        }
    }
}
