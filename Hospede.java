public class Hospede {
    private Integer codigo;
    private String nome;
    private String CPF;
    private String RG;
    private String telefone;

    public Hospede(Integer codigo,String nome,String CPF,String RG,String telefone){
        this.codigo=codigo;
        this.nome=nome;
        this.CPF=CPF;
        this.RG=RG;
        this.telefone=telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
