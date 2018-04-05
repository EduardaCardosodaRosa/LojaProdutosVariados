/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc.Enum;

import java.util.ArrayList;

/**
 *
 * @author eduarda.178517
 */
public enum Menu {
    
    
    CadastrarCliente(1),
    CadastrarProduto(2),
    CadastrarVenda(3),
    PesquisarCliente(4),
    PesquisarProduto(5),
    PesquisarVenda(6),
    Sair(7);
    
    private int escolhaOpcao;

    private Menu(int escolhaOpcao) {
        this.escolhaOpcao = escolhaOpcao;
    }

    public static Menu getCadastrarCliente() {
        return CadastrarCliente;
    }

    public static Menu getCadastrarProduto() {
        return CadastrarProduto;
    }

    public static Menu getCadastrarVenda() {
        return CadastrarVenda;
    }

    public static Menu getPesquisarCliente() {
        return PesquisarCliente;
    }

    public static Menu getPesquisarProduto() {
        return PesquisarProduto;
    }

    public static Menu getPesquisarVenda() {
        return PesquisarVenda;
    }

    public static Menu getSair() {
        return Sair;
    }

    public int getEscolhaOpcao() {
        return escolhaOpcao;
    }

    @Override
    public String toString() {
        return "Menu{" + "escolhaOpcao=" + escolhaOpcao + '}';
    }
    

    
    
    
    
     
    
}
