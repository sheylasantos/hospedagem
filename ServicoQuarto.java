import java.util.Date;

public class ServicoQuarto {
    private Date data;
    private Hospedagem hospedagem;
    private Camareiro camareiro;
    private Boolean realizado;


    public void realizarServicoQuarto(Hospedagem hospedagem,Camareiro camareiro){
        this.camareiro=camareiro;
        this.hospedagem=hospedagem;
        this.realizado=true;
    }
    public void agendarServicoQuarto(Hospedagem hospedagem,Camareiro camareiro,Date data){
        this.camareiro=camareiro;
        this.hospedagem=hospedagem;
        this.data=data;
    }

    public Date getData() {
        return data;
    }

    public Boolean getRealizado() {
        return realizado;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }
}
