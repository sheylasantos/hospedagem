public class Aposento {
    private Integer codigo;
    private Double valor;
    private String descricao;
    private Integer numero;

    public Aposento(Integer codigo,Double valor,String descricao,Integer numero){
        this.codigo=codigo;
        this.valor=valor;
        this.descricao=descricao;
        this.numero=numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getValor() {
        return valor;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }
}
