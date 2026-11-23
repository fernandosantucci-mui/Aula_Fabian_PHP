package model;

public class ManutencaoDeFases {
    
    private int idFase;
    private int idObra; // Chave estrangeira ligando à tabela de Obras
    private String nomeFase;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String statusFase; // Ex: "Em andamento", "Concluída", "Atrasada"

    // Getters e Setters
    public int getIdFase() {
        return idFase;
    }

    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getNomeFase() {
        return nomeFase;
    }

    public void setNomeFase(String nomeFase) {
        this.nomeFase = nomeFase;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatusFase() {
        return statusFase;
    }

    public void setStatusFase(String statusFase) {
        this.statusFase = statusFase;
    }
}