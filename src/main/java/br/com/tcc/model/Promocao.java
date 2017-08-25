/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.model;

/**
 *
 * @author Bruno
 */
public class Promocao{
    private long id;
    private String descricao;
    private String preco;

    public Promocao(String descricao, String preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
    
    
    
}
