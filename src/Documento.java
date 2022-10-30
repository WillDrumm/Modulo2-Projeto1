
import java.util.ArrayList;
import java.util.List;


public class Documento {

    private static List<Documento> ListaDocumento = new ArrayList<>();

    private static long count = 0;
    private long autenticador;
    private int Supervisor;
    private int Criador;
    private String linkDocumento;
    private String formaDocumento;

    private String status;



    public Documento(int Supervisor, int Criador, String linkDocumento){
        this.autenticador = count++;
        this.Supervisor = Supervisor;
        this.Criador = Criador;
        this.linkDocumento = linkDocumento;
        this.formaDocumento = "Completo - Desarquivado";
        this.status = "Precisa de aprovação";

    }

    @Override
    public String toString() {
        return "Documento{" +
                "autenticador=" + autenticador +
                ", Supervisor=" + Supervisor +
                ", Criador=" + Criador +
                ", linkDocumento='" + linkDocumento + '\'' +
                ", formaDocumento='" + formaDocumento + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Documento() {


    }

    public static void setListaDocumento(List<Documento> listaDocumento) {
        ListaDocumento = listaDocumento;
    }

    public static List<Documento> getListaDocumento() {
        return ListaDocumento;
    }

    public String getFormaDocumento() {
        return formaDocumento;
    }

    public void setFormaDocumento(String formaDocumento) {
        this.formaDocumento = formaDocumento;
    }

    public void inserirDocumento(Documento documento){
        ListaDocumento.add(documento);
    }
    public void listardocs(int autenticador){
        ListaDocumento.forEach(documento ->{
            if(autenticador == documento.Criador){
                System.out.println(documento.toString());
            }
        });
    }
    public void listardocssupervisor(int autenticador){
        ListaDocumento.forEach(documento ->{
            if(autenticador == documento.Supervisor){
                System.out.println(documento.toString());
            }
        });
    }
    public void aprovarDocumento(int id){
        ListaDocumento.get(id).setStatus("Aprovado");
    }


}