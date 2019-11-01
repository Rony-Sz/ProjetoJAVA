/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associacaoatividade.model;

/**
 *
 * @author Rony
 */
public class Vendedor extends Pessoa {
    public int regFuncio;
    public double taxaComissao;
    Pedido pedido;
   
    public Vendedor(int regFuncio, double taxaComissao, String nome, String endereco, Pedido pedido) {
        super(nome, endereco);
        this.regFuncio = regFuncio;
        this.taxaComissao = taxaComissao;
        this.pedido = pedido;
    }
    
    public void listarPedidos(Pedido pedido){ 
        System.out.println("Número do pedido: "+pedido.numero);
        System.out.println("Data: "+pedido.data);
        System.out.println("Valor: "+pedido.valor);
    }
    
    
}
