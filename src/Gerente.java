import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Gerente extends Pessoa{



        private static Integer count = 0;
        private ArrayList<Gerente> listGerente = new ArrayList<>();





        public  Gerente(String nome, String sobrenome, String endereco, String Nascimento, String cpf){
            super(count++, nome, sobrenome,endereco, Nascimento,cpf);

        }

        public Gerente(){
            super();


        }

        public ArrayList<Gerente> getListGerente() {
            return listGerente;
        }
        public void  setListGerente(ArrayList<Gerente> listGerente){
            this.listGerente = listGerente;


        }
        public void registrarGerente(Gerente gerente){
            listGerente.add(gerente);


        }
            public void ListarTodosDocumentos(){
            Documento.getListaDocumento().forEach(documento -> System.out.println(documento.toString()));
            }
public void tratarDocumento(int id){
    System.out.println("1-Arquivar / 2-Tirar do Arquivo");
    Scanner scan = new Scanner(System.in);
    int opcao = Integer.parseInt(scan.nextLine());
    if (opcao == 1) {
        Documento.getListaDocumento().get(id).setFormaDocumento("Completo - Arquivado");


    } else if (opcao == 2) {
        Documento.getListaDocumento().get(id).setFormaDocumento("Completo - Desarquivado");
    }



}
    }

