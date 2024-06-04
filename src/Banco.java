import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {

    private String nome;
    private List<Conta> contas;
    private Map<String, Cliente> clientes;


    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public Map<String, Cliente> getClientes() {
        return clientes;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscarClientePorCpf(String cpf) {
        return clientes.get(cpf);
    }

    public List<Cliente> buscarClientesPorNome(String nome) {
        List<Cliente> resultados = new ArrayList<>();
        for (Cliente cliente : clientes.values()) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                resultados.add(cliente);
            }
        }
        return resultados;
    }
}
