public class Pessoa {
    private static long count = 0;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String dataNascimento;
    private String endereco;
    private Integer autenticador;

    public  Pessoa (Integer autenticador, String nome, String sobrenome, String cpf, String dataNascimento, String endereco){

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.autenticador = autenticador;




    }
    public Pessoa(){

    }



}
