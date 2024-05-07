/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.AlunoDAO;
import java.util.ArrayList;

/**
 *
 * @author 10724112106
 */
public class Aluno extends Pessoa {

    private String curso;
    private int fase;
    AlunoDAO dao;

    public Aluno() {
        this(0, "", 0, "", 0);
    }

    public Aluno(int id, String nome, int idade, String curso, int fase) {
        super(id, nome, idade);
        this.curso = curso;
        this.fase = fase;
        dao = new AlunoDAO();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\n Curso: " + this.getCurso()
                + "\n Fase: " + this.getFase()
                + "\n -----------";
    }

    public ArrayList<Aluno> getMinhaLista() {
        return dao.getMinhalista();
    }

    public boolean InsertAlunoBD(String nome, int idade, String curso, int fase) {
        int id = dao.maiorID()+1;
        Aluno objeto = new Aluno(id,nome,idade,curso,fase);
        dao.insertAlunoBD(objeto);
        return true;
    }

    public boolean DeleteAlunoBD(int id) {
        dao.deleteAlunoBD(id);
        return true;
    }

    public boolean UpdateAlunoBD(int id, String nome, int idade, String curso, int fase) {
        Aluno objeto = new Aluno(id,nome,idade,curso,fase);
        dao.updateAlunoBD(objeto);
        return true;
    }
    public Aluno carregaAluno(int id){
        return dao.carregaAluno(id);
    }
}
