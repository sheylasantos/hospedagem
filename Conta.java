import java.util.List;

public class Conta {
    private Integer codigo;
    private Double valor;
    private Boolean pago;
    private List<Consumo> consumosList;

    public Conta(Integer codigo) {
        this.codigo = codigo;
        this.valor = 0.0;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public Boolean getPago() {
        return pago;
    }

    public List<Consumo> getConsumosList() {
        return consumosList;
    }

    public void setPago(Boolean pago) {
        this.pago = true;
    }

    public void setConsumosList(Consumo consumo) {
        this.consumosList.add(consumo);
    }
}
