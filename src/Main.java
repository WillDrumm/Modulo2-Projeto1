import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Supervisor supervisor = new Supervisor();
        Gerente gerente = new Gerente();
        Documento documento = new Documento();

        Funcionario funcionarioNivel1 = new Funcionario("William", "Barbosa", "16/11/1986", "000000000", "Rua dos Gusmões");
        Funcionario funcionarioNivel2 = new Funcionario("Ester", "Cardoso", "11/01/2014", "000000000", "Av São joão");

        funcionario.cadastrarNovoFuncionario(funcionarioNivel2);
        funcionario.cadastrarNovoFuncionario(funcionarioNivel1);


        Supervisor supervisorNivel1 = new Supervisor("Will", "Barbosa", "000000000", "rua dos Gusmções", "16/11/1986");
        Supervisor supervisorNivel2 = new Supervisor("Ester", "Cardoso", "000000000", "00", "11/01/2014");
        supervisor.cadastroNovoSupervisor(supervisorNivel1);
        supervisor.cadastroNovoSupervisor(supervisorNivel2);

        Gerente gerente1 = new Gerente("Maria", "Joana", "AV americo Brasiliense", "08/05/1990", "08345874787");
        gerente.registrarGerente(gerente1);

        Documento doc1 = new Documento(0, 0, "Link1");
        Documento doc2 = new Documento(0, 0, "link2");
        Documento doc3 = new Documento(0, 0, "link3");

        documento.inserirDocumento(doc1);
        documento.inserirDocumento(doc2);
        documento.inserirDocumento(doc3);


        System.out.println("Teste");

        boolean sair = false;

        while (!sair) {

            System.out.println("Cadastrar novo funcionário");
            System.out.println(" 1º-Funcionário 2º-Supervisor  3º-Gerente  4º-Documentos 5º-Documentos listados 6º-Documentos Cadastrados 7º-Lista de Documentos 8º sair");
            Scanner scan = new Scanner(System.in);
            int item = Integer.parseInt(scan.nextLine());
            switch (item) {

                case 1:
                    System.out.println("Funcionario");
                    System.out.println("Nome");
                    String nomeFuncionario = scan.nextLine();
                    System.out.println("Sobrenome");
                    String sobrenomeFuncionario = scan.nextLine();
                    System.out.println("Data");
                    String nascimentoFuncionario = scan.nextLine();
                    System.out.println("CPF");
                    String cpfFuncionario = scan.nextLine();
                    System.out.println("Endereço");
                    String endFuncionario = scan.nextLine();
                    Funcionario cadastroNovoFuncionario = new Funcionario(nomeFuncionario, sobrenomeFuncionario, nascimentoFuncionario, cpfFuncionario, endFuncionario);
                    funcionario.cadastrarNovoFuncionario(cadastroNovoFuncionario);
                    break;

                case 2:
                    System.out.println("Cadastrar Supervisor");
                    System.out.println("Nome");
                    String nomeSupervisor = scan.nextLine();
                    System.out.println("Sobrenome");
                    String sobrenomeSupervisor = scan.nextLine();
                    System.out.println("Data de nascimento dd/MM/yyyy");
                    String nascimentoSupervisor = scan.nextLine();
                    System.out.println("CPF");
                    String cpfSupervisor = scan.nextLine();
                    System.out.println("Endereço:");
                    String enderecoSupervisor = scan.nextLine();
                    Supervisor cadastroSupervisor = new Supervisor(nomeSupervisor, sobrenomeSupervisor, nascimentoSupervisor, cpfSupervisor, enderecoSupervisor);
                    supervisor.cadastroNovoSupervisor(cadastroSupervisor);
                    break;

                case 3:
                    System.out.println("Cadastro Gerente");
                    System.out.println("Nome: ");
                    String nomeGerente = scan.nextLine();
                    System.out.println("Sobrenome: ");
                    String sobrenomeGerente = scan.nextLine();
                    System.out.println("Data");
                    String nascimentoGerente = scan.nextLine();
                    System.out.println("CPF: ");
                    String cpfGerente = scan.nextLine();
                    System.out.println("Endereço: ");
                    String enderecoGerente = scan.nextLine();
                    Gerente cadastrarNovoGerente = new Gerente(nomeGerente, sobrenomeGerente, nascimentoGerente, cpfGerente, enderecoGerente);
                    gerente.registrarGerente(cadastrarNovoGerente);
                    break;

                case 4:
                    System.out.println("Cadastrar um novo Documento");
                    System.out.println("identificador do supervisor");
                    int Supervisor = Integer.parseInt(scan.nextLine());
                    System.out.println("Digite o ID do criador do documento: ");
                    int Criador = Integer.parseInt(scan.nextLine());
                    System.out.println("Digite o identificador do criador do documento: ");
                    String linkDocumento = scan.nextLine();
                    Documento inserirDocumento = new Documento(Supervisor, Criador, linkDocumento);
                    documento.inserirDocumento(inserirDocumento);
                    System.out.println("Cadastro efetivado com sucesso, aguarde a aprovação");

                    break;

                case 5:
                    System.out.println("ATENÇÃO: Só serão listados os documentos que você criou");
                    System.out.println("Identifique seu autenticador");
                    int autenticador = Integer.parseInt(scan.nextLine());
                    documento.listardocs(autenticador);
                    break;

                case 6:
                    System.out.println("Documentos ja cadastrados");
                    System.out.println("ATENÇÃO: Só serão listados os documentos enviados para você");
                    System.out.println("Identifique seu autenticador");
                    int aut = Integer.parseInt(scan.nextLine());
                    documento.listardocssupervisor(aut);
                    System.out.println("Insira seu identificador do documento para Aprovar - Reprovar");
                    int documentoID = Integer.parseInt(scan.nextLine());
                    documento.aprovarDocumento(documentoID);

                    break;

                case 7:
                    System.out.println("Lista Documentos");
                    System.out.println("Poderá ver todos os documentos do sistema");
                    gerente.ListarTodosDocumentos();
                    System.out.println("Insira seu identificador do documento para Arquivar - Desarquivar");
                    int iddocumento = Integer.parseInt(scan.nextLine());
                    gerente.tratarDocumento(iddocumento);
                    break;
                case 8:
                    sair = true;
                    System.out.println("O sistema será fechado! Obrigado");
                    break;
            }
        }
    }
}