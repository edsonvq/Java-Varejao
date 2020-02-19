/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author Usuário-ETEC
 */
public class Produto {
    String nome;
    Double qnt;

    public Produto(String nome, Double qnt) {
        this.nome = nome;
        this.qnt = qnt;
    }

    public Produto() {
    }

    public String getNome() {
        return nome;
    }

    public Double getQnt() {
        return qnt;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQnt(Double qnt) {
        this.qnt = qnt;
    }
}
