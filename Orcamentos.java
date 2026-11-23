package model;

import java.time.LocalDate;

public class Orcamentos {

    private int idOrcamento;
    private LocalDate dtAprovacao;
    private int idEngenheiroResponsavel;

    public int getIdOrcamento() {
        return idOrcamento;
    }

    public void setIdOrcamento(int idOrcamento) {
        this.idOrcamento = idOrcamento;
    }

    public LocalDate getDtAprovacao() {
        return dtAprovacao;
    }

    public void setDtAprovacao(LocalDate dtAprovacao) {
        this.dtAprovacao = dtAprovacao;
    }

    public int getIdEngenheiroResponsavel() {
        return idEngenheiroResponsavel;
    }

    public void setIdEngenheiroResponsavel(int idEngenheiroResponsavel) {
        this.idEngenheiroResponsavel = idEngenheiroResponsavel;
    }
}