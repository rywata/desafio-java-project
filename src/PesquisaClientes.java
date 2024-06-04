import java.util.List;

public class PesquisaClientes {

    private final Banco banco;

    public PesquisaClientes(Banco banco) {
        this.banco = banco;
    }

    // Método para pesquisa por CPF
    public Cliente pesquisarPorCpf(String cpf) {
        return banco.buscarClientePorCpf(cpf);
    }

    // Método para pesquisa por nome
    public List<Cliente> pesquisarPorNome(String nome) {
        return banco.buscarClientesPorNome(nome);
    }
}
