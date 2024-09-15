package project.generation.desafio.aws.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "aluno")
public class AlunoModel {
    @Id
    public Integer id;
    @Column(nullable = false, length = 50)
    public String nome;
    @Column(nullable = false, length = 5)
    public Float notaPrimeiroSemestre;
    @Column(nullable = false, length = 5)
    public Float notaSegundoSemestre;
    @Column(nullable = false, length = 50)
    public String nomeProfessor;
    @Column(nullable = false, length = 2)
    public Integer sala;

    public Integer getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public  String getNome() {
        return nome;
    }

    public void setNome() {
        this.nome = nome;
    }

    public Float getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }

    public void setNotaPrimeiroSemestre() {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }

    public Float getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }

    public void setNotaSegundoSemestre() {
        this.notaSegundoSemestre = notaSegundoSemestre;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor() {
        this.nomeProfessor = nomeProfessor;
    }

    public Integer getSala() {
        return sala;
    }

    public void setSala() {
        this.sala = sala;
    }
}
