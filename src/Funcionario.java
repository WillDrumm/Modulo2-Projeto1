
import java.util.ArrayList;

public class Funcionario extends Pessoa{
    private static Integer count = 0;


    private ArrayList<Funcionario> listFuncionario = new ArrayList<>();

    public Funcionario(String nome, String sobrenome, String dataNascimento, String cpf, String endereco) {
        super(count++,nome, sobrenome, dataNascimento, cpf, endereco);
    }
    public Funcionario(){
        super();

    }


    public void cadastrarNovoFuncionario(Funcionario funcionario){

        listFuncionario.add(funcionario);


    }

    public ArrayList<Funcionario> getListFuncionario() {
        return listFuncionario;
    }

    public void setListaFuncionario(ArrayList<Funcionario> listFuncionario) {
        this.listFuncionario = listFuncionario;
    }
}
