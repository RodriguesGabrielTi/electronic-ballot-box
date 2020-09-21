/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author santi
 */
public class Chapa {
    private int numero,quantVotos;

    public int getQuantVotos() {
        return quantVotos;
    }

    public void setQuantVotos(int quantVotos) {
        this.quantVotos = quantVotos;
    }
    private String nome,funcao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
