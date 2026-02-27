import java.util.ArrayList;

public class DadosUsuario {
    private static ArrayList<Usuario> vetorUsuarios;

    public static void inicializaVetorUsuarios(){
        if(vetorUsuarios == null){ // caso o vetor de usuários ainda não exista...
            vetorUsuarios = new ArrayList<Usuario>(); // inicializamos o array para conseguirmos fazer os cadastros de usuários
        }
    }

    public static void cadastrarUsuario(Usuario usuario) {
        vetorUsuarios.add(usuario); // adicionamos um usuário ao array de usuários
        System.out.println("Usuário adicionado com sucesso!"); // exibimos uma mensagem dizendo que o processo de adicionar deu certo!
        salvarArquivoUsuarios();
    }
    
    public static boolean loginExiste(String Login) {
 	   for (Usuario u : vetorUsuarios) { // percorremos o vetor de usuários do início ao fim...
 		   if (u.getLogin().equals(Login))
 			  return true;
 	   }
	   return false;
    }

   public static boolean fazerLoginUsuario(String Login) {
	   for (Usuario u : vetorUsuarios) { // percorremos o vetor de usuários do início ao fim...
		   if (u.getLogin().equals(Login)) { // se o login e a senha do usuário forem iguais aos dados inseridos para login...
			   Sessao.getInstancia().setUser(u); // o usuário logado passa a ser o usuário que possui os dados inseridos para login, ou seja, o usuário que se deseja logar no sistema
			   System.out.println("Login de usuário efetuado com sucesso!"); // exibimos uma mensagem dizendo que o login deu certo
			   return true; // retornamos verdadeiro, ou seja, o login foi bem sucedido!
		   }
	   }
	   return false; // caso contrário, e nenhum usuário seja encontrado, retornamos falso, ou seja, o login falhou!
   }

   public void fazerLogoutUsuario() {
        Sessao.getInstancia().setUser(null); // o usuário logado passa a ser nulo, ou seja, nenhum usuário estará logado no sistema
        System.out.println("Logout de usuário efetuado com sucesso!"); // exibimos uma mensagem dizendo que o logout deu certo
    }
    public Usuario buscarUsuario(String cpf) {
        for (int i = 0; i < vetorUsuarios.size(); i++) { // percorrendo o vetor até o seu tamanho total...

            Usuario u = vetorUsuarios.get(i); // pegamos a posição em que o array se encontra, para começarmos os testes...

            if (u.getCPF().equals(cpf)) { // se o cpf do usuário é igual ao usuário procurado...
                return u; // retornamos os dados desse usuário
            }
        }

        return null; // caso não encontremos, retornamos nulo
    }

    public void excluirUsuario (String cpf) {
        for (int i = 0; i < vetorUsuarios.size(); i++) { // percorremos o vetor de usuários do início ao fim...
            Usuario u = vetorUsuarios.get(i); // e a cada execução do comando de laço, um usuário diferente será testado, e "identificamos" ele pelo índice no vetor

            if (u.getCPF().equals(cpf)) { // se o cpf que desejamos pertencer a um usuário cadastrado...
                vetorUsuarios.remove(u); // removemos o usuário do vetor
                System.out.println("Usuário de CPF: "+u.getCPF()+" removido com sucesso!"); // mensagem que informa que o processo deu certo
                this.salvarArquivoUsuarios();
                break; // caso encontrarmos o usuário desejado, pedimos para que o comando de laço se encerre...
            }
        }

        System.out.println("Usuário não encontrado!");// caso nenhum usuário seja encontrado, nada acontece!
    }

    public void listarUsuarios(){
        for(int i = 0; i < vetorUsuarios.size(); i++){ // percorremos todo o vetor de usuários, do início ao fim...
            Usuario u = vetorUsuarios.get(i); // a cada execução do comando de laço, um usuário diferente terá seus dados exibidos
            u.toString(); // para o usuário da vez, todos os dados cadastrados sobre ele serão exibidos!
        }

        //OBS: esse processo acontecerá com todos os usuários presentes no array, até ele acabar com aqueles que estão cadastrados
    }

    public static void salvarArquivoUsuarios(){
        Persist.gravar(vetorUsuarios, "usuarios.dat");
    }

    public static void recuperarArquivoUsuarios(){
        Object obj = Persist.recuperar("usuarios.dat");

        if (obj != null) {
            vetorUsuarios = (ArrayList<Usuario>) obj;
        }
    }

    public void lerArquivoUsuarios(){
        Object obj = Persist.recuperar("usuarios.dat");

        if (obj != null) {
            vetorUsuarios = (ArrayList<Usuario>) obj;
        }
    }


}
