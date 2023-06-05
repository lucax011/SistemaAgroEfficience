package beans;

public class Record {
    private int id;
    private String atendente;
    private String diaSemana;
    private String horaDia;
    private String tipoServico;
    private double preco;

    public Record(int id, String atendente, String diaSemana, String horaDia, String tipoServico, double preco) {

        this.id = id;
        this.atendente = atendente;
        this.diaSemana = diaSemana;
        this.horaDia = horaDia;
        this.tipoServico = tipoServico;
        this.preco = preco;
    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getDiaSemana() {

        return diaSemana;

    }

    public void setDiaSemana(String diaSemana) {

        this.diaSemana = diaSemana;

    }

    public String getHoraDia() {

        return horaDia;

    }

    public void setHoraDia(String horaDia) {

        this.horaDia = horaDia;

    }

    public String getAtendente() {

        return atendente;

    }

    public void setAtendente(String atendente) {

        this.atendente = atendente;

    }

    public String getTipoServico() {

        return tipoServico;

    }

    public void setTipoServico(String tipoServico) {

        this.tipoServico = tipoServico;

    }

    public double getPreco() {

        return preco;

    }

    public void setPreco(double preco) {

        this.preco = preco;

    }
}
