package br.com.fabiotavares.reportcard;

import java.text.DecimalFormat;

public class ReportCard {

    private String nomeAluno;
    private int matematica;
    private int portugues;
    private int ciencia;
    private int geografia;
    private int historia;

    public ReportCard() {
    }

    public ReportCard(String nomeAluno, int matematica, int portugues, int ciencia, int geografia, int historia) {
        this.nomeAluno = nomeAluno;
        this.matematica = matematica;
        this.portugues = portugues;
        this.ciencia = ciencia;
        this.geografia = geografia;
        this.historia = historia;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getMatematica() {
        return matematica;
    }

    public void setMatematica(int matematica) {
        this.matematica = matematica;
    }

    public int getPortugues() {
        return portugues;
    }

    public void setPortugues(int portugues) {
        this.portugues = portugues;
    }

    public int getCiencia() {
        return ciencia;
    }

    public void setCiencia(int ciencia) {
        this.ciencia = ciencia;
    }

    public int getGeografia() {
        return geografia;
    }

    public void setGeografia(int geografia) {
        this.geografia = geografia;
    }

    public int getHistoria() {
        return historia;
    }

    public void setHistoria(int historia) {
        this.historia = historia;
    }

    public float getMedia(){
        float soma = matematica + portugues + ciencia + geografia + historia;
        return soma/5;
    }

    @Override
    public String toString() {
        return "Aluno: " + nomeAluno +
                ", Notas Individuais {Matemática:" + matematica +
                ", Português:" + portugues +
                ", Ciência:" + ciencia +
                ", Geografia:" + geografia +
                ", História:" + historia +
                "}, Media: " + String.format("%.2f",getMedia());
    }
}
