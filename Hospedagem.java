import java.util.Date;

public class Hospedagem {
    private Integer codigo;
    private Date dataEntrada;
    private Date dataSaida;
    private Hospede hospede;
    private Aposento aposento;
    private Conta conta;

    public Hospedagem(Integer codigo, Date dataEntrada, Hospede hospede, Aposento aposento, Conta conta) {
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.hospede = hospede;
        this.aposento = aposento;
        this.conta = conta;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public Aposento getAposento() {
        return aposento;
    }
}
