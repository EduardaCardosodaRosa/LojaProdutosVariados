/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.satc;

import br.edu.satc.Enum.Menu;
import br.edu.satc.Enum.ProdutosPreCadastrados;
import br.edu.satc.Objetos.Cliente;
import br.edu.satc.Objetos.Produto;
import br.edu.satc.Objetos.Venda;
import com.sun.org.apache.bcel.internal.generic.FLOAD;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author eduarda.178517
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();
     
        for (ProdutosPreCadastrados p  : ProdutosPreCadastrados.values()) {
            produtos.add(new Produto(p.getId(), p.getNome(),p.getDescricao(),p.getValor(),p.getStatus()));
            
        }
        
        
        String menu = "";
        for (Menu m  : Menu.values()) {
            menu += m.getEscolhaOpcao() + "  " + m.getNomeOpc() + "\n";
            
        }
        
        int escMenu=0;
        
        do{
          escMenu =  Integer.parseInt(JOptionPane.showInputDialog(menu));
          
          switch(escMenu){
              case 1:{
                  do{
                     int ID= Integer.parseInt(JOptionPane.showInputDialog("Indique o ID do cliente: "));
                     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                     Date dataCadastro= sdf.parse(JOptionPane.showInputDialog("Informe a data de cadastro: "));
                     char status = JOptionPane.showInputDialog("Informe o status: ").charAt(0);
                     String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente: ");
                     String rgCliente= JOptionPane.showInputDialog("Informe o rg do cliente: ");
                     String cpfCliente = JOptionPane.showInputDialog("Informe o cpf do cliente: ");
                     Date dataNascimentoCliente = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do cliente: "));
                     
                  }while((JOptionPane.showConfirmDialog(null, "Deseja continuar? "))==0);
                  break;
              }
              
              case 2: {
                   int IDProduto = Integer.parseInt(JOptionPane.showInputDialog("Indique o ID do produto: "));
                   String nomeProduto = JOptionPane.showInputDialog("Informe o nome do produto: ");
                    String descricaoProduto = JOptionPane.showInputDialog("Informe a descriçao do produto: ");
                    double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto: "));
                     char statusProduto = JOptionPane.showInputDialog("Informe o status do produto: ").charAt(0);
                     
                     break;
              }
              
              case 3: {
                  
                  String clienteVenda = JOptionPane.showInputDialog("Informe o cliente da venda: ");
                  float totalAPagar = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor total a pagar: "));
                  char statusVenda = JOptionPane.showInputDialog("Informe o status da venda: ").charAt(0);
                  int IDVenda = Integer.parseInt(JOptionPane.showInputDialog("Indique o ID da venda: "));
                  
                  break;
              
              }
              
              case 4: {
              
                  int pesquisarCliente = Integer.parseInt(JOptionPane.showInputDialog("Qual cliente você deseja pesquisarr? "));
                   clientes.get(pesquisarCliente);
                   JOptionPane.showConfirmDialog(null, clientes.get(pesquisarCliente).toString());
                   
                   break;
              
              }
                   case 5:{
                       int pesquisarProduto = Integer.parseInt(JOptionPane.showInputDialog("Qual produto você desejsa pesquisar? "));
                       produtos.get(pesquisarProduto);
                       JOptionPane.showConfirmDialog(null, produtos.get(pesquisarProduto));
                       
                       break;
                   
                   }
                   
                   case 6 : {
                       
                       int pesquisarVenda = Integer.parseInt(JOptionPane.showInputDialog("Qual venda você deseja pesquisar? "));
                       vendas.get(pesquisarVenda);
                       JOptionPane.showConfirmDialog(null,vendas.get(pesquisarVenda));
                       
                       break;
                   }
                       case 7 :{
                       String produto = "";
                       for (ProdutosPreCadastrados m : ProdutosPreCadastrados.values()) {
                           produto += m.getNome() + "\n";
                       }
                       JOptionPane.showMessageDialog(null,produtos);
                   
                   }
                   
                   }
                   
                   
              
              
              
              
              
          
          
          
                    
        
        
        }while (escMenu!=8);           
        }
            
        }
        
        
        
        
        
        
    


