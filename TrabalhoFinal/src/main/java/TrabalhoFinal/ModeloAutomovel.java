/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabalhoFinal;

/**
 *
 * @author Rafael
 */
public enum ModeloAutomovel {
    GOL(1), CELTA (2), PALIO(3);
   
    private int valor;
    
    private ModeloAutomovel(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
}
