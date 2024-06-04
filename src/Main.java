import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João", "12345678900");
        Cliente cliente2 = new Cliente("Maria", "09876543211");

        // Criando contas
        ContaCorrente conta1 = new ContaCorrente(cliente1);
        ContaCorrente conta2 = new ContaCorrente(cliente2);

        // Vinculando contas aos clientes
        cliente1.setConta(conta1);
        cliente2.setConta(conta2);

        // Criando instância de Banco
        Banco banco = new Banco("Banco");

        // Adicionando clientes ao banco
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        // Criando instância de PesquisaClientes passando o banco como parâmetro
        PesquisaClientes pesquisa = new PesquisaClientes(banco);

        // Pesquisando por CPF
        Cliente encontradoPorCpf = pesquisa.pesquisarPorCpf("12345678900");
        if (encontradoPorCpf != null) {
            System.out.println("Cliente encontrado por CPF: " + encontradoPorCpf.getNome());
        } else {
            System.out.println("Cliente não encontrado por CPF.");
        }

        // Pesquisando por nome
        List<Cliente> encontradosPorNome = pesquisa.pesquisarPorNome("Maria");
        if (!encontradosPorNome.isEmpty()) {
            System.out.println("Clientes encontrados por nome: ");
            for (Cliente c : encontradosPorNome) {
                System.out.println(c.getNome());
            }
        } else {
            System.out.println("Nenhum cliente encontrado por nome.");
        }
    }
}
