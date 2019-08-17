import java.util.List;

public class Hotel {
    private String nome;
    private String CNPJ;
    private List<Hospedagem> hospedagens;
    private List<Recepcionista> recepcionistas;
    private List<Camareiro> camareiros;

    public Hotel(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    public void setHospedagens(Hospedagem hospedagem) {
        this.hospedagens.add(hospedagem);
    }

    public void setRecepcionistas(Recepcionista recepcionista) {
        this.recepcionistas.add(recepcionista);
    }

    public void setCamareiros(Camareiro camareiro) {
        this.camareiros.add(camareiro);
    }

    public String getNome() {
        return nome;
    }

    public List<Camareiro> getCamareiros() {
        return camareiros;
    }

    public List<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }

    public List<Hospedagem> getHospedagens() {
        return hospedagens;
    }
}
