import java.util.List;

public class Recepcionista extends Funcionario {
    private List<String> idiomasQueDominaList;

    public Recepcionista(String matricula, String nome, double salario){
        super(matricula, nome, salario);
    }

    public void setIdiomaQueDomina(String idiomaQueDomina) {
        this.idiomasQueDominaList.add(idiomaQueDomina);
    }

    public List<String> getIdiomasQueDominaList() {
        return idiomasQueDominaList;
    }
}
