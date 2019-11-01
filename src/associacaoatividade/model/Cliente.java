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
public class Cliente extends Pessoa {
    public int codigo;
    public double limiteCredito;
    public double limiteDisponivel;
    Pedido pedido;
    
    
    public Cliente(int codigo, double limiteCredito, double limiteDisponivel, String nome, String endereco, Pedido pedido){
    super(nome, endereco);
    this.codigo = codigo;
    this.limiteCredito = limiteCredito;
    this.limiteDisponivel = limiteDisponivel; 
    this.pedido = pedido;
    }
    
   
    public void listarPedidos(Pedido pedido){ 
        System.out.println("Número do pedido: "+pedido.numero);
        System.out.println("Data: "+pedido.data);
        System.out.println("Valor: "+pedido.valor);
    }
}
