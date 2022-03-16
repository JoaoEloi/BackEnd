package model;

public class Hotel {

    private int id;
    private String nomeFilial;
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private boolean eCincoEstrelas;

    //Criando todas as possibilidades de construtores

    public Hotel() {
    }

    public Hotel(int id, String nomeFilial, String rua, String numero, String cidade, String estado, boolean eCincoEstrelas) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.eCincoEstrelas = eCincoEstrelas;
    }

    public Hotel(String nomeFilial, String rua, String numero, String cidade, String estado, boolean eCincoEstrelas) {
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.eCincoEstrelas = eCincoEstrelas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean eCincoEstrelas() {
        return eCincoEstrelas;
    }

    public void seteCincoEstrelas(boolean eCincoEstrelas) {
        this.eCincoEstrelas = eCincoEstrelas;
    }


}
