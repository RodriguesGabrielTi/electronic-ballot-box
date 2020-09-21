
package model.bean;


public class Eleitor {
    private int matricula,confVoto;
    private String nome,curso,serie;
    

    public int getConfVoto() {
        return confVoto;
    }

    public void setConfVoto(int confVoto) {
        this.confVoto = confVoto;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
