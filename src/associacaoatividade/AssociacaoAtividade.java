
package associacaoatividade;

import associacaoatividade.model.Cliente;
import associacaoatividade.model.Pedido;

/**
 *
 * @author Rony
 */
public class AssociacaoAtividade {

  
    public static void main(String[] args) {
      Pedido ped = new Pedido(10,"15/05/2019",20.50);
      Cliente c = new Cliente(456,550.50,1000.0,"Rony","Angelim",ped);
      
      c.listarPedidos(ped);
      
     
    }
    
}
