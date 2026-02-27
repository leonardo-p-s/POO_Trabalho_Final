import java.util.ArrayList;

public class DadosMotorista {
    private static ArrayList<Motorista> vetorMotoristas;

    public static void inicializaMotoristas(){
        if(vetorMotoristas == null) { // caso o vetor de motoristas ainda não exista...
            vetorMotoristas = new ArrayList<Motorista>(); // inicializamos um vetor para começar os cadastros dos motoristas...
        }
    }

    public static void cadastraMotorista (Motorista m){
        vetorMotoristas.add(m);
        System.out.println("Motorista adicionado com sucesso!"); // exibimos uma mensagem dizendo que o processo de adicionar deu certo!
    }
    
    public static boolean loginExiste(String Login) {
  	   for (Motorista u : vetorMotoristas) { // percorremos o vetor de usuários do início ao fim...
  		   if (u.getLogin().equals(Login))
  			  return true;
  	   }
 	   return false;
     }

    public static boolean fazerLoginMotorista(String Login) {
        for (int i = 0; i < vetorMotoristas.size(); i++) { // percorremos o vetor de motoristas do início ao fim...
            Motorista m = vetorMotoristas.get(i); // a cada execução do comando de laço, um motorista diferente será testado, e "identificamos" ele pelo índice no vetor

            if (m.getLogin().equals(Login)) { // se o login e a senha do motorista forem iguais aos dados inseridos para login...
                Sessao.getInstancia().setUser(m); // o motorista logado passa a ser o motorista que possui os dados inseridos para login, ou seja, o motorista que se deseja logar no sistema
                System.out.println("Login de motorista efetuado com sucesso!"); // exibimos uma mensagem dizendo que o login deu certo
                return true; // retornamos verdadeiro, ou seja, o login foi bem sucedido!
            }

        }

        return false; // caso contrário, e nenhum motorista seja encontrado, retornamos falso, ou seja, o login falhou!
    }

    public Motorista buscarMotorista (String cnh){

        for(int i = 0; i < vetorMotoristas.size(); i++){ // percorremos o vetor de motoristas do início ao fim...
            Motorista m = vetorMotoristas.get(i); // para cada execução do comando de laço, um motorista diferente será testado, e "identificamos" o motorista pelo seu índice no vetor

            if(cnh.equals(m.getCNH())){ // se o cpf procurado pertencer a algum motorista cadastrado...
                return m; // retornamos os dados do motorista desejado
            }
        }

        return null; // caso não encontrarmos o motorista desejado, simplesmente retornamos nulo.
    }

    public void excluirMotorista (String cnh){
        for(int i = 0; i < vetorMotoristas.size(); i++){ // percorremos o vetor de motoristas do início ao fim...
            Motorista m = vetorMotoristas.get(i); // a cada execução do comando de laço, um novo motorista que está cadastrado no vetor será utilizado para que os testes acontecam...

            if(cnh.equals(m.getCNH())){ // se o cnh pertencer a algum dos motoristas cadastrados...
                vetorMotoristas.remove(m); // removemos o motorista do vetor de motoristas...
                System.out.println("Motorista de CNH: "+m.getCNH()+" removido com sucesso!"); // mensagem que informa que o processo deu certo
                break; // e então, solicitamos para que o comando de laço se encerre, já que encontramos o motorista desejado e já o removemos do array...
            }
        }

        System.out.println("Motorista não encontrado!"); // caso contrário, e nenhum motorista possui o cnh inserido, exibimos uma mensagem de erro, dizendo que o motorista não foi encontrado.
    }

    public void listarMotoristas(){
        for (int i = 0; i < vetorMotoristas.size(); i++){ // percorremos o vetor de motoristas, do início ao fim...
            Motorista m = vetorMotoristas.get(i); // a cada execução do comando de laço, um novo motorista terá seus dados cadastrados exibidos
            m.toString(); // em seguida, exibimos todos os dados que estão cadastrados do motorista da vez!
        }

        //OBS: esse processo acontecerá com todos os motoristas presentes no array, até ele acabar com aqueles que estão cadastrados
    }

    public void salvarArquivoMotoristas(){
        Persist.gravar(vetorMotoristas, "motoristas.dat");
    }

    public void recuperarArquivoMotoristas(){
        Object obj = Persist.recuperar("motoristas.dat");

        if (obj != null) {
            vetorMotoristas = (ArrayList<Motorista>) obj;
        }
    }
}
