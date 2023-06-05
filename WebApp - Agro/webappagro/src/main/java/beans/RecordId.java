package beans;

public class RecordId {
    private int atendente;
    private int diaSemana;
    private int horaDia;
    private int tipoServico;

    public RecordId(int atendente, int diaSemana, int horaDia, int tipoServico) {

        this.atendente = atendente;
        this.diaSemana = diaSemana;
        this.horaDia = horaDia;
        this.tipoServico = tipoServico;

    }

    public int getDiaSemana() {

        return diaSemana;

    }

    public void setDiaSemana(int diaSemana) {

        this.diaSemana = diaSemana;

    }

    public int getHoraDia() {

        return horaDia;

    }

    public void setHoraDia(int horaDia) {

        this.horaDia = horaDia;

    }

    public int getAtendente() {

        return atendente;

    }

    public void setAtendente(int atendente) {

        this.atendente = atendente;

    }

    public int getTipoServico() {

        return tipoServico;

    }

    public void setTipoServico(int tipoServico) {

        this.tipoServico = tipoServico;

    }
}
