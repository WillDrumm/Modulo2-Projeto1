import java.lang.reflect.Array;
import java.util.ArrayList;

public class Supervisor extends Pessoa {
    private  static  Integer cont = 0;

    private ArrayList<Supervisor> listSupervisor = new ArrayList<>();

    public Supervisor(String nome, String sobrnome, String cpf, String endereco, String dataNascimento){
        super( cont++, nome, sobrnome, cpf, endereco, dataNascimento);


    }
    public Supervisor(){

    }
    public void cadastroNovoSupervisor(Supervisor supervisor){
        listSupervisor.add(supervisor);
    }



}
