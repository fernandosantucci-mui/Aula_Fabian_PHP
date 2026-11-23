package model;

public class Obrasfases {
    
    private int idObra;
    private int idFase;
    private String dtInicioFase; // Usando String para manter o mesmo padrão que usou antes (ou java.sql.Date se preferir)
    private String dtTerminoFase;

    // Getters e Setters
    
    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public int getIdFase() {
        return idFase;
    }

    public void setIdFase(int idFase) {
        this.idFase = idFase;
    }

    public String getDtInicioFase() {
        return dtInicioFase;
    }

    public void setDtInicioFase(String dtInicioFase) {
        this.dtInicioFase = dtInicioFase;
    }

    public String getDtTerminoFase() {
        return dtTerminoFase;
    }

    public void setDtTerminoFase(String dtTerminoFase) {
        this.dtTerminoFase = dtTerminoFase;
    }
}