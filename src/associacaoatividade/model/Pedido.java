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
public class Pedido {
    public int numero;
    public String data;
    public double valor;
    
    public Pedido(int numero, String data, double valor){
        this.numero = numero;
        this.data = data;
        this.valor = valor;
    }
}
