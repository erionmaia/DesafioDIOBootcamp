package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {
    private String nomeAluno;
    private String nomeCurso;
    private int cargaHorariaCurso;
    private LocalDate dataConclusao;

    public Certificado() {

    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCargaHorariaCurso() {
        return cargaHorariaCurso;
    }

    public void setCargaHorariaCurso(int cargaHorariaCurso) {
        this.cargaHorariaCurso = cargaHorariaCurso;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    @Override
    public String toString() {
        return "Certificado{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", cargaHorariaCurso=" + cargaHorariaCurso +
                ", dataConclusao=" + dataConclusao +
                '}';
    }

    public Certificado(String nomeAluno, String nomeCurso, int cargaHorariaCurso, LocalDate dataConclusao) {
        this.nomeAluno = nomeAluno;
        this.nomeCurso = nomeCurso;
        this.cargaHorariaCurso = cargaHorariaCurso;
        this.dataConclusao = dataConclusao;
    }

    public void GerarCertificado() {
        System.out.println("O Aluno " + nomeAluno + " concluiu o curso de " + nomeCurso + " com carga horária de "
                + cargaHorariaCurso + " horas\n João Pessoa/PB, " + dataConclusao);
    }
}
