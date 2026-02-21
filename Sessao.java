public class Sessao {
    private static Sessao instancia;
    private Object User; // pode ser Motorista ou Usuario

    private Sessao() {}

    public static Sessao getInstancia() {
        if (instancia == null) {
            instancia = new Sessao();
        }
        return instancia;
    }

    public void setUser(Object user) {
        this.User = user;
    }

    public Object getUser() {
        return User;
    }
}
