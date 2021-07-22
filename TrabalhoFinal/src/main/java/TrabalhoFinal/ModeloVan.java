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
public enum ModeloVan {
    KOMBI(1), SPRINTER(2), TRAFFIC(3);
    
    private int valor;
    
    private ModeloVan(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    
}
