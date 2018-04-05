/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Enum;

/**
 *
 * @author eduarda.178517
 */
public enum ProdutosPreCadastrados {
    
    Panela (2525, "Panela", "Tramontina", 55.00,'a'),
    ToalhasdeBanho (2552, "Toalha de Banho", "Algodão", 30.00,'a'),
    Microondas (2521, "Micro-ondas", "Eletrolux", 170.00,'a'),
    Travesseiro (2898, "Travesseiro", "Nasa", 59.00,'a'),
    Notbook (3454, "Notbook", "Dell", 2870.00,'a'),
    Televisao (2590, "Televisão", "Sansung", 1700.00,'a'),
    GuardaRoupa (2587, "Guarda Roupa", "Itatiaia", 520.00,'a'),
    Geladeira (2568, "Geladeira", "Tramontina", 1800.00,'i'),
    ArCondiconado (2500, "Ar-condicionado", "Komeco", 1800.00,'i'),
    Cama (2599, "Cama", "Cama Box",1700.00,'i');

    private int id;
    private String nome;
    private String descricao;
    private double valor;
    private char status;

    private ProdutosPreCadastrados(int id, String nome, String descricao, double valor, char status) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }
 
     
    

    public static ProdutosPreCadastrados getPanela() {
        return Panela;
    }

    public static ProdutosPreCadastrados getToalhasdeBanho() {
        return ToalhasdeBanho;
    }

    public static ProdutosPreCadastrados getMicroondas() {
        return Microondas;
    }

    public static ProdutosPreCadastrados getTravesseiro() {
        return Travesseiro;
    }

    public static ProdutosPreCadastrados getNotbook() {
        return Notbook;
    }

    public static ProdutosPreCadastrados getTelevisao() {
        return Televisao;
    }

    public static ProdutosPreCadastrados getGuardaRoupa() {
        return GuardaRoupa;
    }

    public static ProdutosPreCadastrados getGeladeira() {
        return Geladeira;
    }

    public static ProdutosPreCadastrados getArCondiconado() {
        return ArCondiconado;
    }

    public static ProdutosPreCadastrados getCama() {
        return Cama;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public char getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Menu{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", status=" + status + '}';
    }
    


}
