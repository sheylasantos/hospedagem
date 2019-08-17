public class Consumo {
    private Integer codigo;
    private String descricao;
    private Integer quantidade;
    private Double valorUnitario;

    public Consumo(Integer codigo, String descricao, Integer quantidade, Double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
    public Consumo(Integer codigo, String descricao, Double valorUnitario) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }


}
